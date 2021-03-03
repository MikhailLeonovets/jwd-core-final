package com.epam.jwd.core_final.criteria;

import com.epam.jwd.core_final.domain.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Should be a builder for {@link com.epam.jwd.core_final.domain.FlightMission} fields
 */
public class FlightMissionCriteria extends Criteria<FlightMission> {
    private final String missionName;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final int distance;
    private Spaceship assignedSpaceShip;
    private List<CrewMember> assignedCrew;
    private MissionResult missionResult;
    private final Planet fromPlanet;
    private final Planet toPlanet;

    private FlightMissionCriteria(String missionName, Planet fromPlanet, Planet toPlanet, LocalDateTime startDate, int distance, LocalDateTime endDate,
                                  Spaceship assignedSpaceShip, List<CrewMember> assignedCrew, MissionResult missionResult) {
        this.missionName = missionName;
        this.fromPlanet = fromPlanet;
        this.toPlanet = toPlanet;
        this.startDate = startDate;
        this.distance = distance;
        this.endDate = endDate;
        this.assignedSpaceShip = assignedSpaceShip;
        this.assignedCrew = assignedCrew;
        this.missionResult = missionResult;
    }

    public FlightMissionCriteriaBuilder builder() {
        return new FlightMissionCriteriaBuilder();
    }

    public String getMissionName() {
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

    public Planet getFromPlanet() {
        return fromPlanet;
    }

    public Planet getToPlanet() {
        return toPlanet;
    }

    public static class FlightMissionCriteriaBuilder {
        private String missionName;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private int distance;
        private Spaceship assignedSpaceShip;
        private List<CrewMember> assignedCrew;
        private MissionResult missionResult;
        private Planet fromPlanet;
        private Planet toPlanet;

        public FlightMissionCriteriaBuilder missionName(String missionName) {
            this.missionName = missionName;
            return this;
        }

        public FlightMissionCriteriaBuilder startDate(LocalDateTime startDate) {
            this.startDate = startDate;
            return this;
        }

        public FlightMissionCriteriaBuilder endDate(LocalDateTime endDate) {
            this.endDate = endDate;
            return this;
        }

        public FlightMissionCriteriaBuilder distance(int distance) {
            this.distance = distance;
            return this;
        }

        public FlightMissionCriteriaBuilder assignedSpaceShip(Spaceship assignedSpaceShip) {
            this.assignedSpaceShip = assignedSpaceShip;
            return this;
        }

        public FlightMissionCriteriaBuilder assignedCrew(List<CrewMember> assignedCrew) {
            this.assignedCrew = assignedCrew;
            return this;
        }

        public FlightMissionCriteriaBuilder missionResult(MissionResult missionResult) {
            this.missionResult = missionResult;
            return this;
        }

        public FlightMissionCriteriaBuilder fromPlanet(Planet fromPlanet) {
            this.fromPlanet = fromPlanet;
            return this;
        }

        public FlightMissionCriteriaBuilder toPlanet(Planet toPlanet) {
            this.toPlanet = toPlanet;
            return this;
        }

        public FlightMissionCriteria build() {
            return new FlightMissionCriteria(
                    this.missionName,
                    this.fromPlanet,
                    this.toPlanet,
                    this.startDate,
                    this.distance,
                    this.endDate,
                    this.assignedSpaceShip,
                    this.assignedCrew,
                    this.missionResult
            );
        }
    }
}
