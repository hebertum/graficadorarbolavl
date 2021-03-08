/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraficarArbol;

import javax.swing.JFrame;
import logica.Arbol;

/**
 *
 * @author daniel
 */
public class GraficadorArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        //PATRON MVC
        Arbol objArbol = new Arbol(); //MODELO
        Graficador objLienzo = new Graficador(); //VISTA
        Controlador objControlador = new Controlador(objLienzo, objArbol); //CONTROLADOR
        //= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        //INSERTAR Y PINTAR ARBOL
        objArbol.insertar(60);
        objArbol.insertar(70);
        objArbol.insertar(20);
        objArbol.insertar(80);
        objArbol.insertar(90);
        objControlador.iniciar();
        //= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        //MOSTRAR LIENZO EN UNA VENTANA TODO
        JFrame ventana = new JFrame();
        ventana.getContentPane().add(objLienzo);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(800, 800);
        ventana.setVisible(true);
        //= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
    }
    
}
