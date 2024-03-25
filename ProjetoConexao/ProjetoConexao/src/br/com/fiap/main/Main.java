package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class Main {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Produto p = new Produto();
		
		ProdutoDAO dao = new ProdutoDAO();
		
		p.setCodigo(inteiro("Codigo"));
		p.setTipo(texto("Tipo de produto"));
		p.setMarca(texto("Tipo de marca"));
		p.setValor(real("Digite o valor:"));
		
		
		System.out.println(dao.deletar(p));
	}

}
