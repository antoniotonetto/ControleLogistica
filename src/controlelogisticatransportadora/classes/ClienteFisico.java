/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlelogisticatransportadora.classes;

import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Artur
 */
public class ClienteFisico {
    
    private int idClienteFisico;
    private SimpleStringProperty nomeCliente;
    private SimpleStringProperty cpf;
    private SimpleStringProperty endereço;
    private SimpleStringProperty bairro;
    private SimpleStringProperty cidade;
    private SimpleStringProperty estado;
    private SimpleStringProperty cep;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;
}
