package exercises;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args){
        int l;
        int b;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the length: ");
        l = in.nextInt();
        System.out.println("Enter the breadth: ");
        b= in.nextInt();

        System.out.println("Area of Rectangle is " + l*b);
    }
}
