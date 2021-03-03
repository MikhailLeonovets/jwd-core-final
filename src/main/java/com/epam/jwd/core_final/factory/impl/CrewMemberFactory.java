package com.epam.jwd.core_final.factory.impl;

import com.epam.jwd.core_final.domain.CrewMember;
import com.epam.jwd.core_final.domain.Rank;
import com.epam.jwd.core_final.domain.Role;
import com.epam.jwd.core_final.exception.InvalidStateException;
import com.epam.jwd.core_final.factory.EntityFactory;

// do the same for other entities
public class CrewMemberFactory implements EntityFactory<CrewMember> {

    private static CrewMemberFactory instance;

    private CrewMemberFactory() {

    }

    public static CrewMemberFactory getInstance() {
        if (instance == null) {
            instance = new CrewMemberFactory();
        }
        return instance;
    }


    @Override
    public CrewMember create(Object... args) throws InvalidStateException {
        if (args == null) {
            throw new InvalidStateException("There are no arguments in factory to make an entity");
        } else if (args.length != 3) {
            throw new InvalidStateException("There are not enough arguments to make an entity");
        } else {
            return new CrewMember(Role.resolveRoleById(Long.parseLong((String) args[0])),
                    (String) args[1],
                    Rank.resolveRankById((int) Long.parseLong((String) args[2])));
        }
    }
}
