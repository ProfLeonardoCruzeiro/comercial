package comercial.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ComVenda {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int n_numevenda;
	@Column(length = 10, nullable = false)
	private String c_codivenda;
	@Column(nullable = false, precision = 7, scale = 2)
	private float n_valovenda;
	@Column(nullable = false, precision = 7, scale = 2)
	private float n_descvenda;
	@Column(nullable = false, precision = 7, scale = 2)	
	private float n_totavenda;
	
	@ManyToOne
	@JoinColumn(nullable =false)
	private ComClien comclien;

	public int getN_numevenda() {
		return n_numevenda;
	}

	public void setN_numevenda(int n_numevenda) {
		this.n_numevenda = n_numevenda;
	}

	public String getC_codivenda() {
		return c_codivenda;
	}

	public void setC_codivenda(String c_codivenda) {
		this.c_codivenda = c_codivenda;
	}

	public float getN_valovenda() {
		return n_valovenda;
	}

	public void setN_valovenda(float n_valovenda) {
		this.n_valovenda = n_valovenda;
	}

	public float getN_descvenda() {
		return n_descvenda;
	}

	public void setN_descvenda(float n_descvenda) {
		this.n_descvenda = n_descvenda;
	}

	public float getN_totavenda() {
		return n_totavenda;
	}

	public void setN_totavenda(float n_totavenda) {
		this.n_totavenda = n_totavenda;
	}

	public ComClien getComclien() {
		return comclien;
	}

	public void setComclien(ComClien comclien) {
		this.comclien = comclien;
	}
	
	
}
