package com.epam.training.anton_pashutkin.fundamental.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("- Type something, please.");
        String mirrorBefore = reader.readLine();
        String mirrorAfter = new StringBuffer(mirrorBefore).reverse().toString();
        System.out.println("\n- Here is your mirror message:)\n" + mirrorAfter);
    }
}