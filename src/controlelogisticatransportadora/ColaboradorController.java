/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlelogisticatransportadora;

import controlelogisticatransportadora.DAO.FuncionarioDAO;
import controlelogisticatransportadora.classes.Funcionario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Artur
 */
public class ColaboradorController implements Initializable {

    /**
     * ===========================Atributos=========================
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

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField txtNomeColaborador;

    @FXML
    private TextField txtCpfColaborador;

    @FXML
    private TextField txtRGColaborador;

    @FXML
    private DatePicker dataNascimentoColaborador;

    @FXML
    private TextField txtEndereco;

    @FXML
    private TextField txtBairroColaborador;

    @FXML
    private TextField txtCEPColaborador;

    @FXML
    private TextField txtCidadeColaborador;

    @FXML
    private ComboBox comboBoxEstadoColaborador;

    @FXML
    private TextField txtContato;

    @FXML
    private TextField txtContato1;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtCargo;

    @FXML
    private DatePicker dataAdmissao;

    @FXML
    private DatePicker dataRescisao;

    @FXML
    private TextField txtSalario;

    @FXML
    private TextField txtPorcentagem;

    Funcionario funcionario = new Funcionario();

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

    /**
     * Metodo que através do CPF busca e lista o funcionário cadastrado ou
     * oferece ao usuário a opção de inserção de um novo funcionário.
     *
     * @param action
     */
    @FXML
    protected void buscarCPF(ActionEvent action) {
        String cpfInformado = txtCPF.getText();

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionario = funcionarioDAO.consultarColaboradorPorCPF(cpfInformado);

        if (funcionario != null) {
            Alert confirmacao = new Alert(Alert.AlertType.INFORMATION);
            confirmacao.setTitle("Buscar Funcionário");
            confirmacao.setHeaderText("Funcionário encontrado atráves do CPF: " + cpfInformado + " ");
            confirmacao.showAndWait();

            //Dados Pessoais do Funcionário
            txtNomeColaborador.setText(funcionario.getNome());
            txtCpfColaborador.setText(funcionario.getCpf());
            txtRGColaborador.setText(funcionario.getRg());
            dataNascimentoColaborador.setValue(funcionario.getDataNascimento());
            txtEndereco.setText(funcionario.getEndereco());
            txtBairroColaborador.setText(funcionario.getBairro());
            txtCEPColaborador.setText(funcionario.getCep());
            txtCidadeColaborador.setText(funcionario.getCidade());
            comboBoxEstadoColaborador.getSelectionModel().select(funcionario.getEstado());
            txtContato.setText(funcionario.getContato());
            txtContato1.setText(funcionario.getContato2());
            txtEmail.setText(funcionario.getEmail());

            //Dados Financeiros do Funcionário
            txtCargo.setText(funcionario.getCargo().getDescricao());
            dataAdmissao.setValue(funcionario.getDataAdmissao());
            dataRescisao.setValue(funcionario.getDataRescisao());
            txtSalario.setText(String.valueOf(funcionario.getSalario()));
            txtPorcentagem.setText(String.valueOf(funcionario.getPorcentagem()));

        } else {
            Alert informacao = new Alert(Alert.AlertType.INFORMATION);
            informacao.setTitle("Buscar Funcionário");
            informacao.setHeaderText("Não foi encontrado nenhum funcionário com esse CPF!");
            informacao.showAndWait();
        }
    }

    @FXML
    protected void salvarFuncionario(ActionEvent action) {
        getAtributosFuncionario();
       
        
    }
    
    private void getAtributosFuncionario(){
        
        //Coletar todos os atributos e setar no funcionario para poder salvar;
        funcionario.setNome(txtNomeColaborador.getText());
        funcionario.setCpf(txtCPF.getText());
        funcionario.setRg(txtRGColaborador.getText());
        funcionario.setDataNascimento(dataNascimentoColaborador.getValue());
        funcionario.setEndereco(txtEndereco.getText());
        funcionario.setBairro(txtBairroColaborador.getText());
        funcionario.setCep(txtCEPColaborador.getText());
        funcionario.setCidade(txtCidadeColaborador.getText());
        funcionario.setEstado(comboBoxEstadoColaborador.getValue().toString());
        funcionario.setContato(txtContato.getText());
        funcionario.setContato2(txtContato1.getText());
        funcionario.setEmail(txtEmail.getText());
        
        //funcionario.setCargo();
        funcionario.setDataAdmissao(dataAdmissao.getValue());
        funcionario.setDataRescisao(dataRescisao.getValue());
        funcionario.setSalario(Double.parseDouble(txtSalario.getText()));
        funcionario.setPorcentagem(Float.parseFloat(txtPorcentagem.getText()));
    }
}
