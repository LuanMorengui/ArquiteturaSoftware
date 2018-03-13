package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;

public class ChamadoDAO {
	public ArrayList<Chamado> listarChamados(Fila fila) throws IOException {
		String query = "select * from Chamado where id_fila= ?";
		
		ArrayList<Chamado> Listachamados = new ArrayList<>();
		try(Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pst = conn.prepareStatement(query);
				
				
			ResultSet rs = pst.executeQuery();){
			
			while(rs.next()) {
				Chamado chamado = new Chamado();
				chamado.setId(rs.getInt("ID_CHAMADO"));
				chamado.setDesc(rs.getString("DESCRICAO"));
				chamado.setStatus(rs.getString("STATUS"));
				chamado.setDt_Abertura(rs.getDate("DT_ABERTURA"));
				chamado.setDt_Fechamento(rs.getDate("DT_FECHAMENTO"));
				chamado.setFila(new Fila());
				chamado.getFila().setId(rs.getInt("Id_fila"));
				Listachamados.add(chamado);
			}
			
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return Listachamados;
	}

}
