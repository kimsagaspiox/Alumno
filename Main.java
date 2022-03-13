
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static Lista lista = new Lista();
    static Scanner sc = new Scanner(System.in);
    static Alumno alumno;
    public static void Main(String[] args) {
        int eleccion;
        boolean salir = false;
        
        System.out.println("****TODOS LOS ELEMENTOS SERÁN AÑADIDOS AL FINAL DE LA LISTA****");
        while (!salir){
        System.out.println("\n\nSeleccione que desea realizar");
        System.out.println("1. Agregar un nuevo alumno");
        System.out.println("2. Buscar un alumno");
        System.out.println("3. Eliminar un alumno");
        System.out.println("4. Mostrar la lista de alumnos");
        System.out.println("5. Salir");
        eleccion = sc.nextInt();
        switch(eleccion){
            case 1: añadir();
                JOptionPane.showMessageDialog(null, "Alumno Registrado");
                break;
            case 2: 
                String Carne = JOptionPane.showInputDialog(null, "Ingrese el carné del alumno que desea buscar");
                int CarneBusqueda = Integer.parseInt(Carne);
                lista.BuscarAlumno(CarneBusqueda);
                break; 
            case 3: 
                String Carne2 = JOptionPane.showInputDialog(null, "Ingrese el carné del alumno que desea eliminar");
                int CarneEliminar = Integer.parseInt(Carne2);
                lista.EliminarAlumno(CarneEliminar);
                break;
            case 4: lista.mostrarLista();
                break;
            case 5: salir = true;
                break;
            case 6: default: System.out.println("La opción que seleccionó no existe");
                break;
        }
        }
  
    }
     public static void añadir(){
         String Nombre, Apellido, Email, Carnet;
         int Carne;
         
         Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
         Apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido");
         Email = JOptionPane.showInputDialog(null, "Ingrese el email");
         Carnet = JOptionPane.showInputDialog(null, "Ingrese el carné");
         Carne = Integer.parseInt(Carnet);
         lista.agregar(new Alumno(Nombre, Apellido, Email, Carne));
         
    }
}

