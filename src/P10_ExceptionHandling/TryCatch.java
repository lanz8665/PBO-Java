package P10_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        try {
            int angka, result;
            System.out.print("Masukan sebuah angka: ");
            angka = input.nextInt();
            cekNegative(angka);
            System.out.println("angka: " + angka);  
            int hasil = pembagian(angka);
            System.out.print("10 dibagi " + angka + " = " + hasil);
        }
        catch (InputMismatchException e){
            System.out.println("Terjadi kesalahan !, input yang dimasukan bukan angka");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Error ! pembagi tidak boleh Nol");
        }
        
        finally{
            System.out.println("block ini pasti di eksekusi");
        }
        
    }
    
    public static int pembagian(int a) throws ArithmeticException{
        return 10/a;
    }
    
    public static void cekNegative(int a){
        if(a < 0)
            throw new IllegalArgumentException("Angka tidak boleh negative : " + a);
    }
    
}
