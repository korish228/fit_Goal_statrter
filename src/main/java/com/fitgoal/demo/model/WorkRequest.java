package com.fitgoal.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class WorkRequest extends BaseEntity{


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="gym_id", nullable=false)
    private Gym gym;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="coach_id", nullable=false)
    private Coach coach;

    @NotNull
    @Column(columnDefinition = "boolean default false")
    private boolean approved;
    private boolean decline;


}
