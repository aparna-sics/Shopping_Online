package com.example.EmployeeManagement.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "emp_id",nullable = false)
    private  Long id;
    @Column(name = "emp_name")
    private  String name;
    @Column(name = "emp_age")
    private Integer age;
    @Column(name = "emp_dept")
    private String dept;
    @Column(name = "emp_salary")
    private Long salary;
}
