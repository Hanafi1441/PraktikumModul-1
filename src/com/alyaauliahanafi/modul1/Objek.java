package com.alyaauliahanafi.modul1;

import com.sun.jdi.event.StepEvent;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//class main / dmeo class
public class Objek {
    public static void main(String[] args) {
        //deklarasi object tanpa parameter
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.setNama("Hanafi");
        mahasiswa.setNim(19104004);
        //Output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: "+ mahasiswa.getNama());
        System.out.println("NIM\t\t: "+ mahasiswa.getNim());
        //DEKLARASI OBJECT DENGAN PARAMETER
        Mahasiswa mahasiswa1 = new Mahasiswa("Paijo", 19104004);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: "+mahasiswa.getNama());
        System.out.println("NIM\t\t: "+mahasiswa.getNim());

    }

}
