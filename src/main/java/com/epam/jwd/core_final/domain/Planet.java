package com.epam.jwd.core_final.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Expected fields:
 * <p>
 * location could be a simple class Point with 2 coordinates
 */
@EqualsAndHashCode
@ToString
public class Planet extends AbstractBaseEntity {
    private final long x;
    private final long y;
    private final String name;

    public Planet(String name, long x, long y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }



    @Override
    public String getName() {
        return name;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
