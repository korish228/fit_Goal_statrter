package com.fitgoal.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Coach extends Person{

    @NotNull
    private String description;

    @Column(columnDefinition = "TEXT")
    private String linkCalendar;

    @OneToMany(mappedBy="coach", cascade = CascadeType.ALL)
    private List<WorkRequest> workRequests;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<SportType> sportTypes;

    @OneToMany(mappedBy="coach",cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

}
