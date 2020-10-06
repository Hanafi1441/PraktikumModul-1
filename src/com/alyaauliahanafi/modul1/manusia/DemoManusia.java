package com.alyaauliahanafi.modul1.manusia;

public class DemoManusia {
    public static void main(String[] args) {
        //Array of Object
        Manusia manusia[] = new Manusia[3];

        Manusia manusia1 = new Manusia();
        manusia1.setNama("Joi");
        manusia1.setUmur(34);



        Manusia manusia2 = new Manusia("JOlo");

        Manusia manusia3 = new Manusia("kakal",98);

        manusia[0]= manusia1;
        manusia[1]= manusia2;
        manusia[2]= manusia3;

        for (Manusia x : manusia
             ) {
            System.out.println("Character");
            System.out.println("Nama\t: "+ x.getNama());
            System.out.println("Kela\t: "+ x.getUmur());
            System.out.println();

        }



    }
}

