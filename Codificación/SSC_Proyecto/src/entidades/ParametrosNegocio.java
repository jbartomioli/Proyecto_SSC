package entidades;
// default package
// Generated 01/02/2014 00:38:44 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ParametrosNegocio generated by hbm2java
 */
@Entity
@Table(name = "parametrosNegocio", catalog = "BD_SSC")
public class ParametrosNegocio implements java.io.Serializable {

	private Integer idParametro;
	private String membrete;
	private Integer ultIdPedido;

	public ParametrosNegocio() {
	}

	public ParametrosNegocio(String membrete, Integer ultIdPedido) {
		this.membrete = membrete;
		this.ultIdPedido = ultIdPedido;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idParametro", unique = true, nullable = false)
	public Integer getIdParametro() {
		return this.idParametro;
	}

	public void setIdParametro(Integer idParametro) {
		this.idParametro = idParametro;
	}

	@Column(name = "membrete", length = 500)
	public String getMembrete() {
		return this.membrete;
	}

	public void setMembrete(String membrete) {
		this.membrete = membrete;
	}

	@Column(name = "ultIdPedido")
	public Integer getUltIdPedido() {
		return this.ultIdPedido;
	}

	public void setUltIdPedido(Integer ultIdPedido) {
		this.ultIdPedido = ultIdPedido;
	}

}
