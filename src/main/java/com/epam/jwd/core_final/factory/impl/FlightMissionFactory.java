package com.epam.jwd.core_final.factory.impl;

import com.epam.jwd.core_final.domain.CrewMember;
import com.epam.jwd.core_final.domain.FlightMission;
import com.epam.jwd.core_final.domain.Planet;
import com.epam.jwd.core_final.domain.Spaceship;
import com.epam.jwd.core_final.exception.InvalidStateException;
import com.epam.jwd.core_final.factory.EntityFactory;

import java.time.LocalDateTime;
import java.util.List;

public class FlightMissionFactory implements EntityFactory<FlightMission> {
    private static FlightMissionFactory instance;
    private com.epam.jwd.core_final.domain.Planet Planet;

    private FlightMissionFactory() {

    }

    public static FlightMissionFactory getInstance() {
        if (null == instance) {
            instance = new FlightMissionFactory();
        }
        return instance;
    }


    @Override
    public FlightMission create(Object... args) throws InvalidStateException {
        if (args == null) {
            throw new InvalidStateException("There are no arguments in factory to make an entity");
        } else if (args.length != 8) {
            throw new InvalidStateException("There are not enough or more then needed arguments to make an entity");
        } else {
            return new FlightMission(
                    (String) args[0],
                    (Planet) args[1],
                    (Planet) args[2],
                    (LocalDateTime) args[3],
                    (Spaceship) args[4],
                    (List<CrewMember>) args[5]
            );
        }
    }
}
    FlightMission(String missionName, Planet fromPlanet, Planet toPlanet, LocalDateTime startDate,
                  LocalDateTime endDate, int distance, Spaceship assignedSpaceShip,
                  List<CrewMember> assignedCrew) {