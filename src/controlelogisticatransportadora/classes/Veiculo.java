/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlelogisticatransportadora.classes;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Artur
 */
public class Veiculo {

    private int idVeiculo;
    private SimpleStringProperty placa;
    private SimpleStringProperty modeloVeiculo;
    private SimpleDoubleProperty pesoTara;
    private SimpleStringProperty placaCarreta;
    private SimpleStringProperty anoVeiculo;
    private long km;
    private Funcionario funcionario;
    private SimpleDoubleProperty mediaKmLitro;
}
