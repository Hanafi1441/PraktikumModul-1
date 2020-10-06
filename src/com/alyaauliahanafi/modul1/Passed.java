package com.alyaauliahanafi.modul1;

public class Passed {
    public static void main(String[] args) {
        int nomer1, nomer2;
        TestPass pass = new TestPass(50, 100);
        nomer1 = 10;
        nomer2 = 20;

        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("momer1 = "+nomer1);
        System.out.println("nomer2 = "+ nomer2);

        //Passed by value
        pass.calculation(nomer1,nomer2);
        System.out.println("Nilai sesudah passed by value\t: ");
        System.out.println("momer1 = "+nomer1);
        System.out.println("nomer2 = "+ nomer2);
        System.out.println();
        //Passed by referance
        System.out.println("Nilai sebelum passed by referance\t: ");
        System.out.println("momer1 = "+pass.nomer1);
        System.out.println("nomer2 = "+ pass.nomer2);

        pass.calculation(pass);
        System.out.println("Nilai sesudah passed by referance\t: ");
        System.out.println("momer1 = "+pass.nomer1);
        System.out.println("nomer2 = "+ pass.nomer2);

    }
}
