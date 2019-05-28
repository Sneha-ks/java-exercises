package exercises;

import java.util.Scanner;

public class GasConsumption {
    public static void main(String[] args){
        float miles_driven;
        float gas_consumed;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        miles_driven = in.nextFloat();
        System.out.println("Enter the amount of gas consumed: ");
        gas_consumed = in.nextFloat();

        System.out.println("Miles-per-gallon: " + miles_driven/gas_consumed);

    }
}
