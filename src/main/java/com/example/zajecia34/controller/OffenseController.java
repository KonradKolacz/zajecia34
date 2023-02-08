package com.example.zajecia34.controller;

import com.example.zajecia34.command.OffenseCommand;
import com.example.zajecia34.domain.Offense;
import com.example.zajecia34.dto.OffenseDto;
import com.example.zajecia34.service.OffenseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/offenses")
public class OffenseController {

    private final ModelMapper modelMapper;
    private final OffenseService offenseService;

    @PostMapping
    public ResponseEntity<OffenseDto> add(OffenseCommand offenseCommand){
        return new ResponseEntity<>(modelMapper.map(offenseService.save(modelMapper.map(offenseCommand, Offense.class)), OffenseDto.class), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OffenseDto> update(@PathVariable Long id , OffenseCommand offenseCommand){
        return new ResponseEntity<>(modelMapper.map(offenseService.update(id, modelMapper.map(offenseCommand, Offense.class)), OffenseDto.class), HttpStatus.CREATED);

    }
}
