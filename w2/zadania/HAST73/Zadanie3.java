package w2.zadania.HAST73;

import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args){
        Scanner wczytajDane = new Scanner(System.in);
        System.out.println("Witaj w programie sprawdzajacym dlugosci bokow!");
        System.out.println("Prosze podaj kolejno 3 boki trojkata: ");
        int bok1 = wczytajDane.nextInt();
        int bok2 = wczytajDane.nextInt();
        int bok3 = wczytajDane.nextInt();

        if(bok1<bok2+bok3 && bok2<bok1+bok3 && bok3<bok2+bok1){
            if(bok1==bok2 && bok1==bok3){
                System.out.println("Wykonany trojkat jest rownoboczny i rownoramienny!");
            }
            else if((bok1==bok2 && bok1!=bok3)||(bok2==bok3 && bok2!=bok1)||(bok3==bok1 && bok3!=bok2)){
                System.out.println("Wykonany trojkat jest rownoramienny!");
            }
            else{
                System.out.println("Wykonany trojkat jest roznoboczny!");
            }
        }
        else {
            System.out.println("Nie da sie wykonac takiego trojkata!");
        }
    }
}
