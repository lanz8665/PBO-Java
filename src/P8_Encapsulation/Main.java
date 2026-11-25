package P8_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa(123, "Budi");
        m.info();
        System.out.println("Ubah dong npmnya si budi");
        m.setNpm(321);
        m.info();
    }
}
