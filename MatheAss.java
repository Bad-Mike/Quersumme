package quersumme;

import java.util.Scanner;

/**
 * Created by mike on 04/10/2016.
 */
public class MatheAss {

    public static void main(String[] jo) {

        int x;

        int qsum = 0;

        System.out.print("Zahl: ");
        x = new Scanner(System.in).nextInt();

        while (x>0) {

            int rest = (x % 10);
            qsum = qsum + rest;
            x = (x - rest) / 10;
        }

        System.out.println("Quersumme: " + qsum);


    }
}
