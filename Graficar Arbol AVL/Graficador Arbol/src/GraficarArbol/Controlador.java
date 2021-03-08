/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraficarArbol;

import logica.Arbol;

/**
 *
 * @author daniel
 */
public class Controlador {
    private Graficador objLienzo; //VISTA
    private Arbol objArbol; //MODELO

    public Controlador(Graficador objLienzo, Arbol objArbol) {
        this.objLienzo = objLienzo;
        this.objArbol = objArbol;
    }
    
    public void iniciar() {
        objLienzo.setObjArbol(objArbol);
    }
}
