package ma.projet.test;
import java.util.List;
import ma.projet.beans.Developpeur;
import ma.projet.beans.Manager;
import ma.projet.services.DeveloppeurService;
import ma.projet.services.ManagerService;
public class Entreprise {
    public static void main(String[] args) {
        Developpeur develop1 = new Developpeur("Salim",10000); 
        Developpeur develop2 = new Developpeur("Saad",10000); 
        Manager manager = new Manager ("Samidi",14000);
        Developpeur develop3 = new Developpeur("ouarda",11000); 
        DeveloppeurService developpeurService = new DeveloppeurService();
        ManagerService managerservice =new ManagerService ();
        developpeurService.create(develop1);
        developpeurService.create(develop2);
        developpeurService.create(develop3);
        managerservice.create(manager);
        Manager Directgen =new Manager ("Sobhi",20000);
        managerservice.create(Directgen);
        System.out.println("Voici la hearchie de l'entreprise");
        System.out.println("le Directeur Général c'est  : " + Directgen.getNom() +  "  son  Salaire :" 
             + Directgen.getSalaire());  
        System.out.println("le Manager c'est:" + manager.getNom() + "- Salaire:" + manager.getSalaire());
        System.out.println("les Développeurs gérés par le manager sont :");
        List<Developpeur> developpeurs = developpeurService.getAll();
        for (Developpeur dev : developpeurs) {
        System.out.println("Développeur: " + dev.getNom() + " - Salaire: " + dev.getSalaire());
        }
        System.out.println("Développeur direct sous la responsabilité du Directeur Général: "
                + develop3.getNom() + " - Salaire: " + develop3.getSalaire());
    }
}
