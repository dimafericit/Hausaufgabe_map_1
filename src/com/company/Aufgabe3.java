package com.company;

import java.util.ArrayList;

public class Aufgabe3 {

    public void afisare(ArrayList<Integer> noten){
        System.out.println(noten);
    }

    //1. Berechnen Sie die Summe. Die Zahlen haben die gleiche Anzahl an Ziffern. z.B. [1 3
    //0 0 0 0 0 0 0] + [8 7 0 0 0 0 0 0 0] = [1 0 0 0 0 0 0 0 0 0]
    public ArrayList<Integer> summe(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> ergebnis = new ArrayList<Integer>();
        int aux = 0;
        for (int index = a.size()-1; index >0; index--){
            ergebnis.add(0, (((a.get(index) + b.get(index))%10)+aux));
            aux = (a.get(index) + b.get(index)) / 10;
        }
        //
        int first_nr = a.get(0)+b.get(0)+aux;
        if (first_nr > 9){
            ergebnis.add(0, first_nr % 10);
            ergebnis.add(0, 1);
        }
        else
            ergebnis.add(0, first_nr);
        return ergebnis;
    }

    //2. Berechnen Sie die Differenz. Die Zahlen haben die gleiche Anzahl an Ziffern. z.B. [8
    //3 0 0 0 0 0 0 0] [5 4 0 0 0 0 0 0 0] = [2 9 0 0 0 0 0 0 0]
    public ArrayList<Integer> differenz(ArrayList<Integer> a, ArrayList<Integer> b){
        int aux = 0;
        ArrayList<Integer> ergebnis = new ArrayList<>();
        for (int idx = a.size() - 1; idx >= 0; idx--){
            if (a.get(idx) - b.get(idx) - aux < 0){
                ergebnis.add(0, (10 + a.get(idx) - b.get(idx) - aux));
                aux = 1;
            }
            else {
                ergebnis.add(0, (a.get(idx) - b.get(idx) - aux));
                aux = 0;
            }
            //while(ergebnis.get(0) == 0)
                //ergebnis.remove(0);
        }
        return ergebnis;
    }




    //3. Berechnen Sie die Multiplikation. Die erste Zahl ist eine große Zahl, die zweite Zahl
    //ist nur eine Ziffer.
    //z.B. [2 3 6 0 0 0 0 0 0] * 2 = [4 7 2 0 0 0 0 0 0]
    public ArrayList<Integer> multiplikation(ArrayList<Integer> a, int x){
        ArrayList<Integer> ergebnis = new ArrayList<Integer>();
        int aux = 0;
        int zahl = 0;
        for (int index = a.size()-1; index >= 0; index--){
            zahl = ((a.get(index)*x + aux)% 10);
            ergebnis.add(0, zahl);
            aux = (a.get(index)*x + aux)/10;
        }
        if (aux == 1)
            ergebnis.add(0, aux);
        return ergebnis;
    }

    //4. Berechnen Sie die ganzzahlige Division. Die erste Zahl ist eine große Zahl, die zweite
    //Zahl ist nur eine Ziffer.
    //z.B. [2 3 6 0 0 0 0 0 0] / 2 = [1 1 8 0 0 0 0 0 0]
    public ArrayList<Integer> division(ArrayList<Integer> a, int x){
        ArrayList<Integer> ergebnis = new ArrayList<Integer>();
        int aux = 0;
        int zahl = 0;
        for (int index = 0; index < a.size(); index++){
            zahl = ((a.get(index)+aux*10)/x);
            ergebnis.add(zahl);
            aux = (a.get(index)+aux*10)%x;
        }
        if (ergebnis.get(0)==0)
            ergebnis.remove(0);
        return ergebnis;
    }


}
