/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author Arthur
 */
public class UsuarioDAO {
    public final String tabela = "Usuario";
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("aeroporto");
    EntityManager manager = factory.createEntityManager();
    
    public boolean registrar(Usuario usuario){
        manager.getTransaction().begin();
        manager.persist(usuario);
        manager.getTransaction().commit();
        
        return true;
    }
    
    public List<Usuario> obterUsuarioPorEmail(String email){
        manager.getTransaction().begin();
        Query query =  manager.createQuery("SELECT e FROM " + tabela + " e WHERE email = " + "'" + email + "'").setMaxResults(1);
        List<Usuario> usuario = query.getResultList();
        manager.getTransaction().commit();
  
        return usuario;
    }
    
    public int obterIdUsuarioPorEmail(String email){
        manager.getTransaction().begin();
        Query query =  manager.createQuery("SELECT e FROM " + tabela + " e WHERE email = " + "'" + email + "'").setMaxResults(1);
        List<Usuario> usuario = query.getResultList();
        manager.getTransaction().commit();
        
        for (Usuario user : usuario) {
            return user.getId();
        }
        
        return 0;
    }
    
    
}
