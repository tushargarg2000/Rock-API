package com.acciojob.RockApis;

import java.util.*;

public class CollectionsLearning {

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);


        List<Integer> li = new LinkedList<>();


        //Iterable Interface
        for(Integer integer:numbers){
            System.out.println(integer);
        }


        Map<Integer,Integer> map = new HashMap<>();

        ListIterator<Integer> listIterator = numbers.listIterator();



        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }




//        Collection<Integer> li = new PriorityQueue<>();
//
//        li.iterator();
//
//        while(li.iterator().hasNext()){
//            System.out.println(li.iterator().next());
//        }
//
//
//
//
//        li.add(10);
//
//        li.remove(2);
//
//        boolean ans =  li.contains(10);
//
//
//        //Alot of code has been written

    }
}
