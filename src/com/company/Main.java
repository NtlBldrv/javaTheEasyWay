package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Длина массива: ");
        try {
            int arraySize = input.nextInt();
            findMinValue(arraySize);
        } catch (Exception exception) {
            System.out.println("WTF, man?!");
        }

        findAverageStringLength();
    }

    public static void findMinValue(int arraySize) {
        Random random = new Random();
        int[] randomInts = random.ints(0, 999999999).limit(arraySize).toArray();
        Arrays.sort(randomInts);
        System.out.println("Array sorted: " + Arrays.toString(randomInts));
        System.out.println("Min number = " + randomInts[0]);
    }

    public static void findAverageStringLength()
    {
        int lengthSum = 0;
        String[] strings = {"I", "have", "no", "idea", "what", "is", "going", "on", "here"};

        for (String string : strings) {
            lengthSum += string.length();
        }

        System.out.println("Array length = " + strings.length);
        System.out.println("Words sum length = " + lengthSum);
        System.out.println("Words average length = " + lengthSum/strings.length);

    }
}
