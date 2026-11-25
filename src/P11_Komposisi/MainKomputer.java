package P11_Komposisi;
public class MainKomputer {
  public static void main(String[] args) {
    // membuat objek komputer
    Komputer komputer = 
            new Komputer("Asus",
            "A450CC");
    
    // membuat komponen nya
    komputer.addKomponen(
      new Mouse("Logitec"), 
      new Keyboard("Logitec"), 
      new Cpu("intel i7"));
    komputer.infoKomputer();   
  }
}