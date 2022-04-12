package MenghitungLuas;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = sc.nextInt();
        if (pilih == 1){
            int s = sc.nextInt();
            System.out.println(persegi(s));
        }else
        if (pilih == 2){
            double a = sc.nextDouble();
            double t = sc.nextDouble();
            System.out.println(segitiga(a, t));
        }else
        if (pilih == 3){
            double r = sc.nextDouble();
            if (r%7 == 0){
                System.out.println(lingkaran(r));
            }else
                System.out.println(lingkaran2(r));
        }else
            System.out.println("Input yang anda masukan tidak sesuai");
    }
    public static int persegi(int s){
        int hasil = s*s;
        return hasil;
    }
    public static int segitiga(Double a, Double t){
        int hasil = (int) (a*t/2);
        return hasil;
    }
    public static double lingkaran(double r){
        double hasil = 22 / 7 * r * r;
        return hasil;
    }
    public static double lingkaran2(double r){
        double hasil = 3.14 * r* r;
        int result = (int)hasil;
        return result;
    }
}
