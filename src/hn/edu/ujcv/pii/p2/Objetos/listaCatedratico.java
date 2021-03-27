package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class listaCatedratico {
    private ArrayList<Catedratico> listaCatedraticos;

    listaCatedratico(){

    }
    public void addCatedratico(Catedratico catedratico){
        listaCatedraticos.add(catedratico);
    }
    private void imprimirLista(){
        System.out.println(listaCatedraticos);
    }
}
