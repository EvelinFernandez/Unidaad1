package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Vector;

public class Controller {
    @FXML
    TextArea txtReceta, txtIngredientes, txtPreparacion, txtPreguntas;
    @FXML protected void initialize() {
        try {
            File f = new File("./src/sample/archivo.txt");
            BufferedReader br = new BufferedReader((new FileReader(f)));
            String texto = " ";
            while ((texto = br.readLine()) != null) {
                txtReceta.appendText("\n" + texto);
            }
        } catch (Exception e) {
            txtReceta.setText(e.getMessage());
        }
        try {
            FileInputStream fs = new FileInputStream("./src/sample/archivo.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));
            for(int i =0; i < 1;  ++i) br.readLine();
            String linea = " ";
            while ((linea = br.readLine()) != null) {
                txtIngredientes.appendText("\n" + linea);
            }
        } catch (Exception e) {
            txtIngredientes.setText(e.getMessage());
        }
        try {
            FileInputStream fs = new FileInputStream("./src/sample/archivo.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));
            for(int i =0; i < 20;  ++i) br.readLine();
            String linea1 = " ";
            while ((linea1 = br.readLine()) != null) {
                txtPreparacion.appendText("\n" + linea1);
            }
        } catch (Exception e) {
            txtPreparacion.setText(e.getMessage());
        }

        try {
            FileInputStream fs = new FileInputStream("./src/sample/archivo.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));
            for(int i = 0; i < 31; ++i) br.readLine();
            String linea2= " ";
            while ((linea2 = br.readLine()) != null) {
                txtPreguntas.appendText("\n" + linea2);
            }
        } catch (Exception e) {
            txtPreguntas.setText(e.getMessage());
        }
    }
    public void procesar(ActionEvent event){
        String[] arregloLineas= txtReceta.getText().split("\n");
        boolean encontro=false;
        for(int x=0;x<arregloLineas.length;x++){
            if(encontro){
                System.out.println(arregloLineas[x]);
            }
            if(arregloLineas[x].contains("ZACAHUIL CASERO")){
                encontro=true;
            }
            if(arregloLineas[x].contains("utilizados")){
                String[] arr2=arregloLineas[x].split("");
                System.out.println("Gramos: "+ arr2[0]);
            }
            if(arregloLineas[x].contains("preparacion")){
                String[] arr26 = arregloLineas[x].split(" ");
                System.out.println(arr26[0]);
            }

        }
    }
}
