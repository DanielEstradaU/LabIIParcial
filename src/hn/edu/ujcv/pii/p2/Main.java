package hn.edu.ujcv.pii.p2;

import hn.edu.ujcv.pii.p2.Objetos.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Menu");
        System.out.println("1.Alumno\n2.Catedratico\n3.Campus\n" +
                "4.Historial\n5.Salir");
        Scanner teclado = new Scanner(System.in);
        System.out.println("opcion");
        int opcion = teclado.nextInt();
        menuPrincipal(opcion);

    }
    public static void menuPrincipal(int opcion){
        Scanner teclado = new Scanner (System.in).useDelimiter(",");

        DateFormat formatter = new SimpleDateFormat("dd mmm yyyy");
        try {

            do {
                switch (opcion) {
                    case 1:
                        menuAlumno();
                    case 2:
                    {
                        Catedratico catedratico = new Catedratico();
                        Persona persona = new Persona();
                        System.out.println("Nombre");
                        String nombre = teclado.nextLine();
                        persona.setNombre(nombre);
                        System.out.println("Id");
                        String Sid =  teclado.nextLine();
                        long id = Long.parseLong(Sid);
                        persona.setId(id);
                        System.out.println("codigo");
                        String Scodigo= teclado.nextLine();
                        int codigo = Integer.parseInt(Scodigo);
                        catedratico.setCodigo(codigo);
                        System.out.println("Fecha de nacimiento");
                        String Sdate = teclado.nextLine();
                        Date fechaDenacimiento = new SimpleDateFormat("dd/mm/yyyy").parse(Sdate);
                        persona.setFechaDeNacimiento(fechaDenacimiento);
                        break;
                    }

                    case 3:
                    {
                        Campus campus = new Campus();
                        System.out.println("Id");
                        String Sid =  teclado.nextLine();
                        int id = Integer.parseInt(Sid);
                        campus.setId(id);
                        System.out.println("Nombre del campus");
                        String nombre = teclado.nextLine();
                        campus.setNombre(nombre);
                        System.out.println("Direccion del campus");
                        String direccion = teclado.nextLine();
                        campus.setDireccion(direccion);
                        System.out.println("Fecha de inicio");
                        String Sdate = teclado.nextLine();
                        Date fechaDeInicio = new SimpleDateFormat("dd/mm/yyyy").parse(Sdate);
                        campus.setFechaDeInicio(fechaDeInicio);
                    }

                        break;
                    case 4 :

                        break;
                    case 5 :
                        System.out.println("Adios");
                        break;
                }
            } while (opcion == 5);
        }catch (Exception e ){
            System.err.println("ERROR" + e.getMessage());
        }
    }
    public static void menuAlumno(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menu de Alumnos ");
        System.out.println("que desea hacer?");
        System.out.println("1.Agregar nuevo alumno\n2.Enlistar Alumnos\n3.Buscar Alumno");
        int opcion = teclado.nextInt();
        try{



            switch (opcion){
                case 1:
                {
                    Alumno alumno = new Alumno();
                    Persona persona = new Persona();
                    System.out.println("Nombre");
                    String nombre = teclado.nextLine();
                    persona.setNombre(nombre);
                    System.out.println("Id");
                    String Sid =  teclado.nextLine();
                    long id = Long.parseLong(Sid);
                    persona.setId(id);
                    System.out.println("Cuenta");
                    String Scuenta = teclado.nextLine();
                    Long cuenta= Long.parseLong(Scuenta);
                    alumno.setCuenta(cuenta);
                    System.out.println("Fecha de nacimiento");
                    String Sdate = teclado.nextLine();
                    Date fechaDenacimiento = new SimpleDateFormat("dd/mm/yyyy").parse(Sdate);
                    persona.setFechaDeNacimiento(fechaDenacimiento);

                    break;
                }
                case 2:
                    break;
                case 3:
                    break;
                case 0 :
                    break;
                default:
                    System.out.println("No es opcion valida.");
                    break;
            }
        }while (opcion != 0);
        }catch(Exception e){
            System.err.println("ERROR " + e.getMessage());
        }
    }

    public static void menuHistorial(){
        Alumno alumno = new Alumno();
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        try{
            switch (opcion){

            }



        }catch (Exception e){
            System.err.println("ERROR"+e.getMessage());
        }
    }

    public static void buscarAlumno(){
        listaAlumnos listaDeAlumnos = new listaAlumnos();
    }
}
