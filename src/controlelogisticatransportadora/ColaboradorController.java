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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Artur
 */
public class ColaboradorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
     @FXML
     private Button btnSalvarColaborador;
     
     @FXML
     private Button btnDeletarColaborador;
     
     @FXML
     private Button btnCancelarColaborador;
     
     @FXML
     private Button btnBuscarCargo;
    
     @FXML
     private Button btnBuscarCPFColaborador;
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Image cancel = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/cancel.png"));
        Image trash = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/trash.png"));
        Image save = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/save.png"));
        Image search = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/search.png"));
        
        btnCancelarColaborador.setGraphic(new ImageView(cancel));
        btnDeletarColaborador.setGraphic(new ImageView(trash));
        btnSalvarColaborador.setGraphic(new ImageView(save));
        btnBuscarCargo.setGraphic(new ImageView(search));
        btnBuscarCPFColaborador.setGraphic(new ImageView(search));
    }    
    
}
