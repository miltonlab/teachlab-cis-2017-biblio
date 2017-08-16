/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbiblioteca;

/**
 *
 * @author miltonlab
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jbiblioteca.modelo.entidades.Autor;
import jbiblioteca.modelo.entidades.Libro;

public class JBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro  libro = new Libro("123-677-23-123456", "El Quijote", 40.0, "Lengua");
        Autor autor = new Autor();
        autor.setNombres("Angel");
        autor.setApellidos("Valdivia");
        Autor autor2 = new Autor();
        autor2.setNombres("Maria");
        autor2.setApellidos("Paredes");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JBibliotecaUP");
        EntityManager em =  emf.createEntityManager();
        try {
            em.getTransaction().begin();
            //em.persist(libro);
            //em.persist(autor2);
            em.getTransaction().commit();
            System.out.println("...");
        } catch (Exception e) {
            System.out.println("Error " + e);
        } finally{
            em.close();
        }
    }
}
