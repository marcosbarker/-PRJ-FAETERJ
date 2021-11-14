package faeterj.vavatur.negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepositorioDados {

	private Connection conexao;

	public RepositorioDados(Connection conexao) {
		this.conexao = conexao;
	}

	public Bilhete buscaBilhetePorCodigo(String codigo) throws SQLException {
		try (PreparedStatement stmt = this.conexao.prepareStatement("select * from bilhete where codigo = ?")){
				
				//"SELECT b.codigo as b_codigo, b.assento as b_assento, b.assento_marcado_em as b_assento_marcado_em, p.id as p_id, p.nome as p_nome, p.cpf as p_cpf FROM bilhete b JOIN linha l p.origem as p_origem JOIN passageiro p on b.id_passageiro = p.id WHERE b.codigo = ?")) {
			stmt.setString(1, codigo);
			Bilhete b = null;
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					b = new Bilhete();
					b.setCodigo(rs.getString(1));
					b.setAssento(rs.getString(2));
					b.setDataMarcacao(rs.getDate(3).toLocalDate());
					Passageiro p = new Passageiro();
					b.setPassageiro(p);
					p.setId(rs.getInt(4));
					p.setNome(rs.getString(5));
					p.setCpf(rs.getString(6));
					Linha l = new Linha();
					b.setLinha(l);
					l.setOrigem(rs.getString(7));
					l.setDestino(rs.getString(8));
					l.setHoraEmbarque(rs.getDate(9).toLocalDate());
					l.setHoraPartida(rs.getDate(10).toLocalDate());

				}
			}
			return b;
		}
	}

}
