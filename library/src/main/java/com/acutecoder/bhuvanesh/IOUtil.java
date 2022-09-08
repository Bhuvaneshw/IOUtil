package com.acutecoder.bhuvanesh;

import java.util.ArrayList;
import java.util.Scanner;

public final class IOUtil {

    public static void print(Object... s) {
        printRaw(" ", "\n", s);
    }

    public static void printEnd(String end, Object... s) {
        printRaw(" ", end, s);
    }

    public static void printSep(String sep, Object... s) {
        printRaw(sep, "\n", s);
    }

    public static void printRaw(String sep, String end, Object... s) {
        for (int i = 0; i < s.length; i++) {
            Object m = s[i];
            System.out.print(m + ((i != s.length - 1) ? sep : ""));
        }
        System.out.print(end);
    }

    public static String input(String msg) {
        printEnd("", msg);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static float toFloat(String s) {
        return Float.parseFloat(s);
    }

    public static double toDouble(String s) {
        return Double.parseDouble(s);
    }

    public static long toLong(String s) {
        return Long.parseLong(s);
    }

    public static ArrayList<Integer> mapInt(String... s) {
        ArrayList<Integer> l = new ArrayList<>();
        for (String a : s) {
            l.add(Integer.parseInt((String) a));
        }
        return l;
    }

    public static ArrayList<Float> mapFloat(String... s) {
        ArrayList<Float> l = new ArrayList<>();
        for (String a : s) {
            l.add(Float.parseFloat((String) a));
        }
        return l;
    }

    public static ArrayList<Double> mapDouble(String... s) {
        ArrayList<Double> l = new ArrayList<>();
        for (String a : s) {
            l.add(Double.parseDouble((String) a));
        }
        return l;
    }

    public static ArrayList<Long> mapLong(String... s) {
        ArrayList<Long> l = new ArrayList<>();
        for (String a : s) {
            l.add(Long.parseLong((String) a));
        }
        return l;
    }

    public static ArrayList<String> map(Object... o) {
        ArrayList<String> l = new ArrayList<>();
        for (Object a : o) {
            l.add(String.valueOf(a));
        }
        return l;
    }
}
