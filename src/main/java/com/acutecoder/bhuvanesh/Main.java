package com.acutecoder.bhuvanesh;

import java.util.ArrayList;

import static com.acutecoder.bhuvanesh.IOUtil.*;

public class Main {
    public static void main(String[] args) {
        String name = input("Enter your name: ");
        int age = toInt(input("Enter your age: "));
        String[] strings = input("Enter numbers separated by space: ").split(" ");
        ArrayList<Integer> ints = mapInt(strings);
        print("Your name is", name);
        print("Your are", age >= 18 ? "" : "not", "eligible to vote");
        for (int i : ints) {
            printEnd(", ", i);
        }
        print();
        print(ints);
        print(ints.toArray());
        printSep("-", ints.toArray());
    }
}