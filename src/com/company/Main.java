package com.company;

import java.sql.SQLOutput;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        kvadratna((Double x)->{
            return  (-5 - (Math.sqrt(Math.pow(5,2)-4*x*3) ))/ 2*x;

        });
	// write your code here
    }

    public static  void kvadratna(Function<Double, Double> lambda) {
            for (double i = 0; i< 101; i++) {
                System.out.println(lambda.apply(i));
            }
    }



}
