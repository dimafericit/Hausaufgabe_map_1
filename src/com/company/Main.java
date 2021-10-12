package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class Main{


    public static void main(String[] args) {

        //ex1
        System.out.println("ex 1");
	    Aufgabe1 obj1 = new Aufgabe1();
        ArrayList<Integer> noten = new  ArrayList<>(Arrays.asList(38,99,44,22,87));
        System.out.println("max abgerundete Note " + obj1.ex4(noten));
        System.out.print("abgerundete Noten ");
        obj1.afisare(obj1.ex3(noten));
        System.out.print("nicht ausreichende Noten  ");
        obj1.afisare(obj1.ex1(noten));
        System.out.print("Durchsnitt ");
        System.out.println(obj1.ex2(noten));
        System.out.println();


        //ex2
        System.out.println("ex 2");
        Aufgabe2 obj2 = new Aufgabe2();
        ArrayList<Integer> zahlen = new  ArrayList<>(Arrays.asList(3,8,3,10,17));
        System.out.println("Maximum " + obj2.maximale_zahl(zahlen));
        System.out.println("Minmum " + obj2.minimale_zahl(zahlen));
        System.out.println("maximale Summe " + obj2.max_summe(zahlen));
        System.out.println("minimale Summe " + obj2.min_summe(zahlen));
        System.out.println();



        //ex3
        System.out.println("ex 3");
        ArrayList<Integer> arr2 = new  ArrayList<>(Arrays.asList(3,5,0,5));
        ArrayList<Integer> arr = new  ArrayList<>(Arrays.asList(1,4,2,2));

        Aufgabe3 obj3 = new Aufgabe3();
        System.out.println(obj3.differenz(arr2, arr));
        System.out.println("Summe " + obj3.summe(arr2, arr));
        System.out.println("Differenz " + obj3.differenz(arr2, arr));
        System.out.println("Multiplikation " + obj3.multiplikation(arr,3));
        System.out.println("Division " + obj3.division(arr,2));
        System.out.println();


        //ex4
        System.out.println("ex 4");
        ArrayList<Integer> tast = new  ArrayList<>(Arrays.asList(40,28,13,35));
        ArrayList<Integer> usb = new  ArrayList<>(Arrays.asList(15,45,20,25));
        Elektronikshop obj4 = new Elektronikshop(tast, usb);

        System.out.println("billigste Tastatur " + obj4.billigste_tast());
        //16
        System.out.println("teuresten Gegenstand " + obj4.teuersten_geg());
        //45
        System.out.println("Teursten Usb fur ein Budget " + obj4.teuresten_fur_budget(30));
        //25
        System.out.println("Maximale Geldbetrag " + obj4.max_geldbetrag(29));


    }
}




