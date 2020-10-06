package com.alyaauliahanafi.modul1.manusia;

//main
public class Manusia {
    private String nama;
    private int umur;

   //constructor 1
    public Manusia(){}
    //constructor 2
    public Manusia(String nama) {
        this.nama = nama;
        //this merujuk pada kelas
    }
    //constructor 3
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //Getter & Setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
