package P5;
public class Staff extends Employee{
    String bagian; 
    private double tunjangan;
    public Staff(int nip, String nama, double gaji)
    {
        super(nip, nama, gaji);
    }
    
    public void infoBagian(){
        System.out.println("Staff bagian " + bagian);
    }
    
}
