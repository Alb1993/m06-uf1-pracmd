/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import aplicacion.ImportarDatosLogic;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.xml.bind.JAXBException;
import modelo.Row;


/**
 *
 * @author Albert
 */
public class PrimaryController implements Initializable {
    
    private ImportarDatosLogic idl;  
    
    private ArrayList<Row> delitos;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnExport;

    @FXML
    private ToggleButton btnSwitch;

    @FXML
    private TextField txtSearch;

    @FXML
    private Button btnDoc;

    @FXML
    private Button btnImport;
    
     @FXML
    void onClick_importar(ActionEvent event) {
       
        try {
            //carrgamos los delitos
            idl.caregarDelitos();
            //una vez cargados los delitos los obtenemos y añadimos el array delitos
            delitos.addAll(idl.getDelitos());
        } catch (JAXBException ex) {
            System.out.println("error");
        }
        
         for (int i = 0; i < 5; i++) {
            System.out.println(delitos.get(i).toString());
        }
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //iniciamos una nueva instancia de la clase ImportarDatosLogic
        idl = new ImportarDatosLogic();
        //iniciamos  el array de delitos
        delitos = new ArrayList();
         
    }
    
}

