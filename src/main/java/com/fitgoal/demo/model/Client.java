package com.fitgoal.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Client extends Person{

    @OneToMany(mappedBy="client", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

}
