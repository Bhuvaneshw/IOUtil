package com.acutecoder.bhuvanesh;

import java.util.ArrayList;
import java.util.Scanner;

public final class IOUtil {

    public static void print(Object... message) {
        printRaw(" ", "\n", message);
    }

    public static void printEnd(String end, Object... message) {
        printRaw(" ", end, message);
    }

    public static void printSep(String sep, Object... message) {
        printRaw(sep, "\n", message);
    }

    public static void printRaw(String seperator, String end, Object... message) {
        for (int i = 0; i < message.length; i++) {
            Object m = message[i];
            if (String.valueOf(m).equals("")) continue;
            System.out.print(m + ((i != message.length - 1) ? seperator : ""));
        }
        System.out.print(end);
    }

    public static String input(String message) {
        return input(message, new Scanner(System.in));
    }

    public static String input(String message, Scanner scanner) {
        printEnd("", message);
        return scanner.nextLine();
    }

    public static int toInt(String value) {
        return Integer.parseInt(value);
    }

    public static float toFloat(String value) {
        return Float.parseFloat(value);
    }

    public static double toDouble(String value) {
        return Double.parseDouble(value);
    }

    public static long toLong(String value) {
        return Long.parseLong(value);
    }

    public static ArrayList<Integer> mapInt(String... stringValues) {
        ArrayList<Integer> l = new ArrayList<>();
        for (String a : stringValues) {
            l.add(Integer.parseInt((String) a));
        }
        return l;
    }

    public static ArrayList<Float> mapFloat(String... stringValues) {
        ArrayList<Float> l = new ArrayList<>();
        for (String a : stringValues) {
            l.add(Float.parseFloat((String) a));
        }
        return l;
    }

    public static ArrayList<Double> mapDouble(String... stringValues) {
        ArrayList<Double> l = new ArrayList<>();
        for (String a : stringValues) {
            l.add(Double.parseDouble((String) a));
        }
        return l;
    }

    public static ArrayList<Long> mapLong(String... stringValues) {
        ArrayList<Long> l = new ArrayList<>();
        for (String a : stringValues) {
            l.add(Long.parseLong((String) a));
        }
        return l;
    }

    public static ArrayList<String> map(Object[] values) {
        ArrayList<String> l = new ArrayList<>();
        for (Object a : values) {
            l.add(String.valueOf(a));
            print(a);
        }
        return l;
    }
}
