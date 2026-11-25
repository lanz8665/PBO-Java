package P11_AsosiasiManyToMany;

class Mahasiswa {
    String nama;
    String npm;
    String[] kodeMK = new String[10];
    int jumlahMK = 0;

    Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }

    void ambilMataKuliah(MataKuliah mk) {
        // simpan kodeMK ke mahasiswa
        kodeMK[jumlahMK] = mk.kodeMK;
        jumlahMK++;

        // simpan npm ke matakuliah
        mk.tambahMahasiswa(this);
    }
}

class MataKuliah {
    String nama;
    String kodeMK;
    String[] npmMahasiswa = new String[30]; // menyimpan npm mahasiswa
    int jumlahMhs = 0;

    MataKuliah(String nama, String kodeMK) {
        this.nama = nama;
        this.kodeMK = kodeMK;
    }

    void tambahMahasiswa(Mahasiswa m) {
        npmMahasiswa[jumlahMhs] = m.npm;
        jumlahMhs++;
    }
}

//main class
public class ManyToMany {
    public static void main(String[] args) {

        // Objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Andi", "231001");
        Mahasiswa m2 = new Mahasiswa("Budi", "231002");

        // Objek Mata Kuliah
        MataKuliah mk1 = new MataKuliah("Pemrograman Java", "MK01");
        MataKuliah mk2 = new MataKuliah("Basis Data", "MK02");

        // MANY TO MANY
        m1.ambilMataKuliah(mk1);
        m1.ambilMataKuliah(mk2);

        m2.ambilMataKuliah(mk1);

        // Output mahasiswa
        System.out.println("Mata kuliah yang diambil oleh " + m1.nama + "("+m1.npm+")"+":");
        for (int i = 0; i < m1.jumlahMK; i++) {
            System.out.println("- " + m1.kodeMK[i]);
        }

        // Output mata kuliah
        System.out.println("\nMahasiswa yang mengambil " + mk1.nama + ":");
        for (int i = 0; i < mk1.jumlahMhs; i++) {
            System.out.println("- " + mk1.npmMahasiswa[i]);
        }
    }
}

