package comercial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import comercial.dao.ComclienDAO;
import comercial.dominio.ComClien;


public class ComclienDAOTest {
	
	@Ignore
	@Test
	public void salvar() throws ParseException{
		ComClien c1 = new ComClien();
		
		c1.setC_codiclien("12563");
		c1.setC_nomeclien("bette&lili");
		c1.setC_razaclien("bette&lili");
		c1.setC_cnpjclien("01.152.585/0001-23");
		c1.setC_cidaclien("Ceilandia");
		c1.setC_estaclien("Brasilia");
		c1.setC_foneclien("3563-9625");
		c1.setD_dataclien(new SimpleDateFormat("dd/MM/yyyy").parse("30/06/2020"));
		
		ComclienDAO dao= new ComclienDAO();
		
		dao.salvar(c1);
	}
	@Ignore
	@Test
	public void listar() {
		ComclienDAO dao = new ComclienDAO();
		
		List<ComClien> clientes = dao.listar();
		
		for(ComClien cliente : clientes) {
			System.out.println(cliente);
		}
		
	}
	
	@Test
	public void buscarPorCodigo() {
		ComclienDAO dao = new ComclienDAO();
		
		ComClien c1 = dao.buscarPorCodigo(8);
		ComClien c2 = dao.buscarPorCodigo(10);
		
		System.out.println(c1);
		System.out.println(c2);
	}
	
	
	
	
}
