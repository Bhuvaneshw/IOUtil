package com.acutecoder.bhuvanesh;

import java.util.ArrayList;

import static com.acutecoder.bhuvanesh.IOUtil.*;

public class Main {
    public static void main(String[] args) {
        String name = input("Enter your name: ");
        int age = toInt(input("Enter your age: "));
        ArrayList<Integer> ints = mapInt(input("Enter numbers separated by space: ").split(" "));
        print("Your name is", name);
        print("Your are", age >= 18 ? "Major" : "Minor");
        for (int i : ints) {
            printEnd(", ", i);
        }
        print();
        print(ints);
    }
}