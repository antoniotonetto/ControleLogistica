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

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlaca() {
        return placa.get();
    }

    public void setPlaca(SimpleStringProperty placa) {
        this.placa = placa;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo.get();
    }

    public void setModeloVeiculo(SimpleStringProperty modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public SimpleDoubleProperty getPesoTara() {
        return pesoTara;
    }

    public void setPesoTara(SimpleDoubleProperty pesoTara) {
        this.pesoTara = pesoTara;
    }

    public String getPlacaCarreta() {
        return placaCarreta.get();
    }

    public void setPlacaCarreta(SimpleStringProperty placaCarreta) {
        this.placaCarreta = placaCarreta;
    }

    public String getAnoVeiculo() {
        return anoVeiculo.get();
    }

    public void setAnoVeiculo(SimpleStringProperty anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public SimpleDoubleProperty getMediaKmLitro() {
        return mediaKmLitro;
    }

    public void setMediaKmLitro(SimpleDoubleProperty mediaKmLitro) {
        this.mediaKmLitro = mediaKmLitro;
    }

   
}

