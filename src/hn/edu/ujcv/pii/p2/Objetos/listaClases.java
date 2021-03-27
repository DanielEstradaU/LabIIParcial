package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class listaClases {
    private ArrayList<Clase> listaClase;

    listaClases(){

    }
    public void addClase(Clase clase){
        listaClase.add(clase);
    }
    private void imprimirLista(){
        System.out.println(listaClase);
    }
}
