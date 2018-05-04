/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author 80923755268
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField txtn1;
    @FXML
    private TextField txtn2;
    @FXML
    private TextField txtresult;
    @FXML
    private Button botsoma;
    @FXML
    private MenuItem mnalunos;
    @FXML
    private MenuItem mnfechar;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void somar(ActionEvent event) {
        double n1 = Double.parseDouble(txtn1.getText());
        double n2 = Double.parseDouble(txtn2.getText());
        double resultado = n1+ n2;
        txtresult.setText(Double.toString(resultado));  
    }

    @FXML
    private void mnalunos(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),900,682);
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Aluno");
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){

        }
    }

    @FXML
    private void mnfechar(ActionEvent event) {
    }
    
}
