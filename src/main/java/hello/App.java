package hello;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean r = true;
    int alcool = 0;
    int gas = 0;
    int diesel = 0;
    while(r == true){
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                alcool ++;
                break;
            case 2:
                gas ++;
                break;
            case 3:
                diesel ++;
                break;
            case 4: 
                r = false;
                break;
        }
        
            
    }
    System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + diesel);
 
    }
}
