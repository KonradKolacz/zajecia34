package com.example.zajecia34.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {

    private Long id;
    private String name;
    private String nickname;
    private String pesel;
    private String email;
}
