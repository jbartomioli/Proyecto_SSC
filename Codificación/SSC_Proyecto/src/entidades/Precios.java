package entidades;
// default package
// Generated 21/01/2014 08:02:06 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Precios generated by hbm2java
 */
@Entity
@Table(name = "precios", catalog = "BD_SSC")
public class Precios implements java.io.Serializable {

	private PreciosId id;
	private Productos productos;
	private Date fechaDesde;
	private Date fechaHasta;
	private Float precio;
	private Float precioPromocional;

	public Precios() {
	}

	public Precios(PreciosId id, Productos productos) {
		this.id = id;
		this.productos = productos;
	}

	public Precios(PreciosId id, Productos productos, Date fechaDesde,
			Date fechaHasta, Float precio, Float precioPromocional) {
		this.id = id;
		this.productos = productos;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
		this.precio = precio;
		this.precioPromocional = precioPromocional;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idPrecio", column = @Column(name = "idPrecio", nullable = false)),
			@AttributeOverride(name = "idProducto", column = @Column(name = "idProducto", nullable = false)) })
	public PreciosId getId() {
		return this.id;
	}

	public void setId(PreciosId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto", nullable = false, insertable = false, updatable = false)
	public Productos getProductos() {
		return this.productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaDesde", length = 19)
	public Date getFechaDesde() {
		return this.fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaHasta", length = 19)
	public Date getFechaHasta() {
		return this.fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	@Column(name = "precio", precision = 8)
	public Float getPrecio() {
		return this.precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	@Column(name = "precioPromocional", precision = 15, scale = 3)
	public Float getPrecioPromocional() {
		return this.precioPromocional;
	}

	public void setPrecioPromocional(Float precioPromocional) {
		this.precioPromocional = precioPromocional;
	}

}
