package com.tutorial;
import java.util.*;

class Kaos{
    String jenis;
    int harga;
    int jumlah;

    public Kaos(String a, int b){
        this.jenis = a;
        this.jumlah = b;
    }

    int bajua = 100000;
    int bajub = 125000;
    int bajuc = 175000;

    void bajua(){
        if(jumlah > 100){
            harga = 95000;
        }else
            harga = bajua;
    }

    void bajub(){
        if (jumlah > 100){
            harga = 120000;
        }else
            harga = bajub;
    }

    void bajuc(){
        if (jumlah > 100){
            harga = 160000;
        }else
            harga = bajuc;
    }

    void display(){
        if(jenis.equalsIgnoreCase("a")) {
            bajua();
        }else if(jenis.equalsIgnoreCase("b")) {
            bajub();
        }else if(jenis.equalsIgnoreCase("c")){
            bajuc();
        }

        System.out.println("Jenis yang anda beli    : " + jenis);
        System.out.println("Harga per buah          : " + harga);
        System.out.println("Total harga             : " + harga * jumlah);

    }
}
public class Main {

    public static void main(String[] args) {
        Scanner hc = new Scanner (System.in);
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.println("Baju yang anda beli bertipe : ");
        String jenis = hc.nextLine();
        System.out.println("Jumlah baju yang akan anda beli : ");
        int jumlah = hc.nextInt();

        Kaos baru = new Kaos(jenis, jumlah);
        baru.display();
    }
}