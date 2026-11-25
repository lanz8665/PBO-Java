package P5;

public class Manager extends Staff{
    
    String departemen;
    
    public Manager(int nip, String nama, double gaji){
        super(nip, nama, gaji);
    }
    public void infoBagian(){
        departemen = super.bagian;
        int n = super.nip;
        System.out.println("N " + n);
        System.out.println("Manager departemen "+departemen);
    }
}
