package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class listaCarreras {
    private ArrayList<Carrera> listaCarreras;

    listaCarreras(){

    }
    public void addCarrera(Carrera carrera){
        listaCarreras.add(carrera);
    }
    private void imprimirLista(){
        System.out.println(listaCarreras);
    }
}
