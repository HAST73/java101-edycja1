package w2.zadania.HAST73;

import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args){
        Scanner wczytajDane = new Scanner(System.in);
        System.out.println("Prosze podac liczbe dodatnia n: ");
        int n = wczytajDane.nextInt();
        if(n>0){
            for(int i=1;i<=n;i++){
                System.out.println(i);
            }
            for(int i=n;i>=1;i--){
                System.out.println(i);
            }
            for(int i=1;i<=n;i++){
                if(i%3==0 || i%5==0){
                    System.out.println(i);
                }
            }
            for(int i=1;i<=n;i++){
                if(i%3==0 || i%5==0 && i%15!=0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Podano niedodatnia liczbe!");
        }


    }
}
