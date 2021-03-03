package com.epam.jwd.core_final.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Expected fields:
 * <p>
 * role {@link Role} - member role
 * rank {@link Rank} - member rank
 * isReadyForNextMissions {@link Boolean} - true by default. Set to false, after first failed mission
 */

@EqualsAndHashCode
@ToString
public class CrewMember extends AbstractBaseEntity {
    // todo
    private final String name;
    private final Role role;
    private final Rank rank;
    private boolean isReadyForNextMissions;

    public CrewMember(Role role, String name, Rank rank) {
        this.role = role;
        this.name = name;
        this.rank = rank;
        this.isReadyForNextMissions = true;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setReadyForNextMissions(boolean readyForNextMissions) {
        isReadyForNextMissions = readyForNextMissions;
    }

    public boolean isReadyForNextMissions() {
        return isReadyForNextMissions;
    }
}
