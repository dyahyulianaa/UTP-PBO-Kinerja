package MenghitungLuas;

import java.io.*;
import java.util.*;

class Solution{
    int luasPersegi;
    int luasSegitiga;
    double luasLingkaran;
    static int pilihan;

    Solution(int s){
        this.luasPersegi = s*s;
    }
    Solution(double a, double t){
        this.luasSegitiga = (int) (a*t)/2;
    }
    Solution(double r){
        if (r % 7 == 0){
            double phi = 22/7;
            double luasLingkaran = phi * r * r;
            this.luasLingkaran= (int) luasLingkaran;
        }else{
            double phi = 3.14;
            double luasLingkaran = phi * r * r;
            this.luasLingkaran= (int) luasLingkaran;

        }
    }
    void opsi(){
        switch (pilihan) {
            case 1:
                System.out.println(luasPersegi);
                break;
            case 2:
                System.out.println(luasSegitiga);
                break;
            case 3:
                System.out.println(luasLingkaran);
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pilihan = sc.nextInt();
        switch(pilihan){
            case 1:
                int sisi= sc.nextInt();
                Solution luasPersegi = new Solution(sisi);
                luasPersegi.opsi();
                break;
            case 2:
                double a = sc.nextInt();
                double t = sc.nextInt();
                Solution luasSegitiga = new Solution(a, t);
                luasSegitiga.opsi();
                break;
            case 3:
                double r2 = sc.nextInt();
                Solution luasLingkaran = new Solution(r2);
                luasLingkaran.opsi();
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }

    }
}