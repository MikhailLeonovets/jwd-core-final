package com.epam.jwd.core_final.util;

import com.epam.jwd.core_final.domain.Role;

import java.util.HashMap;
import java.util.Map;

public class CrewReader {

    public static Map<Role, Short> getCrew(String crew) {
        Map<Role, Short> crewMap = new HashMap<>();
        crew = crew.substring(1, crew.length() - 1);
        String[] crewArray = crew.split(",");
        for (String everyCrew : crewArray) {
            crewMap.put(Role.resolveRoleById(Long.parseLong(everyCrew.substring(0, 1))),
                    Short.parseShort(everyCrew.substring(2)));
        }
        return crewMap;
    }
}
