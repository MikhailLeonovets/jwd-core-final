package com.epam.jwd.core_final.criteria;

import com.epam.jwd.core_final.domain.CrewMember;
import com.epam.jwd.core_final.domain.Rank;
import com.epam.jwd.core_final.domain.Role;

/**
 * Should be a builder for {@link com.epam.jwd.core_final.domain.CrewMember} fields
 */
public class CrewMemberCriteria extends Criteria<CrewMember> {

    private final String name;
    private final Role role;
    private final Rank rank;
    private boolean isReadyForNextMissions;

    private CrewMemberCriteria(Role role, String name, Rank rank) {
        this.role = role;
        this.name = name;
        this.rank = rank;
        this.isReadyForNextMissions = true;
    }

    public CrewMemberCriteriaBuilder builder() {
        return new CrewMemberCriteriaBuilder();
    }

    public Role getRole() {
        return role;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return rank;
    }

    public boolean isReadyForNextMissions() {
        return isReadyForNextMissions;
    }

    public static class CrewMemberCriteriaBuilder {
        private String name;
        private Role role;
        private Rank rank;
        private boolean isReadyForNextMissions;

        public CrewMemberCriteriaBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CrewMemberCriteriaBuilder role(Role role) {
            this.role = role;
            return this;
        }

        public CrewMemberCriteriaBuilder rank(Rank rank) {
            this.rank = rank;
            return this;
        }

        public CrewMemberCriteriaBuilder isReadyForNextMission(boolean isReadyForNextMissions) {
            this.isReadyForNextMissions = isReadyForNextMissions;
            return this;
        }

        public CrewMemberCriteria build() {
            return new CrewMemberCriteria(this.role, this.name, this.rank);
        }
    }
}
