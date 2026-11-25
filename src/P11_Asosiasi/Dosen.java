package P11_Asosiasi;
public class Dosen {
    
    private String nidn;
    private int jmlMhs;
    private String npm[] = new String[5];
    
    public Dosen(String nidn){
        this.nidn=nidn;
    }
    
    public String getNidn(){
        return nidn;
    }
    
    public void setNpm(String npm){
        if(jmlMhs < this.npm.length){
            this.npm[jmlMhs] = npm; 
            jmlMhs++;
        }
    }
    
    public String getNpm(int i){
        return this.npm[i];
    }
    
    public int getJmlMhs(){
        return jmlMhs;
    }
}
