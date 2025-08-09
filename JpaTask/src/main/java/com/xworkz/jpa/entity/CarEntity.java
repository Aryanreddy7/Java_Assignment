package com.xworkz.jpa.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name = "Car_table")
public class CarEntity {
    @Id
    private int id;
    @Column(name = "name")
    private String carname;

    private int cc;
}
