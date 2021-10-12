package com.company;

import java.util.ArrayList;

public class Elektronikshop {
    private ArrayList<Integer> preisetast;
    private ArrayList<Integer> preiseusb;

    Elektronikshop() {
        preisetast = new ArrayList<>();
        preiseusb = new ArrayList<>();
    }

    Elektronikshop(ArrayList<Integer> preiset, ArrayList<Integer> preiseu) {
        preisetast = preiset;
        preiseusb = preiseu;
    }

    public void set_preiseusb(ArrayList<Integer> preiseu){
        preiseusb = preiseu;
    }

    //1. Schreiben Sie eine Methode, welche die billigste Tastatur zurückgibt.
    //z.B. [40 35 70 15 45] => 15
    public int billigste_tast(){
        int min=preisetast.get(0);
        for(int index: preisetast){
            if (index < min)
                min = index;}
        return min;
    }

    //2. Schreiben Sie eine Methode, welche den teuersten Gegenstand zurückgibt.
    //z.B. Tastatur = [15 20 10 35], USB = [20, 15, 40 15] => 40
    public int teuersten_geg(){
        int max = -1;

        for(int index: preisetast){
            if (index > max)
                max = index;
        }

        for(int index: preiseusb){
            if (index > max)
                max = index;
        }
        return max;
    }

    //3. Schreiben Sie eine Methode, welche das teuerste USB Laufwerk, das Markus kaufen
    //kann, zurückgibt.
    //z.B. Preise = [15 45 20], Budget = 30 => 20
    public int teuresten_fur_budget(int budget){
        int max = -1;
        for (int index: preiseusb){
            if(index > max && index <= budget)
                max = index;
        }
        return max;
    }

    //4. b=60, tastaturen = [40 50 60] und usb Laufwerke = [8 12] => 50 + 8 = 58
    //b=60, tastaturen = [60] und usb Laufwerke = [8 12] => -1
    //b=60, tastaturen = [40 60] und usb Laufwerke = [8 12] => 40 + 12 = 52
    public int max_geldbetrag(int budget){
        int max = -1;
        for (int index: preisetast)
            for (int index2: preiseusb)
                if ( (index + index2) > max && (index + index2) <= budget )
                    max = index + index2;
        return max;
    }


}
