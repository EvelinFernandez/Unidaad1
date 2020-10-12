package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField txtFrase;
    @FXML
    Label lblResultado;
    @FXML
    ComboBox comboBox;

    @FXML
    protected void initialize() {
        comboBox.getItems().addAll("Char At", "Ends With", "CompareTo", "EqualsIgnoreCase", "IndexOf", "LastIndexOf",
                "Replace", "ReplaceFirst", "Split", "Startswith", "Substring");
    }

    public void evento(ActionEvent event) {
        String texto = txtFrase.getText();
        switch (comboBox.getSelectionModel().getSelectedIndex()) {
            case 0: {
                char res = texto.charAt(2);
                lblResultado.setText(res + "");
                break;
            }
            case 1: {
                boolean res = texto.endsWith("ota");
                lblResultado.setText(res + "");
                break;
            }
            case 2: {
                int res = texto.compareTo("hola");
                lblResultado.setText(res + "");
                break;
            }
            case 3: {
                boolean res = texto.equalsIgnoreCase("18CG0070");
                lblResultado.setText(res + "");
                break;

            }
            case 4: {
                int res = texto.indexOf("Java");
                lblResultado.setText(res + "");
                break;
            }
            case 5: {
                int res = texto.lastIndexOf("morado");
                lblResultado.setText(res + "");
                break;
            }
            case 6: {
                String res = texto.replace("o", "a");
                lblResultado.setText(res);
                break;
            }
            case 7: {
                String res = texto.replaceFirst(".", "!");
                lblResultado.setText(res);
                break;
            }
            case 8: {
                String[] res= texto.split("..", 2);
                lblResultado.setText(res + "");
                break;
            }
            case 9: {
                boolean res = texto.startsWith("H");
                lblResultado.setText(res + "");
                break;
            }
            case 10: {
                String res = texto.substring(0,3);
                lblResultado.setText(res );
                break;
            }
        }

    }
}
