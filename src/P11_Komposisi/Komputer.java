package P11_Komposisi;

public class Komputer {
  private String merk;
  private String tipe;
  private Mouse mouse;
  private Keyboard keyboard;
  private Cpu cpu;
  public Komputer(String merk, String tipe) {
    this.merk = merk;
    this.tipe = tipe;
  }
  public void addKomponen(Mouse mouse, 
                          Keyboard keyboard, 
                          Cpu cpu) {
    this.mouse = mouse;
    this.keyboard = keyboard;
    this.cpu = cpu;
  }
  public void infoKomputer(){
      System.out.println("Merek " + this.merk);
      System.out.println("Tipe " + this.tipe);
      System.out.println("Mouse " + 
                                  mouse.getMerk());
      System.out.println("Keyboard " + 
                          keyboard.getJenis());
      System.out.println("CPU " + cpu.getNama());
  }
}