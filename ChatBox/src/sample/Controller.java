package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class Controller {
    @FXML
    VBox vBox;
    @FXML
    TextField txtMnesaje;
    public void enter(KeyEvent event){
        if(event.getCode() == KeyCode.ENTER){
            Label label= new Label("Usuario:"+txtMnesaje.getText());
             vBox.getChildren().add(label);

            String respuesta = chatBot(txtMnesaje.getText().toLowerCase());
            Label label2 = new Label(respuesta);
            vBox.getChildren().add(label2);
        }
    }
    boolean pidioPieza=false;
    public String chatBot(String mensaje ){
        String respuesta= "Chat Bot: Podrias repetir la pregunta, por favor";
        if(mensaje.contains("hola")){
            respuesta= "Chat Bot: Bien, bien, tu que tal?";
        }else if(mensaje.contains("pieza")){
            respuesta= "Chat Bot: Escriba marca, modelo y que tipo de pieza requiere";
            pidioPieza=true;
        }else if(pidioPieza){
            String[] datos=mensaje.split(" ");
            String modelo=datos[1];
            int indice1= mensaje.indexOf(modelo)+modelo.length();
            int indice2 = mensaje.length();
            String pieza= mensaje.substring(indice1, indice2);
            respuesta="Chat Bot: La pieza "+pieza+" del auto "+datos[0]+" "+datos[1]+" Si la tenemos en existencia ";
            pidioPieza=false;
        }
        return respuesta;
    }
}
