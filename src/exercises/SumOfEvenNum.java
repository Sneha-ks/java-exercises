package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenNum {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        sum(numbers);
    }

    public static void sum(int[] num){
        int sum = 0;
        for(int i=0;i<num.length;i++){
            if (num[i]%2 == 0){
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}
