package com.fitgoal.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
public abstract class Person extends BaseEntity {

    @NotNull
    private String firstName;
    @NotNull
    private String secondName;
    @NotNull
    private Date birthday;
    @NotNull
    @Column(unique = true)
    private String contactPhone;


    @NotNull
//    @Column(unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private User user;


}
