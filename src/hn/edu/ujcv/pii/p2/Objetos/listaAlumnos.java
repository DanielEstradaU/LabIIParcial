package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class listaAlumnos {
    private ArrayList<Alumno> listaAlumnos;

    public listaAlumnos(){

    }
    public void addAlumno(Alumno alumno){
        listaAlumnos.add(alumno);
    }
    private void imprimirLista(){
        System.out.println(listaAlumnos);
    }

}
