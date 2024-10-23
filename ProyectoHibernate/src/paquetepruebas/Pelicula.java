package paquetepruebas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabla_peliculas")
public class Pelicula {

	
	private String titulo, director, genero;
	
	private int duracion, edad, anyo;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public Pelicula(String titulo, String director, String genero, int duracion, int edad, int anyo) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.duracion = duracion;
		this.edad = edad;
		this.anyo = anyo;
	}
	public Pelicula()
	{
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", genero=" + genero + ", duracion=" + duracion
				+ ", edad=" + edad + ", anyo=" + anyo + ", id=" + id + "]";
	}
	
	
	
}
