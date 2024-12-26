public class Main {
    public static void main(String[] args) throws Exception {
      //creation de deux personnes
        Personne p1=new Personne(123,"anon","sarra",21);
        Personne p2=new Personne(123,"chemli","emna",22);
        Personne p3=new Personne(245,"tlili","fatma",19);
        Personne p4=new Personne(678,"tlili","syrine",20);

    //creation d'une banque contenant 2 comptes

        Banque b=new Banque("la banque");

        Compte c1=new Compte(500,111,p1);
        Compte c2=new Compte(500,222,p2);
        CompteCourant c3=new CompteCourant(800,333,p3);
        CompteEpargne c4=new CompteEpargne(1000,444,p4);
        b.ouvrirCompte(c1);
       // b.ouvrirCompte(c2);
        b.ouvrirCompte(c3);
        b.ouvrirCompte(c4);

        afficherBanque(b);

        //deposer 200 dans le compte c2 
       // b.deposer(c2.getNumero(),200);
       // System.out.println("le compte apres depot");
       // afficherCompte(c2);

        //retirer 200 du compte c1 et changer son nom
        b.retirer(c1.getNumero(),200);
        c1.getTitulaire().setNom("tlili");
        System.out.println("le compte apres retrait");
        afficherCompte(c1);
        
        //fermerture du compte c1
       // b.fermerCompte(c1.getNumero());
       // System.out.println("la banque apres fermeture du compte");
       // afficherBanque(b);    
        
        //test du retrait d'un compte courant
        b.retirer(c3.getNumero(),200);
        System.out.println("le compte apres retrait");
        afficherCompte(c3);

        //test du retrait d'un compte epargne
        b.retirer(c4.getNumero(),200);
        System.out.println("le compte apres retrait");
        afficherCompte(c4);
        



    }

    private static void afficherPersonne(Personne p) {
        System.out.println("nom : "+p.getNom());
        System.out.println("prenom : "+p.getPrenom());
        System.out.println("cin : "+p.getCin());
        System.out.println("age : "+p.getAge());
    }
    private static void afficherCompte(Compte c) {
        
        System.out.println("numero : "+c.getNumero());
        System.out.println("solde : "+c.getSolde());
        System.out.println("le titulaire de ce compte est: ");
        afficherPersonne(c.getTitulaire());
    }
    private static void afficherBanque(Banque banque) {
        System.out.println("le nom de la banque est : "+banque.getNom());
        System.out.println("les comptes ouverts dans la banque : ");
        for(int i=0;i<banque.getNombre();i++){
            afficherCompte(banque.getComptes()[i]);
        }
        
    }
}
