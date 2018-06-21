/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlelogisticatransportadora.classes;

import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author Artur
 */
public class Viagem {
   
    private int idViagem;
    private Veiculo veiculo;
    private long kmInicial;
    private long kmFinal;
    private long qtdeKmPrevisto;
    private SimpleDoubleProperty qtdeCombustivelPrevisto;
    private SimpleDoubleProperty qtdeCombustivelReal;
    private Cte cte;
}
