package entidades;
// default package
// Generated 23/01/2014 20:39:53 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pedidos generated by hbm2java
 */
@Entity
@Table(name = "pedidos", catalog = "BD_SSC")
public class Pedidos implements java.io.Serializable {

	private Integer idPedido;
	private Clientes clientes;
	private Float total;
	private Date fecha;
	private String estado;
	private Set<LineaDePedido> lineaDePedidos = new HashSet<LineaDePedido>(0);

	public Pedidos() {
	}

	public Pedidos(Clientes clientes, Float total, Date fecha, String estado,
			Set<LineaDePedido> lineaDePedidos) {
		this.clientes = clientes;
		this.total = total;
		this.fecha = fecha;
		this.estado = estado;
		this.lineaDePedidos = lineaDePedidos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idPedido", unique = true, nullable = false)
	public Integer getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente")
	public Clientes getClientes() {
		return this.clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	@Column(name = "total", precision = 9, scale = 3)
	public Float getTotal() {
		return this.total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "estado", length = 50)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedidos")
	public Set<LineaDePedido> getLineaDePedidos() {
		return this.lineaDePedidos;
	}

	public void setLineaDePedidos(Set<LineaDePedido> lineaDePedidos) {
		this.lineaDePedidos = lineaDePedidos;
	}

}
