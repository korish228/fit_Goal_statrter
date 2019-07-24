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
public class Gym extends BaseEntity{


    @NotNull
    private String name;

    @NotNull
    private String contactPhone;

    private String contactPhone2;

    @NotNull
    @Column(columnDefinition = "TEXT")
    private String description;

    @NotNull
    private String linkCalendar;

    @NotNull
    private String linkPhotos;

    @NotNull
    private String address;

    @NotNull
    @OneToMany(mappedBy="gym",cascade = CascadeType.ALL)
    private List<WorkRequest> workRequests;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="company_id", nullable=false)
    private Company company;


    @OneToMany(mappedBy="gym",cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;


}
