package com.fitgoal.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class SportType extends BaseEntity{

    @NotNull
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Coach> coaches;

}
