package com.example.zajecia34.service;

import com.example.zajecia34.domain.Driver;
import com.example.zajecia34.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverService {

    private final DriverRepository driverRepository;

    public boolean hasMorePointsInLastYearThanAllowed(long id) {
        driverRepository.findById(id).orElELELELEL
    }
}
