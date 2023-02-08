package com.example.zajecia34.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverCommand {
    private String name;
    private String nickname;
    private String pesel;
    private String email;
}
