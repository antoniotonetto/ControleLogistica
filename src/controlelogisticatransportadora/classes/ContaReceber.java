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
public class ContaReceber {

    private int idContaReceber;
    private Usuario usuario;
    private ClienteJuridico clienteJuridico;
    private ClienteFisico clienteFisico;
    private SimpleDoubleProperty valor;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private SimpleDoubleProperty valorPago;
    private Cte cte;
    
}
