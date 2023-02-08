package com.example.zajecia34.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Mandate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinTable
    private List<Offense> offenses;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;
    @PastOrPresent
    private LocalDate date;
    private int points = points();
    private double cash = cash();
//    ponizsze przeniesc do serwisu?
    @Value("${mandate.maxPoints}")
    private int maxPoints;
    @Value("${mandate.maxCash}")
    private int maxCash;

    private int points() {
        if (offenses == null) {
            return 0;
        }
        int sum = offenses.stream().mapToInt(Offense::getPoints).sum();
        return sum > maxPoints ? maxPoints : sum;
    }

    private double cash() {
        if (offenses == null) {
            return 0;
        }
        double sum = offenses.stream().mapToDouble(Offense::getCash).sum();
        return sum > maxCash ? maxCash : sum;
    }

    private void addOffense(Offense offense) {
        offenses.add(offense);
        points = points();
        cash = cash();
    }


}
