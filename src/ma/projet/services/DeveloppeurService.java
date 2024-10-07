package ma.projet.services;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.beans.Developpeur;
import ma.projet.connexion.Connexion;
import ma.projet.dao.IDao;
public class DeveloppeurService implements IDao<Developpeur> {  
 @Override
 public boolean create(Developpeur d) {
 try {
 String req = "insert into Developpeur (Id, Nom,Salaire) values(?,?,?)";
 PreparedStatement ps =Connexion.getConnection().prepareStatement(req);
 ps.setInt(1, d.getId());
 ps.setString(2, d.getNom());
  ps.setDouble(3, d.getSalaire());
 if (ps.executeUpdate() == 1) {
 return true;
 }
 } catch (SQLException ex) {
 Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE,
 null, ex);
 }
 return false;
 }
 @Override
 public boolean update(Developpeur d) {
 try {
 String req = "update Developpeur set Id = ? , Nom = ? where Id= ?";
 PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
 ps.setInt(1, d.getId());
 ps.setString(2, d.getNom());
 ps.setDouble(3, d.getSalaire());
 if (ps.executeUpdate() == 1) {
 return true;
 }
 } catch (SQLException ex) {
 Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE,
 null, ex);
 }
 return false;
 }
 @Override
 public boolean delete(Developpeur d) {
 try {
 String req = "delete from Developpeur where id = ?";
 PreparedStatement ps =
 Connexion.getConnection().prepareStatement(req);
 ps.setInt(1, d.getId());
 if (ps.executeUpdate() == 1) {
 return true;
 }
 } catch (SQLException ex) {
 Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE,
 null, ex);
 }
 return false;
 }
 @Override
 public Developpeur getById(int id) {
 Developpeur developpeur = null;
 try {
 String req = "select * from Developpeur where id = ?";
 PreparedStatement ps =
 Connexion.getConnection().prepareStatement(req);
 ps.setInt(1, id);
 ResultSet rs = ps.executeQuery();
 if(rs.next())
 developpeur = new Developpeur(rs.getInt("id"),
 rs.getString("nom"), rs.getDouble("salaire"));
 } catch (SQLException ex) {
 Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE,
 null, ex);
 }
 return developpeur;
 }
 public List<Developpeur> getAll() {
 List <Developpeur> developpeurs = new ArrayList<>();
 try {
 String req = "select * from Developpeur ";
 PreparedStatement ps =Connexion.getConnection().prepareStatement(req);
 ResultSet rs = ps.executeQuery();
 while(rs.next())
 developpeurs.add(new Developpeur(rs.getInt("id"),
 rs.getString("nom"), rs.getDouble("salaire")));
 } catch (SQLException ex) {
 Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE,
 null, ex);
 }
 return developpeurs;
 }

    @Override
    public List<Developpeur> getall() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 }

