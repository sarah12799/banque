public class Compte {
    protected double solde;
    protected int numero;
    protected Personne titulaire ;
    
   
    public Compte(double solde,int numero,Personne titulaire){
        this.solde=solde;
        this.numero=numero;
        this.titulaire=titulaire;
    }
    public Compte(int numero,Personne titulaire){
        this(0,numero,titulaire);
    }
    
    public void retirer(double montant){ 
        solde=solde-montant;
        }
           
    
    public void deposerSomme(double montant){
        solde=solde+montant;
    }
    public double getSolde(){
        return solde;
    }
    public int getNumero(){
        return numero;
    }
    public Personne getTitulaire(){
        return titulaire;
    }
    
}
