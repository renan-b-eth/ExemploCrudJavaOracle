package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteDeletar {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		Produto p = new Produto();
		
		p.setCodigo(inteiro("Digite o codigo"));
		
		try {
			ProdutoDAO dao = new ProdutoDAO();
			System.out.println(dao.deletar(p));
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
