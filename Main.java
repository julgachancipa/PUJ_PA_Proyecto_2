import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.Estudiante;
import entidades.Profesor;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        int opcion;

        String nombre;
        String carrera;
        long cedula;
        long id;
        int edad;
        char sexo;
        String universidad;
        int creditos;
        int horas_monitorias;
        String facultad;
        char phd;
        char planta;
        int horas_clase;

        long delId;

        ArrayList<Estudiante>estudiantes = new ArrayList<Estudiante>();
        ArrayList<Profesor>profesores = new ArrayList<Profesor>();

        do {
            System.out.println("_________________MENU_________________");
            System.out.println("2. Lista de estudiantes");
            System.out.println("3. Lista de profesores");
            System.out.println("5. Adicionar estudiante");
            System.out.println("6. Adicionar profesor");
            System.out.println("8. Eliminar estudiante");
            System.out.println("9. Eliminar profesor");
            System.out.println("11. Guardar estudiantes");
            System.out.println("12. Guardar profesores");
            System.out.println("14. Cargar estudiantes");
            System.out.println("15. Cargar profesores");
            System.out.println("16. Salir");

            System.out.println("Escribe el numero de la opción: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 2:
                    for (int i = 0; i < estudiantes.size(); i++) {
                        System.out.println("__________________________________");
                        estudiantes.get(i).atributos();
                    }
                    break;
                
                case 3:
                    for (int i = 0; i < profesores.size(); i++) {
                        System.out.println("__________________________________");
                        profesores.get(i).atributos();
                    }
                    break;

                case 5:
                    System.out.println("Nombre: ");
                    nombre = sn.next();
                    
                    System.out.println("Carrera: ");
                    carrera = sn.next();
                    
                    System.out.println("Cedula: ");
                    cedula = sn.nextLong();
                    
                    System.out.println("Id: ");
                    id = sn.nextLong();
                    
                    System.out.println("Edad: ");
                    edad = sn.nextInt();
                    
                    System.out.println("Sexo: ");
                    sexo = sn.next(".").charAt(0);

                    System.out.println("Universidad: ");
                    universidad = sn.next();
                    
                    System.out.println("Creditos: ");
                    creditos = sn.nextInt();

                    System.out.println("Horas de monitorias: ");
                    horas_monitorias = sn.nextInt();

                    Estudiante estudiante = new Estudiante(nombre, carrera, cedula, id, edad, sexo, universidad, creditos, horas_monitorias);

                    estudiantes.add(estudiante);
                    
                    break;
                    
                case 6:
                    System.out.println("Nombre: ");
                    nombre = sn.next();
                    
                    System.out.println("Carrera: ");
                    carrera = sn.next();

                    System.out.println("Cedula: ");
                    cedula = sn.nextLong();
                    
                    System.out.println("Id: ");
                    id = sn.nextLong();
                    
                    System.out.println("Edad: ");
                    edad = sn.nextInt();
                    
                    System.out.println("Sexo: ");
                    sexo = sn.next(".").charAt(0);

                    System.out.println("Universidad: ");
                    universidad = sn.next();
                    
                    System.out.println("Facultad: ");
                    facultad = sn.next();

                    System.out.println("PHD (s/n): ");
                    phd = sn.next(".").charAt(0);

                    System.out.println("Planta (s/n): ");
                    planta = sn.next(".").charAt(0);

                    System.out.println("Horas de clase impartidas: ");
                    horas_clase = sn.nextInt();

                    Profesor profesor = new Profesor(nombre, carrera, cedula, id, edad, sexo, universidad, facultad, phd, planta, horas_clase);

                    profesores.add(profesor);
                        
                    break;

                case 8:
                    System.out.println("Id del estudiante a eliminar: ");
                    delId = sn.nextLong();

                    for (int i = 0; i < estudiantes.size(); i++) {
                        id = estudiantes.get(i).getId();

                        if (id == delId) {
                            estudiantes.remove(i);
                        }
                    }
                    
                    break;
                
                case 9:
                    System.out.println("Id del profesor a eliminar: ");
                    delId = sn.nextLong();

                    for (int i = 0; i < profesores.size(); i++) {
                        id = profesores.get(i).getId();

                        if (id == delId) {
                            profesores.remove(i);
                        }
                    }
                    break;

                case 11:
                    try {
                        FileOutputStream fos = new FileOutputStream("estudiantes");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);   
                        oos.writeObject(estudiantes);
                        oos.close();
                        fos.close();
                    } catch(Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                
                case 12:
                    try {
                        FileOutputStream fos = new FileOutputStream("profesores");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);   
                        oos.writeObject(profesores);
                        oos.close();
                        fos.close();
                    } catch(Exception ex) {
                        ex.printStackTrace();
                    }
                    break;

                case 14:
                    try{
                        FileInputStream fis = new FileInputStream("estudiantes");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                    
                        estudiantes = (ArrayList<Estudiante>) ois.readObject();
                        ois.close();
                        fis.close();

                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                
                case 15:
                    try{
                        FileInputStream fis = new FileInputStream("profesores");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                    
                        profesores = (ArrayList<Profesor>) ois.readObject();
                        ois.close();
                        fis.close();

                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                
                case 16:
                    
                    break;
                
                default:
                    System.out.println("Solo números entre 1 y 16");
            }

        } while (opcion != 16);

        sn.close();
    }
}
