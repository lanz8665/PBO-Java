package P2;

import java.util.Scanner;

public class InputOutput {

    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        String name;
        
        System.out.print("Masukan Nama anda: ");
        name = input.nextLine();
        
        System.out.println("Hi! "+name);
        System.out.println("semangat ya belajar java nya");
        
    }
    
}
