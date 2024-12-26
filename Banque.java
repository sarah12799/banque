public class Banque {
    private String nom ;
    private Compte[] comptes = new Compte[100] ;
    private int n=0;
    public Banque(String nom){
        this.nom = nom ;
    }
    
    public void ouvrirCompte(Compte compte){
        comptes[n]=compte;
        n++;
    }
    public Compte rechercherCompte(int numero){
        for(int i=0;i<n; i++){
            if( comptes[i].getNumero()== numero){
                return comptes[i];
            }
        }
        return null ;
    }
   
    
    public void fermerCompte(int numero){
        //chercher la position avec une boucle for est plus optimal qu'utiliser la méthode rechercher.
        int indice=0;
        for(int i=0;i<n; i++){
            if( comptes[i].getNumero()== numero){
                indice=i;
    } 
    }  
       for(int j=indice;j<this.n-1; j++){
           comptes[j]=comptes[j+1];
       }
       n=n-1;}

    

    public void retirer(int numero,double somme){
       rechercherCompte(numero).retirer(somme);
    }
    public void deposer(int numero,double somme){
        rechercherCompte(numero).deposerSomme(somme);
    }
    public String getNom(){
        return nom;
    }
    public Compte[] getComptes(){
        return comptes;
    }
    public int getNombre(){
        return n;
    }
    
}
    


       


