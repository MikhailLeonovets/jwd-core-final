package com.epam.jwd.core_final.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Expected fields:
 * <p>
 * missions name {@link String}
 * start date {@link java.time.LocalDate}
 * end date {@link java.time.LocalDate}
 * distance {@link Long} - missions distance
 * assignedSpaceShift {@link Spaceship} - not defined by default
 * assignedCrew {@link java.util.List<CrewMember>} - list of missions members based on ship capacity - not defined by default
 * missionResult {@link MissionResult}
 * from {@link Planet}
 * to {@link Planet}
 */
@EqualsAndHashCode
@ToString
public class FlightMission extends AbstractBaseEntity {
    // todo
    private final String missionName;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final int distance;
    private final Spaceship assignedSpaceShip;
    private final List<CrewMember> assignedCrew;
    private MissionResult missionResult;
    private final Planet fromPlanet;
    private final Planet toPlanet;

    public FlightMission(String missionName, Planet fromPlanet, Planet toPlanet, LocalDateTime startDate,
                         LocalDateTime endDate, int distance, Spaceship assignedSpaceShip,
                         List<CrewMember> assignedCrew) {
        this.missionName = missionName;
        this.fromPlanet = fromPlanet;
        this.toPlanet = toPlanet;
        this.startDate = startDate;
        this.endDate = endDate;
        this.distance = distance;
        this.assignedSpaceShip = assignedSpaceShip;
        this.assignedCrew = assignedCrew;
        this.missionResult = MissionResult.PLANNED;
    }

    public String getMissionsName() {
        return missionName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public int getDistance() {
        return distance;
    }

    public Spaceship getAssignedSpaceShip() {
        return assignedSpaceShip;
    }

    public List<CrewMember> getAssignedCrew() {
        return assignedCrew;
    }

    public MissionResult getMissionResult() {
        return missionResult;
    }

    public void setMissionResult(MissionResult missionResult) {
        this.missionResult = missionResult;
    }

    public Planet getFrom() {
        return fromPlanet;
    }

    public Planet getToPlanet() {
        return toPlanet;
    }

}
