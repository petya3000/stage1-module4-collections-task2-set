package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new LinkedHashSet<>();

        for (String el : firstSet)
            if (secondSet.contains(el)) set.add(el);

            for (String el : thirdSet)
                if (!firstSet.contains(el) && !secondSet.contains(el)) set.add(el);

                return set;


    }
}
