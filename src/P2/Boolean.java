package P2;

/**
 *
 * @author Asus
 */
public class Boolean {
   
    public static void main(String args[]){
    
        var nilaiAkhir=80;   
        var absen = 70;
        
        var lulusAbsen  = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;
        
        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    
   }
}
