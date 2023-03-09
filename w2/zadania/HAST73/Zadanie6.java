package w2.zadania.HAST73;

import java.util.Scanner;
public class Zadanie6 {
    public static void main(String [] args){
        boolean wybor = true;
        int suma=0;
        Scanner wczytajDane = new Scanner(System.in);
        while (wybor){
            System.out.println("Prosze podac liczbe ");
            int liczba = wczytajDane.nextInt();
            suma+=liczba;
            if(liczba==0){
                wybor = false;
            }
        }
        System.out.println("Suma liczb roznych od 0 wynosi "+suma);
    }
}
