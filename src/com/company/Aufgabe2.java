package com.company;

import java.util.ArrayList;

public class Aufgabe2 {

    //1. Finden Sie die maximale Zahl.
    public int maximale_zahl(ArrayList<Integer> zahlen){
        int max = 0;
        for (int index = 0; index < zahlen.size(); index++ )
            if (zahlen.get(index) > max)
                max = zahlen.get(index);
        return max;
    }

    //2. Finden Sie die minimale Zahl.
    public int minimale_zahl(ArrayList<Integer> zahlen){
        int min = 5000;
        for (int index = 0; index < zahlen.size(); index++ )
            if (zahlen.get(index) < min)
                min = zahlen.get(index);
        return min;
    }

    //3. Finden Sie die maximale Summe von n-1 Zahlen.
    //z.B. [4, 8, 3, 10, 17] => 4 + 8 + 10 + 17 = 39
    public int max_summe(ArrayList<Integer> zahlen){
        int sum = 0;
        for (int index = 0; index < zahlen.size(); index++ )
            sum += zahlen.get(index);
        sum -= minimale_zahl(zahlen);
        return sum ;
    }

    //4. Finden Sie die minimale Summe von n-1 Zahlen.
      //      z.B. [4, 8, 3, 10, 17] => 4 + 8 + 3 + 10 = 25
    public int min_summe(ArrayList<Integer> zahlen) {
        int sum = 0;
        for (int index = 0; index < zahlen.size(); index++)
            sum += zahlen.get(index);
        return sum - maximale_zahl(zahlen);
    }
}
