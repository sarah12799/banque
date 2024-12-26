public class CompteEpargne extends Compte {

    public CompteEpargne(double solde,int numero,Personne titulaire){
        super(solde,numero,titulaire);

    }
    public void retirer(double montant){
        solde=solde-montant;
    }
}
    

