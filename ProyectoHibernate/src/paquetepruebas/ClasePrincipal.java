package paquetepruebas;



import java.io.File;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class ClasePrincipal {
	static StandardServiceRegistry s=null;
	static SessionFactory sf=null;
	private static void abrirConexion()
	{
		File f = new File("hibernate.cfg.xml");
		 s=new StandardServiceRegistryBuilder().configure(f).build();
		 sf=new MetadataSources(s).buildMetadata().buildSessionFactory();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//public Pelicula(String titulo, String director, String genero, int duracion, int edad, int anyo) {
	Pelicula peli=new Pelicula("Superman II", "Ni idea", "Ciencia Ficcion +++",	120,8,1981);
		abrirConexion();
		Session sesion=sf.openSession();
		/*Transaction t=sesion.beginTransaction();
		sesion.save(peli);
		
		t.commit();*/
		Query q=sesion.createQuery("FROM Pelicula");
		List lista=q.getResultList();
		System.out.println(lista.get(0).toString());
	}

}
