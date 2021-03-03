package com.epam.jwd.core_final.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Map;

/**
 * crew {@link java.util.Map<Role, Short>}
 * flightDistance {@link Long} - total available flight distance
 * isReadyForNextMissions {@link Boolean} - true by default. Set to false, after first failed mission
 */
@EqualsAndHashCode
@ToString
public class Spaceship extends AbstractBaseEntity {
    //todo
    private final String name;
    private final long flightDistance;
    private final Map<Role, Short> crew;
    private boolean isReadyForNextMissions;

    public Spaceship(String name, long flightDistance, Map<Role, Short> crew) {
        this.name = name;
        this.flightDistance = flightDistance;
        this.crew = crew;
        this.isReadyForNextMissions = true;
    }

    public Map<Role, Short> getCrew() {
        return crew;
    }

    public long getFlightDistance() {
        return flightDistance;
    }

    public void setReadyForNextMissions(boolean isReadyForNextMissions) {
        this.isReadyForNextMissions = isReadyForNextMissions;
    }

    public boolean isReadyForNextMissions() {
        return isReadyForNextMissions;
    }

}
