package ma.projet.beans;
public class Manager extends Personne {
    public Manager() {
    }
    public Manager(int id, String nom, double salaire) {
        super(id, nom, salaire);
    }
    public Manager(String nom, double salaire) {
        super(nom, salaire);
    }
    @Override
    public void setSalaire(double salaire) {
        super.setSalaire(salaire); 
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

    