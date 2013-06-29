package main.java;

// Generated 27/06/2013 20:12:59 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categorias generated by hbm2java
 */
@Entity
@Table(name = "categorias", catalog = "BD_SSC")
public class Categorias implements java.io.Serializable {

	private Integer idCategoria;
	private String descripcion;
	private Set<Subcategorias> subcategoriases = new HashSet<Subcategorias>(0);

	public Categorias() {
	}

	public Categorias(String descripcion, Set<Subcategorias> subcategoriases) {
		this.descripcion = descripcion;
		this.subcategoriases = subcategoriases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idCategoria", unique = true, nullable = false)
	public Integer getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Column(name = "descripcion", length = 50)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorias")
	public Set<Subcategorias> getSubcategoriases() {
		return this.subcategoriases;
	}

	public void setSubcategoriases(Set<Subcategorias> subcategoriases) {
		this.subcategoriases = subcategoriases;
	}

}
