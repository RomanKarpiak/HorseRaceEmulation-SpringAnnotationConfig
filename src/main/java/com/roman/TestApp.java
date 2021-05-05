package com.roman;

import com.roman.config.JavaConfig;
import com.roman.service.EmulationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                JavaConfig.class);
        EmulationService emulationRace = context.getBean(EmulationService.class);
        emulationRace.emulate();
        context.close();
    }
}
