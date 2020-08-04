package comercial.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import comercial.dominio.ComClien;
import comercial.util.HibernateUtil;

public class ComclienDAO {

	public void salvar(ComClien comclien) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(comclien);
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;

		} finally {
			sessao.close();
		}

	}

	@SuppressWarnings("unchecked")
	public List<ComClien> listar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		List<ComClien> clientes = null;

		try {
			Query consulta = sessao.getNamedQuery("ComClien.listar");
			clientes = consulta.list();
		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			sessao.close();
		}
		return clientes;
	}

	public ComClien buscarPorCodigo(int n_numeclien) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		ComClien comclien = null;

		try {
			Query consulta = sessao.getNamedQuery("ComClien.buscarPorCodigo");
			consulta.setInteger("n_numeclien", n_numeclien);

			comclien = (ComClien) consulta.uniqueResult();

		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
		return comclien;

	}

	public void excluir(ComClien comclien) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();

		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.delete(comclien);

			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}

			throw erro;
		} finally {
			sessao.close();
		}
	}

	public void editar(ComClien comclien) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();

		Transaction transacao = null;
	
		try {
			transacao = sessao.beginTransaction();
			
			sessao.update(comclien);
			transacao.commit();
			
		} catch (RuntimeException erro) {
			if(transacao != null) {
				transacao.rollback();
			}throw erro;
			
		}finally {
				sessao.close();
			}
		}
	
	}


