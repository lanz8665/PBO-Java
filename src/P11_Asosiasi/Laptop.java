package P11_Asosiasi;
public class Laptop {
    private String merek;//asosiasi
    public Laptop(String merek){
        this.merek = merek;
    }
    public void setMerek(String merek){
        this.merek=merek;
    }
  
    public String getMerek(){
        return merek;
    }  
}
