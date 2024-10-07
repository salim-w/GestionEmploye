package ma.projet.services;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.beans.Manager;
import ma.projet.connexion.Connexion;
import ma.projet.dao.IDao;
public class ManagerService implements IDao <Manager> {
    @Override
    public boolean create(Manager m) {
 try {
 String req = "insert into Manager (Id, Nom,Salaire) values(?,?,?)";
 PreparedStatement ps =Connexion.getConnection().prepareStatement(req);
 ps.setInt(1, m.getId());
 ps.setString(2, m.getNom());
  ps.setDouble(3, m.getSalaire());
 if (ps.executeUpdate() == 1) {
 return true;
 }
 } catch (SQLException ex) {
 Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE,
 null, ex);
 }
 return false;
 }
 @Override
 public boolean update(Manager m) {
 try {
 String req = "update Manager set Id = ? , Nom = ? where Id= ?";
 PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
 ps.setInt(1, m.getId());
 ps.setString(2, m.getNom());
 ps.setDouble(3, m.getSalaire());
 if (ps.executeUpdate() == 1) {
 return true;
 }
 } catch (SQLException ex) {
 Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE,
 null, ex);
 }
 return false;
 }
 @Override
 public boolean delete(Manager m) {
 try {
 String req = "delete from Manager where id = ?";
 PreparedStatement ps =Connexion.getConnection().prepareStatement(req);
 ps.setInt(1, m.getId());
 if (ps.executeUpdate() == 1) {
 return true;
 }
 } catch (SQLException ex) {
 Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE,
 null, ex);
 }
 return false;
 }
 @Override
 public Manager getById(int id) {
 Manager manager = null;
 try {
 String req = "select * from Manager where id = ?";
 PreparedStatement ps =
 Connexion.getConnection().prepareStatement(req);
 ps.setInt(1, id);
 ResultSet rs = ps.executeQuery();
 if(rs.next())
 manager = new Manager(rs.getInt("id"),
 rs.getString("nom"), rs.getDouble("salaire"));
 } catch (SQLException ex) {
 Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE,
 null, ex);
 }
 return manager;
 }
 public List<Manager> getAll() {
 List <Manager> managers = new ArrayList<>();
 try {
 String req = "select * from Manager ";
 PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
 ResultSet rs = ps.executeQuery();
 while(rs.next())
 managers.add(new Manager(rs.getInt("id"),
 rs.getString("nom"), rs.getDouble("salaire")));
 } catch (SQLException ex) {
 Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE,
 null, ex);
 }
 return managers;
 }
    @Override
    public List<Manager> getall() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 }


