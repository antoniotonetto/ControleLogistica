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
public class ClienteJuridico {

    private int idClienteJuridico;
    private SimpleStringProperty nomeFantasia;
    private SimpleStringProperty razaoSocial;
    private SimpleStringProperty cnpj;
    private SimpleStringProperty endereco;
    private SimpleStringProperty cidade;
    private SimpleStringProperty estado;
    private SimpleStringProperty cep;
    private SimpleStringProperty bairro;
    private LocalDate dataCadastro;
}
