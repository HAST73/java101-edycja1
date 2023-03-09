package w2.zadania.HAST73;

import java.util.Scanner;
public class Zadanie4 {
    public static void main(String [] args){
        Scanner wczytajDane = new Scanner(System.in);
        System.out.println("Prosze podaj liczbe z przedzialu od 1-12!");
        int liczba_miesiac = wczytajDane.nextInt();
        switch (liczba_miesiac){
            case 1,2,3:
                System.out.println("Jest to I kwartal!");
                break;
            case 4,5,6:
                System.out.println("Jest to II kwartal!");
                break;
            case 7,8,9:
                System.out.println("Jest to III kwartal!");
                break;
            case 10,11,12:
                System.out.println("Jest to IV kwartal!");
                break;
            default:
                System.out.println("Podano nieprawidlowa liczbe z zakresu!");
                break;
        }
        System.out.println("Prosze podaj liczbe z przedzialu od 1-7!");
        int liczba_tydzien = wczytajDane.nextInt();
        String dzien_Tygodnia = switch (liczba_tydzien){
            case 1:
                yield "poniedzialek";
            case 2:
                yield "wtorek";
            case 3:
                yield "sroda";
            case 4:
                yield "czwartek";
            case 5:
                yield "piatek";
            case 6:
                yield "sobota";
            case 7:
                yield "niedziela";
            default:
                yield "Podano nieprawidlowa liczbe z zakresu!";
        };
        System.out.println(dzien_Tygodnia);
    }
}
