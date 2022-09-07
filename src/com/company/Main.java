package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(2);
        }
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(2));
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(2));
        }
        sort(massive);
        sort(integers);
        sort(linkedList);


    }
public static void sort(int[] a) {
        Arrays.sort(a);
    System.out.println(Arrays.toString(a));
}

    public static void sort(ArrayList b) {
        Collections.sort(b);
        System.out.println(b);
    }

    public static void sort(LinkedList c) {
        Collections.sort(c);
        System.out.println(c);
    }

}
