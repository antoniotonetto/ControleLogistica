/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlelogisticatransportadora.DAO;

import controlelogisticatransportadora.classes.Cargo;
import controlelogisticatransportadora.classes.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe que faz a comunicação entre a tabela colaborador e a aplicação.
 * É resonsável pela inserção, remoção, alteração e busca de colaboradores.
 * 
 * @author Artur
 */
public class FuncionarioDAO {
    
     private Connection connection = null;
     
    public Funcionario consultarColaboradorPorCPF(String cpfInformado){
        String sql = "SELECT * FROM Funcionario WHERE cpf = " + cpfInformado + " ";
        
        ResultSet resultSet;
        Funcionario funcionario = new Funcionario();
        
        try {
            
            connection = Conexao.conexao();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery(sql);
            
            if(resultSet.next()){
                funcionario.setIdFuncionario(resultSet.getInt("idFuncionario"));
                funcionario.setNome(resultSet.getString("nome"));
                funcionario.setCpf(resultSet.getString("cpf"));
                funcionario.setRg(resultSet.getString("rg"));
                funcionario.setDataNascimento(resultSet.getDate("dataNascimento").toLocalDate());
                funcionario.setSalario(resultSet.getDouble("salario"));
                funcionario.setPorcentagem(resultSet.getFloat("porcentagem"));
                funcionario.setDataAdmissao(resultSet.getDate("dataAdmissao").toLocalDate());
                funcionario.setDataRescisao(resultSet.getDate("dataRescisao").toLocalDate());
                funcionario.setContato(resultSet.getString("contato"));
                funcionario.setContato2(resultSet.getString("contato2"));
                funcionario.setEndereco(resultSet.getString("endereco"));
                funcionario.setBairro(resultSet.getString("bairro"));
                funcionario.setCidade(resultSet.getString("cidade"));
                funcionario.setEstado(resultSet.getString("estado"));
                funcionario.setCep(resultSet.getString("cep"));
                funcionario.setEmail(resultSet.getString("email"));
                
                //Busca e seta o cargo do funcionario
                CargoDAO cargoDAO = new CargoDAO();
                Cargo cargo = cargoDAO.buscarCargoPeloId(resultSet.getInt("id_Cargo"));
                funcionario.setCargo(cargo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return funcionario;
    }
}
