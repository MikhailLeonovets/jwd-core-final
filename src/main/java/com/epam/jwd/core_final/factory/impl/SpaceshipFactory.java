package com.epam.jwd.core_final.factory.impl;

import com.epam.jwd.core_final.domain.Spaceship;
import com.epam.jwd.core_final.exception.InvalidStateException;
import com.epam.jwd.core_final.factory.EntityFactory;
import com.epam.jwd.core_final.util.CrewReader;

public class SpaceshipFactory implements EntityFactory<Spaceship> {
    public static SpaceshipFactory instance;

    private SpaceshipFactory() {

    }

    public SpaceshipFactory getInstance() {
        if (null == instance) {
            instance = new SpaceshipFactory();
        }
        return instance;
    }


    @Override
    public Spaceship create(Object... args) throws InvalidStateException {
        if (args == null) {
            throw new InvalidStateException("There are no arguments in factory to make an entity");
        } else if (args.length != 3) {
            throw new InvalidStateException("There are not enough arguments to make an entity");
        } else {
            return new Spaceship((String) args[0],
                    Long.parseLong((String) args[1]),
                    CrewReader.getCrew((String) args[2])
            );
        }
    }
}
