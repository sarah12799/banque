
public class Personne {
    private String nom ;
    private String prenom;
    private int cin ;
    private int age ;  
    public Personne(){
        nom="anonym";
        prenom="anonym";
        cin=-1;
        age=-1;
    }
   
    public Personne(int cin , String nom, String prenom, int age ){
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age ;
    }
    public Personne(int cin , String nom, String prenom){
        this(cin, nom, prenom, -1);
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getPrenom(){
        return prenom ; 
    }
    public void setPrenom(String prenom){
        this.prenom=prenom ;
    }
    public int getCin(){
        return cin;
    }
    public int getAge(){
        return age ;
    }

}

