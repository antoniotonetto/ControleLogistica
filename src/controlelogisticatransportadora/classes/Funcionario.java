/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlelogisticatransportadora.classes;

import java.time.LocalDate;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Artur
 */
public class Funcionario {

    private int idFuncionario;
    private SimpleStringProperty nome;
    private SimpleStringProperty cpf;
    private SimpleStringProperty rg;
    private LocalDate dataNascimento;
    private double salario;
    private SimpleFloatProperty porcentagem;
    private LocalDate dataAdmissao;
    private LocalDate dataRescisao;
    private SimpleStringProperty contato;
    private SimpleStringProperty contato2;
    private SimpleStringProperty endereco;
    private SimpleStringProperty bairro;
    private SimpleStringProperty cidade;
    private SimpleStringProperty estado;
    private SimpleStringProperty cep;
    private Cargo cargo;
}
