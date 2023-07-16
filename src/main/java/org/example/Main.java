package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int a,b;
        double c;
        Scanner girdi = new Scanner(System.in);
        System.out.print("a kenarını giriniz : ");
        a = girdi.nextInt();
        System.out.print("b kenarını giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt(a*a + b*b) ;
        System.out.println("Hipotenüs : " + c);

    }
}