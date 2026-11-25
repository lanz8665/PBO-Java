package P2;

/**
 *
 * @author Asus
 */
public class SwitchCase {
    
    public static void main(String args[]){
        var nilai = "A";
        
        switch(nilai){
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("mungkin anda salah jurusan");                
        }
        //lambda
        switch(nilai){
            case "A" -> {
                            System.out.println("Wow Anda lulus dengan baik");
                            System.out.println("sangat hebat");
                        }               
            case "B", "C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda tidak lulus");
            default->{
                System.out.println("mungkin anda salah jurusan");
            }                
        }        
    }
    
}
