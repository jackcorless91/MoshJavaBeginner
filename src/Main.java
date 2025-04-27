package com.jackcorless;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        byte myAge = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';

//              PRIMITIVE TYPES
//        'byte', 1 byte = [-128, 127]
//        'short', 3 bytes = [-32k, 32k]
//        'int', 4 bytes = [-2b, 2b]
//        'long' 8 bytes
//        'float', 4 bytes
//        'double', 8 bytes
//        'char', 2 bytes ('')
//        'boolean' 1 byte

        //              PRIMITIVE TYPES
//        'byte', 1 byte = [-128, 127]
//        'short', 3 bytes = [-32k, 32k]
//        'int', 4 bytes = [-2b, 2b]
//        'long' 8 bytes
//        'float', 4 bytes
//        'double', 8 bytes
//        'char', 2 bytes ('')
//        'boolean' 1 byte

        Date now = new Date();
//        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
//        System.out.println(point2);

//        String message = "yo" + "!!   ";
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message);

//        String message = "c:\tWindows\\...";
//        System.out.println(message);

//        int[] numbers = { 2, 3, 4, 5, 1, 4 };
//        Arrays.sort(numbers);
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));

        int[][] numbers = { { 1, 2, 3}, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(numbers));

    }
}