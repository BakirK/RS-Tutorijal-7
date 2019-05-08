package com.company;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /*kvadratna((Double x)->{
            return  (5 - (Math.sqrt(Math.pow(-5,2)-4*x*3) ))/ 2*x;
        });*/
        System.out.println("Unesi listu brojeva");
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int temp;
        temp = scanner.nextInt();
        while (temp != 0) {
            lista.add(temp);
            temp = scanner.nextInt();
        }

        Comparator c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int sumFirst = 0;
                while (o1 != 0) {
                    sumFirst += o1  % 10;
                    o1 /= 10;
                }

                int sumSecond = 0;
                while (o2 != 0) {
                    sumSecond += o2  % 10;
                    o2 /= 10;
                }
                return sumFirst - sumSecond;
            }
        };

        Collections.sort(lista, c);



        /*Arrays.sort(lista.toArray(), new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                int sumFirst = 0;
                while (o1 != 0) {
                    sumFirst += o1 % 10;
                    o1 /= 10;
                }

                int sumSecond = 0;
                while (o2 != 0) {
                    sumSecond += o2 % 10;
                    o2 /= 10;
                }
                return sumFirst - sumSecond;
            }
        });*/
        //ispis lsite
        System.out.println("Sortirana lista:");

        for(int a: lista) {
            System.out.print(a + " ");
        }




        //unos druge liste
        lista.clear();
        System.out.println("\nUnesi listu brojeva za sortiranje koristeci stream Api");
        temp = scanner.nextInt();
        while (temp != 0) {
            lista.add(temp);
            temp = scanner.nextInt();
        }


        ArrayList<Integer> listaStreamApi = (ArrayList<Integer>) lista.stream().sorted(c).collect(Collectors.toList());
        System.out.println("\nSortiran niz uz pomoc stream API:");
        for(int a: listaStreamApi) {
            System.out.print(a + " ");
        }




    }

    public static  void kvadratna(Function<Double, Double> lambda) {
            for (double i = 0; i< 101; i++) {
                System.out.println(lambda.apply(i));
            }
    }





}
