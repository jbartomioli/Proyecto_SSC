package entidades;
// default package
// Generated 23/01/2014 20:39:53 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Subcategorias generated by hbm2java
 */
@Entity
@Table(name = "subcategorias", catalog = "BD_SSC")
public class Subcategorias implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3029124354805262694L;
	private SubcategoriasId id;
	private Categorias categorias;
	private String descripcion;
	private Set<Productos> productoses = new HashSet<Productos>(0);

	public Subcategorias() {
	}

	public Subcategorias(SubcategoriasId id, Categorias categorias) {
		this.id = id;
		this.categorias = categorias;
	}

	public Subcategorias(SubcategoriasId id, Categorias categorias,
			String descripcion, Set<Productos> productoses) {
		this.id = id;
		this.categorias = categorias;
		this.descripcion = descripcion;
		this.productoses = productoses;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idSubcategoria", column = @Column(name = "idSubcategoria", nullable = false)),
			@AttributeOverride(name = "idCategoria", column = @Column(name = "idCategoria", nullable = false)) })
	public SubcategoriasId getId() {
		return this.id;
	}

	public void setId(SubcategoriasId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCategoria", nullable = false, insertable = false, updatable = false)
	public Categorias getCategorias() {
		return this.categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	@Column(name = "descripcion", length = 50)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subcategorias")
	public Set<Productos> getProductoses() {
		return this.productoses;
	}

	public void setProductoses(Set<Productos> productoses) {
		this.productoses = productoses;
	}

}
