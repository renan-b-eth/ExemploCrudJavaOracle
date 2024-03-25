package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProdutoDAO {
	
	public Connection minhaconexao;

	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaconexao = new ConexaoFactory().conexao();
	}
	
	// insert
	
	public String inserir(Produto produto) throws SQLException {
		
		PreparedStatement stmt = minhaconexao.prepareStatement("INSERT INTO T_FIAP_PRODUTO values (?,?,?,?)");
		stmt.setInt(1, produto.getCodigo());
		stmt.setString(2, produto.getTipo());
		stmt.setString(3, produto.getMarca());
		stmt.setDouble(4, produto.getValor());
		
		stmt.execute();
		stmt.close();
		
		
		return "Cadastrado com sucesso";
	}
	
	public String deletar(Produto produto) throws SQLException {
		PreparedStatement stmt = minhaconexao.prepareStatement("DELETE FROM T_FIAP_PRODUTO WHERE = ? ");
		stmt.setInt(1, produto.getCodigo());
		
		stmt.execute();
		stmt.close();
	
		return "produto deletado com sucesso";
	}
	
	public String atualizar()

}
