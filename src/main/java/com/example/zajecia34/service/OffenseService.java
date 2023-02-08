package com.example.zajecia34.service;

import com.example.zajecia34.domain.Offense;
import com.example.zajecia34.exception.ObjectNotFoundException;
import com.example.zajecia34.repository.OffenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OffenseService {

    private final OffenseRepository offenseRepository;

    public Offense save(Offense offense){
        return offenseRepository.save(offense);
    }

    @Transactional
    public Offense update(Long id, Offense offense){
        Offense offenseToUpdate = offenseRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id, Offense.class.getName()));
        offenseToUpdate.setName(offense.getName());
        offenseToUpdate.setCash(offense.getCash());
        offenseToUpdate.setPoints(offense.getPoints());
        return offenseToUpdate;
    }
}
