package com.fitgoal.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
public abstract class BaseEntity  {

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @NotNull
    @Column(columnDefinition = "boolean default false")
    private boolean active;
}
