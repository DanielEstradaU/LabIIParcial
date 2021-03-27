package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class listaCampus {
    private ArrayList<Campus> listaCampus;

    listaCampus(){

    }
    public void addCampus(Campus campus){
        listaCampus.add(campus);
    }
    private void imprimirLista(){
        System.out.println(listaCampus);
    }
}
