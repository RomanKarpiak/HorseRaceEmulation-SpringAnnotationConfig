package com.roman.service;

import com.roman.domain.Horse;
import com.roman.domain.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RaceServiceImpl implements RaceService {

    @Value("${raceServiceImpl.numOfHorsesInRace}")
    private int numOfHorsesInRace;
    @Value("${raceServiceImpl.distance}")
    private int distance;


    private final HorseService horseService;

    @Autowired
    public RaceServiceImpl(HorseService horseService) {
        this.horseService = horseService;
    }

    public Race getRace() {
        Race race = new Race();
        race.setDistance(distance);
        race.setHorsesList(generateHorsesListInRace());
        return race;
    }

    public List<Horse> generateHorsesListInRace() {
        List<Horse> horsesListInRace = new ArrayList<>();
        List<Horse> horseList = horseService.getHorsesList();
        Collections.shuffle(horseList);
        for (int i = 0; i < numOfHorsesInRace; i++) {
            horsesListInRace.add(horseList.get(i));
        }
        horsesListInRace.sort(Comparator.comparing(Horse::getHorseName));
        return horsesListInRace;
    }
}
