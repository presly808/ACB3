package ua.artcode.vital;

import ua.artcode.RecursionUtils;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by admin on 15.12.2014.
 */
public class TestStackWithDebug {

    public static void main(String[] args) {

        System.out.println("Input some line");
        String line = new Scanner(System.in).nextLine();
        String reversed = RecursionUtils.reverse(line);
        System.out.println(reversed);



    }


}
