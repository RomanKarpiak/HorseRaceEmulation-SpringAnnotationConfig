package com.roman.config;

import com.roman.domain.Breed;
import com.roman.domain.Horse;
import com.roman.domain.Rider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.roman")
@PropertySource("application.properties")
public class JavaConfig {
    @Bean
    public Rider rider1() {
        Rider rider = new Rider();
        rider.setRiderName("Rider1");
        return rider;
    }

    @Bean
    public Rider rider2() {
        Rider rider = new Rider();
        rider.setRiderName("Rider2");
        return rider;
    }

    @Bean
    public Rider rider3() {
        Rider rider = new Rider();
        rider.setRiderName("Rider3");
        return rider;
    }

    @Bean
    public Rider rider4() {
        Rider rider = new Rider();
        rider.setRiderName("Rider4");
        return rider;
    }

    @Bean
    public Rider rider5() {
        Rider rider = new Rider();
        rider.setRiderName("Rider5");
        return rider;
    }
    @Bean
    public Rider rider6() {
        Rider rider = new Rider();
        rider.setRiderName("Rider6");
        return rider;
    }

    @Bean
    public Horse horse1() {
        Horse horse = new Horse();
        horse.setHorseName("Horse1");
        horse.setRider(rider1());
        horse.setBreed(Breed.BREED1);
        horse.setDistance(0);
        return horse;
    }

    @Bean
    public Horse horse2() {
        Horse horse = new Horse();
        horse.setHorseName("Horse2");
        horse.setRider(rider2());
        horse.setBreed(Breed.BREED1);
        horse.setDistance(0);
        return horse;
    }

    @Bean
    public Horse horse3() {
        Horse horse = new Horse();
        horse.setHorseName("Horse3");
        horse.setRider(rider3());
        horse.setBreed(Breed.BREED3);
        horse.setDistance(0);
        return horse;
    }

    @Bean
    public Horse horse4() {
        Horse horse = new Horse();
        horse.setHorseName("Horse4");
        horse.setRider(rider5());
        horse.setBreed(Breed.BREED1);
        horse.setDistance(0);
        return horse;
    }

    @Bean
    public Horse horse5() {
        Horse horse = new Horse();
        horse.setHorseName("Horse5");
        horse.setRider(rider4());
        horse.setBreed(Breed.BREED2);
        horse.setDistance(0);
        return horse;
    }
    @Bean
    public Horse horse6() {
        Horse horse = new Horse();
        horse.setHorseName("Horse6");
        horse.setRider(rider6());
        horse.setBreed(Breed.BREED3);
        horse.setDistance(0);
        return horse;
    }
}
