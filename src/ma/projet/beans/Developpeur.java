package ma.projet.beans;
public class Developpeur extends Personne {
    public Developpeur() {
    }
    public Developpeur(int id, String nom, double salaire) {
        super(id, nom, salaire);
    }
    public Developpeur(String nom, double salaire) {
        super(nom, salaire);
    }
    @Override
    public void setSalaire(double salaire) {
    }
    @Override
    public double getSalaire() {
        return super.getSalaire(); 
    }
    @Override
    public void setNom(String nom) {
        super.setNom(nom); 
    }
    @Override
    public String getNom() {
        return super.getNom(); 
    }
    @Override
    public void setId(int id) {
        super.setId(id);
    }
    @Override
    public int getId() {
        return super.getId(); 
    } 
}
    
    

    