package com.company;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
//        HashSet<Object> set = new HashSet<>();
//        Object o = new Object();
//        set.add(o);
//        set.add(o);

        HashSet<Class0> set2 = new HashSet<>();
        set2.add(new Class1(1));
        set2.add(new Class1(1));
        set2.add(new Class1(2));

        CopyOnWriteArrayList copyOnWriteArrayList;


        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());

        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());

        //TimeUnit.MINUTES.sleep(1);
    }
}
