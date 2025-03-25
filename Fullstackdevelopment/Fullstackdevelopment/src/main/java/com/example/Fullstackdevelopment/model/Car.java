package com.example.Fullstackdevelopment.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Cars")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Modelname;
    private String color;
    private String Company;
}
