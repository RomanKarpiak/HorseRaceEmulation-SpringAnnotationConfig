package com.roman.service;

import com.roman.domain.Horse;
import com.roman.domain.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

    public List<Horse> generateHorsesListInRace () {
        int randomNumOfHorse;
        int count = 0;
        List<Horse> horsesListInRace = new ArrayList<>();
        while (count != this.numOfHorsesInRace) {
            randomNumOfHorse = (int) (Math.random() * horseService.getHorsesList().size());
            if (!horsesListInRace.contains(horseService.getHorsesList().get(randomNumOfHorse))) {
                horsesListInRace.add(horseService.getHorsesList().get(randomNumOfHorse));
                count++;
            }
        }
        horsesListInRace.sort(Comparator.comparing(Horse::getHorseName));
       return horsesListInRace;
    }
}
