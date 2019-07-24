package com.fitgoal.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Feedback extends BaseEntity{

    @Column(columnDefinition = "TEXT")
    private String text;
    @Column(name = "time_feedback")
    private LocalDate postedAt;

//  TODO fix it
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="client_id", nullable=false)
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="gym_id", nullable=false)
    private Gym gym;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="coach_id", nullable=false)
    private Coach coach;

}
