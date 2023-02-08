package com.example.zajecia34.command;

import com.example.zajecia34.domain.Driver;
import com.example.zajecia34.domain.Offense;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MandateCommand {

    private List<Offense> offenses;
    private Driver driver;
    private LocalDate date;
}
