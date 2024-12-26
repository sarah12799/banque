public class CompteCourant extends Compte {
    final double tax=1;
    public CompteCourant(double solde,int numero,Personne titulaire){
        super(solde,numero,titulaire);

    }
    public void retirer(double montant){
        solde=solde-montant-tax;
    }

   
    
}