package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int el : sourceList){
            if (el % 2 == 0){
                do{
                    hashSet.add(el);
                    el /= 2;
                } while (el % 2 == 0);
                hashSet.add(el);
            } else {
                hashSet.add(el);
                hashSet.add(el * 2);
            }
        }
        return hashSet;
    }
}
