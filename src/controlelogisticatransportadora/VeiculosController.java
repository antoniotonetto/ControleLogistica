/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlelogisticatransportadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Artur
 */

    
public class VeiculosController implements Initializable {

    @FXML
    private Button btnCancelar;
    
    @FXML
    private Button btnDeletarVeiculo;
    
    @FXML
    private Button btnSalvar;
    
     @FXML
    private Button btnBuscarPlaca;
     
      @FXML
    private Button btnBuscarFuncionario;
      
     @FXML
     private TextField txtPlaca;
     
     @FXML
     private TextField txtModelo;
     
     @FXML
     private TextField txtPesoTara;
     
     @FXML
     private TextField txtAno;
     
     @FXML
     private TextField txtPlacaCarreta;
     
     @FXML
     private TextField txtKM;
     
     @FXML
     private TextField txtMediaKmLitro;
     
     @FXML
     private TextField txtFuncionario;
     
      
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Image cancel = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/cancel.png"));
        Image trash = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/trash.png"));
        Image save = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/save.png"));
        Image search = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/search.png"));
        
        btnCancelar.setGraphic(new ImageView(cancel));
        btnDeletarVeiculo.setGraphic(new ImageView(trash));
        btnSalvar.setGraphic(new ImageView(save));
        btnBuscarPlaca.setGraphic(new ImageView(search));
        btnBuscarFuncionario.setGraphic(new ImageView(search));
    }    
    
}
