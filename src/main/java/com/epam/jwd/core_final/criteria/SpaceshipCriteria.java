package com.epam.jwd.core_final.criteria;

import com.epam.jwd.core_final.domain.Role;
import com.epam.jwd.core_final.domain.Spaceship;

import java.util.Map;

/**
 * Should be a builder for {@link Spaceship} fields
 */
public class SpaceshipCriteria extends Criteria<Spaceship> {

    private final String name;
    private final long flightDistance;
    private Map<Role, Short> crew;
    private boolean isReadyForNextMissions;

    private SpaceshipCriteria(String name, long flightDistance, Map<Role, Short> crew, boolean isReadyForNextMissions) {
        this.name = name;
        this.flightDistance = flightDistance;
        this.crew = crew;
        this.isReadyForNextMissions = isReadyForNextMissions;
    }

    public String getName() {
        return name;
    }

    public long getFlightDistance() {
        return flightDistance;
    }

    public Map<Role, Short> getCrew() {
        return crew;
    }

    public boolean isReadyForNextMissions() {
        return isReadyForNextMissions;
    }

    public SpaceshipCriteriaBuilder builder() {
        return new SpaceshipCriteriaBuilder();
    }

    public static class SpaceshipCriteriaBuilder {
        private String name;
        private long flightDistance;
        private Map<Role, Short> crew;
        private boolean isReadyForNextMissions;

        public SpaceshipCriteriaBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SpaceshipCriteriaBuilder flightDistance(long flightDistance) {
            this.flightDistance = flightDistance;
            return this;
        }

        public SpaceshipCriteriaBuilder crew(Map<Role, Short> crew) {
            this.crew = crew;
            return this;
        }

        public SpaceshipCriteriaBuilder isReadyForNextMissions(boolean isReadyForNextMissions) {
            this.isReadyForNextMissions = isReadyForNextMissions;
            return this;
        }

        public SpaceshipCriteria build() {
            return new SpaceshipCriteria(
                    this.name,
                    this.flightDistance,
                    this.crew,
                    this.isReadyForNextMissions
            );
        }
    }
}
