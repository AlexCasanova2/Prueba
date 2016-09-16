package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Coche Jaguar = new Coche("Jaguar","XF","3453WRD",4000,80000.0);
        Coche Mercedes = new Coche("Mercedes","Benz","3831DTY",3600,70000.0);
        Coche BMW = new Coche("BMW","R5","7327CFI",5000,60000.0);

        List<Coche> cocheList = new ArrayList<>();

        cocheList.add(Jaguar);
        cocheList.add(Mercedes);
        cocheList.add(BMW);


        System.out.println("Muestro el Jaguar: "+cocheList.get(0));
        System.out.println("Muestro el Mercedes: "+cocheList.get(1));
        System.out.println("Muestro el BMW: "+cocheList.get(2));

        System.out.println("");




    }
}
