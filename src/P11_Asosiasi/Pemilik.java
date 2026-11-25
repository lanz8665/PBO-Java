package P11_Asosiasi;
public class Pemilik {
   private String namaPemilik;
   private String merek;//asosiasi
   
   public Pemilik(String namaPemilik){
       this.namaPemilik = namaPemilik;
   }
   public String getPemilik(){
       return namaPemilik;
   }
   
   public void setMerek(String merek){
       this.merek = merek;
   }
   public String getMerek(){
       return merek;
   }
   
}
