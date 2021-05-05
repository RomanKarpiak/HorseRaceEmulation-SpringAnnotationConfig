package com.roman.service;

import com.roman.domain.Horse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorseServiceImpl implements HorseService {

    private final List<Horse> horsesList;

    @Autowired
    public HorseServiceImpl(List<Horse> horsesList) {
        this.horsesList = horsesList;
    }

    @Override
    public List<Horse> getHorsesList() {
        return horsesList;
    }

}
