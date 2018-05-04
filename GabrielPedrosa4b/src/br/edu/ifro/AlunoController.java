/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.Modelo.Aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 80923755268
 */
public class AlunoController implements Initializable {

    @FXML
    private TextField txtnome;
    @FXML
    private Button botaluno_cadastar;
    @FXML
    private Button botaluno_fechar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void botaluno_cadastar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Aluno a = new Aluno();
        a.setNome(txtnome.getText());
        
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
    }

    @FXML
    private void botaluno_fechar(ActionEvent event) {
    }
    
}
