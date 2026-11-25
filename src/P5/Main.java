package P5;

public class Main {
    public static void main(String[] args) {
        
        Employee e = new Employee(123, "Budi", 2000_000);
        e.info();
        
        Staff s = new Staff(122, "Siti", 3000_000);
        s.bagian = "Keuangan";
        s.info();
        s.infoBagian();
        

        Manager m = new Manager(122, "fuji", 4000_000);
        m.bagian = "Kepegawaian";
        //m.tunjangan = 300000;
        m.info();
        m.infoBagian();

        
    }
}
