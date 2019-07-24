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
public class Company extends BaseEntity{

    @NotNull
    private String name;

    @NotNull
    @Column(unique = true)
    private int EDRPOU;

    @NotNull
    private String contactPhone;

    private String contactPhone2;

    @OneToMany(mappedBy="company", cascade = CascadeType.ALL)
    @Column(unique = true)
    private List<Gym> gyms;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private User user;



}
