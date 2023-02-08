package com.example.zajecia34.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OffenseDto {

    private Long id;
    private String name;
    private double cash;
    private int points;
}
