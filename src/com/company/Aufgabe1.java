package com.company;

import java.util.ArrayList;

public class Aufgabe1 {


    //1. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als der
//Rückgabewert soll die Methode ein Array mit nicht ausreichende Note liefern.

    public ArrayList<Integer> ex1 (ArrayList<Integer> noten) {
        int index = 0;
        while(index < noten.size())
            if (noten.get(index) > 38) {
                noten.remove(index);
            }
            else
                index++;

        return noten;
    }


//2. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als der
//    Rückgabewert soll die Methode den Durchschnittswert liefern.

    public int ex2(ArrayList<Integer> noten) {
        int sum = 0;
        for (int index = 0; index < noten.size(); index++)
            sum += noten.get(index);
        return sum / noten.size();
    }

//3. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als der
// Rückgabewert soll die Methode eine Array mit die abgerundete Noten liefern.

    public ArrayList<Integer> ex3(ArrayList<Integer> noten) {
        for (int index = 0; index < noten.size(); index++)
            if ((noten.get(index) > 38) && ((noten.get(index) % 5) != 0))
                noten.set(index,noten.get(index) + (5 - (noten.get(index) % 5)));
        return noten;
    }

//4. Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als der
//Rückgabewert soll die Methode die maximale abgerundete Note liefern.

    public int ex4(ArrayList<Integer> noten) {
        int max = 0;
        for (int index = 0; index < noten.size(); index++)
            if (max < noten.get(index))
                max = noten.get(index);
        if ((max > 38) && ((max % 5) != 0))
            max += 5 - (max % 5);
        return max;
    }

    public void afisare(ArrayList<Integer> arr){
        System.out.print(arr);
        System.out.println();
    }


}
