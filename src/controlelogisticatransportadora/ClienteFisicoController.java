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
public class ClienteFisicoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btnBuscarCPFClienteFisico;
    
    @FXML
    private Button btnSalvarClienteFisico;
    
    @FXML
    private Button btnDeletarClienteFisico;
    
    @FXML
    private Button btnCancelarClienteFisico;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Image cancel = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/cancel.png"));
        Image trash = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/trash.png"));
        Image save = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/save.png"));
        Image search = new Image(getClass().getResourceAsStream("/controlelogisticatransportadora/Imagens/search.png"));
        
        btnCancelarClienteFisico.setGraphic(new ImageView(cancel));
        btnDeletarClienteFisico.setGraphic(new ImageView(trash));
        btnSalvarClienteFisico.setGraphic(new ImageView(save));
        btnBuscarCPFClienteFisico.setGraphic(new ImageView(search));
        
    }    
    
}
