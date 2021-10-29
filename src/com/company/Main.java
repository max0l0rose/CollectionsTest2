package com.company;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws InterruptedException
    {
        Collection<Integer> syncCollection = Collections.synchronizedCollection(
                new ArrayList<>()
        );
        Runnable listOperations = () -> {
            syncCollection.addAll(IntStream.range(1, 50).collect(ArrayList::new, List::add, List::addAll));
                    //Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13, 14, 15, 16, 17, 18, 19, 20));
        };

        Thread thread1 = new Thread(listOperations);
        Thread thread2 = new Thread(listOperations);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        //assertThat(syncCollection.size()).isEqualTo(12);

//        HashSet<Object> set = new HashSet<>();
//        Object o = new Object();
//        set.add(o);
//        set.add(o);

        HashSet<Class0> set2 = new HashSet<>();
        set2.add(new Class1(1));
        set2.add(new Class1(1));
        set2.add(new Class1(2));

        CopyOnWriteArrayList copyOnWriteArrayList;


//        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
//        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());

        //TimeUnit.MINUTES.sleep(1);
    }
}
