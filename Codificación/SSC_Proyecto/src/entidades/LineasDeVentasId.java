package entidades;
// default package
// Generated 23/01/2014 20:39:53 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LineasDeVentasId generated by hbm2java
 */
@Embeddable
public class LineasDeVentasId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2063878779954861057L;
	private int idLinea;
	private int idVenta;

	public LineasDeVentasId() {
	}

	public LineasDeVentasId(int idLinea, int idVenta) {
		this.idLinea = idLinea;
		this.idVenta = idVenta;
	}

	@Column(name = "idLinea", nullable = false)
	public int getIdLinea() {
		return this.idLinea;
	}

	public void setIdLinea(int idLinea) {
		this.idLinea = idLinea;
	}

	@Column(name = "idVenta", nullable = false)
	public int getIdVenta() {
		return this.idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LineasDeVentasId))
			return false;
		LineasDeVentasId castOther = (LineasDeVentasId) other;

		return (this.getIdLinea() == castOther.getIdLinea())
				&& (this.getIdVenta() == castOther.getIdVenta());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdLinea();
		result = 37 * result + this.getIdVenta();
		return result;
	}

}
