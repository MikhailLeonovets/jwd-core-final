package com.epam.jwd.core_final.service.impl;

import com.epam.jwd.core_final.domain.Planet;
import com.epam.jwd.core_final.service.SpacemapService;

public class SpacemapServiceApp implements SpacemapService {
    private static SpacemapServiceApp instance;

    private SpacemapServiceApp(){

    }

    public static SpacemapServiceApp getInstance(){
        if (null == instance){
            instance = new SpacemapServiceApp();
        }
        return instance;
    }

    @Override
    public Planet getRandomPlanet() {
        return null;
    }

    @Override
    public int getDistanceBetweenPlanets(Planet first, Planet second) {
        return (int) Math.sqrt(Math.pow(second.getX() - first.getX(), 2) +
                Math.pow(second.getY() - first.getY(), 2));
    }
}
