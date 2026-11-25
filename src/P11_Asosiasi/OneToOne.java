package P11_Asosiasi;
public class OneToOne {
    public static void main(String[] args){        
        Laptop L1 = new Laptop("Asus");
        Pemilik P1 = new Pemilik("Budi");
        
        P1.setMerek(L1.getMerek());
        L1.setMerek("HP");
        System.out.println("Pemilik: " + P1.getPemilik());
        System.out.println("Laptop merek: " + P1.getMerek());        
    }    
}
