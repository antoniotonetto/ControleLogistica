/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlelogisticatransportadora.classes;

import java.time.LocalDate;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author Artur
 */
public class ContaPagar {
 
    private int idContaPagar;
    private TipoConta tipoConta;
    private SimpleDoubleProperty valor;
    private LocalDate dataPagamento;
    private LocalDate dataVencimento;
    private Usuario usuario;
    private Viagem viagem;
}
