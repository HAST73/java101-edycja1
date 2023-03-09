package w2.zadania.HAST73;

import java.util.Scanner;
public class Zadanie7 {
    public static void main(String [] args){
        int liczba,ile=0,suma=0;
        Scanner wczytaj_Dane = new Scanner(System.in);
        do{
            System.out.println("Prosze podac liczbe: ");
            liczba = wczytaj_Dane.nextInt();
            ile++;
            suma+=liczba;

        }while(liczba<100);
        System.out.println(suma/ile);
    }
}
