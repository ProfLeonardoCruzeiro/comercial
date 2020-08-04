package comercial.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@NamedQueries({
@NamedQuery (name = "ComClien.listar", 
query = "SELECT ComClien FROM ComClien ComClien"),

@NamedQuery (name = "ComClien.buscarPorCodigo", 
query ="SELECT ComClien FROM ComClien ComClien "
		+ "where ComClien.n_numeclien = :n_numeclien")
	})
public class ComClien {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int    n_numeclien;
	@Column(length = 10, nullable = false)
	private String c_codiclien;
	@Column(length = 100, nullable= false)
	private String c_nomeclien;
	@Column(length = 100, nullable = false)
	private String c_razaclien;
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date   d_dataclien;
	@Column(length = 30, nullable = false)
	private String c_cnpjclien;
	@Column(length = 20, nullable= false)
	private String c_foneclien;
	@Column(length = 50, nullable = false)
	private String c_cidaclien;
	@Column(length = 100, nullable = false)
	private String c_estaclien;
	
	
	public int getN_numeclien() {
		return n_numeclien;
	}
	public void setN_numeclien(int n_numeclien) {
		this.n_numeclien = n_numeclien;
	}
	public String getC_codiclien() {
		return c_codiclien;
	}
	public void setC_codiclien(String c_codiclien) {
		this.c_codiclien = c_codiclien;
	}
	public String getC_nomeclien() {
		return c_nomeclien;
	}
	public void setC_nomeclien(String c_nomeclien) {
		this.c_nomeclien = c_nomeclien;
	}
	public String getC_razaclien() {
		return c_razaclien;
	}
	public void setC_razaclien(String c_razaclien) {
		this.c_razaclien = c_razaclien;
	}
	public Date getD_dataclien() {
		return d_dataclien;
	}
	public void setD_dataclien(Date d_dataclien) {
		this.d_dataclien = d_dataclien;
	}
	public String getC_cnpjclien() {
		return c_cnpjclien;
	}
	public void setC_cnpjclien(String c_cnpjclien) {
		this.c_cnpjclien = c_cnpjclien;
	}
	public String getC_foneclien() {
		return c_foneclien;
	}
	public void setC_foneclien(String c_foneclien) {
		this.c_foneclien = c_foneclien;
	}
	public String getC_cidaclien() {
		return c_cidaclien;
	}
	public void setC_cidaclien(String c_cidaclien) {
		this.c_cidaclien = c_cidaclien;
	}
	public String getC_estaclien() {
		return c_estaclien;
	}
	public void setC_estaclien(String c_estaclien) {
		this.c_estaclien = c_estaclien;
	}
	@Override
	public String toString() {
		return "ComClien [n_numeclien=" + n_numeclien + ", c_codiclien=" + c_codiclien + ", c_nomeclien=" + c_nomeclien
				+ ", c_razaclien=" + c_razaclien + ", d_dataclien=" + d_dataclien + ", c_cnpjclien=" + c_cnpjclien
				+ ", c_foneclien=" + c_foneclien + ", c_cidaclien=" + c_cidaclien + ", c_estaclien=" + c_estaclien
				+ "]";
	}
	
	
	
}
