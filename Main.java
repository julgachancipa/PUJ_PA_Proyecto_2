import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import entidades.Empleado;
import entidades.Estudiante;
import entidades.Profesor;

import utils.UtilsCSV;
import utils.RunPython;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        int opcion;

        String nombre;
        String carrera;
        long sueldo;
        long cedula;
        long id;
        int edad;
        char sexo;
        String empresa;
        int creditos;
        String facultad;

        int contador;
        long tsueldo = 0;
        int masculino = 0;
        int femenino = 0;
        long pestudiantes = 0;

        long delId;
        ArrayList<Empleado>empleados = new ArrayList<Empleado>();
        ArrayList<Estudiante>estudiantes = new ArrayList<Estudiante>();
        ArrayList<Profesor>profesores = new ArrayList<Profesor>();

        HashMap<String, Integer> map;
        do {
            System.out.println("_________________MENU_________________");
            System.out.println("1. Lista de empleados.");
            System.out.println("2. Lista de estudiantes");
            System.out.println("3. Lista de profesores");
            System.out.println("4. Adicionar empleado");
            System.out.println("5. Adicionar estudiante");
            System.out.println("6. Adicionar profesor");
            System.out.println("7. Eliminar empleado");
            System.out.println("8. Eliminar estudiante");
            System.out.println("9. Eliminar profesor");
            System.out.println("10. Guardar empleados");
            System.out.println("11. Guardar estudiantes");
            System.out.println("12. Guardar profesores");
            System.out.println("13. Cargar empleados");
            System.out.println("14. Cargar estudiantes");
            System.out.println("15. Cargar profesores");
            System.out.println("16. Estadisticas carreras empleados");
            System.out.println("17. Estadisticas carreras estudiantes");
            System.out.println("18. Estadisticas carreras profesores");
            System.out.println("19. Estadisticas sexo empleados");
            System.out.println("20. Estadisticas sexo estudiantes");
            System.out.println("21. Estadisticas sexo profesores");
            System.out.println("22. Sueldo profesores");
            System.out.println("23. Hombres y mujeres empleados");
            System.out.println("24. Edad promedio estudiantes");
            System.out.println("0. Salir");

            System.out.println("______________________________________");
            System.out.println("Escribe el numero de la opción: ");
            opcion = sn.nextInt();
            System.out.println("______________________________________");

            switch (opcion) {
                case 0:
                    break;
                case 1:
                    for (int i = 0; i < empleados.size(); i++) {
                        System.out.println("__________________________________");
                        empleados.get(i).atributos();
                    }
                    break;
                
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

                case 4:
                    System.out.println("Nombre: ");
                    nombre = sn.next();
                    
                    System.out.println("Carrera: ");
                    carrera = sn.next();
                    
                    System.out.println("Sueldo: ");
                    sueldo = sn.nextLong();

                    System.out.println("Cedula: ");
                    cedula = sn.nextLong();
                    
                    System.out.println("Id: ");
                    id = sn.nextLong();
                    
                    System.out.println("Edad: ");
                    edad = sn.nextInt();
                    
                    System.out.println("Sexo: ");
                    sexo = sn.next(".").charAt(0);
                    
                    System.out.println("Empresa: ");
                    empresa = sn.next();

                    Empleado empleado = new Empleado(nombre, carrera, sueldo, cedula, id, edad, sexo, empresa);

                    empleados.add(empleado);
                    break;
                
                case 5:
                    System.out.println("Nombre: ");
                    nombre = sn.next();
                    
                    System.out.println("Carrera: ");
                    carrera = sn.next();
                    
                    System.out.println("Sueldo: ");
                    sueldo = sn.nextLong();

                    System.out.println("Cedula: ");
                    cedula = sn.nextLong();
                    
                    System.out.println("Id: ");
                    id = sn.nextLong();
                    
                    System.out.println("Edad: ");
                    edad = sn.nextInt();
                    
                    System.out.println("Sexo: ");
                    sexo = sn.next(".").charAt(0);
                    
                    System.out.println("Creditos: ");
                    creditos = sn.nextInt();

                    Estudiante estudiante = new Estudiante(nombre, carrera, sueldo, cedula, id, edad, sexo, creditos);

                    estudiantes.add(estudiante);
                    
                    break;
                    
                case 6:
                    System.out.println("Nombre: ");
                    nombre = sn.next();
                    
                    System.out.println("Carrera: ");
                    carrera = sn.next();
                    
                    System.out.println("Sueldo: ");
                    sueldo = sn.nextLong();

                    System.out.println("Cedula: ");
                    cedula = sn.nextLong();
                    
                    System.out.println("Id: ");
                    id = sn.nextLong();
                    
                    System.out.println("Edad: ");
                    edad = sn.nextInt();
                    
                    System.out.println("Sexo: ");
                    sexo = sn.next(".").charAt(0);

                    System.out.println("Empresa: ");
                    empresa = sn.next();
                    
                    System.out.println("Facultad: ");
                    facultad = sn.next();

                    Profesor profesor = new Profesor(nombre, carrera, sueldo, cedula, id, edad, sexo, empresa, facultad);

                    profesores.add(profesor);
                        
                    break;

                case 7:
                    System.out.println("Id del empleado a eliminar: ");
                    delId = sn.nextLong();

                    for (int i = 0; i < empleados.size(); i++) {
                        id = empleados.get(i).getId();

                        if (id == delId) {
                            empleados.remove(i);
                        }
                    }
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

                case 10:
                    try {
                        FileOutputStream fos = new FileOutputStream("empleados");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);   
                        oos.writeObject(empleados);
                        oos.close();
                        fos.close();
                    } catch(Exception ex) {
                        ex.printStackTrace();
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

                case 13:
                    try{
                        FileInputStream fis = new FileInputStream("empleados");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                    
                        empleados = (ArrayList<Empleado>) ois.readObject();
                        ois.close();
                        fis.close();

                    }catch (Exception e) {
                        e.printStackTrace();
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
                    map = new HashMap<String,Integer>();
                    for (int i = 0; i < empleados.size(); i++) {
                        carrera = empleados.get(i).getCarrera();
                        contador = map.getOrDefault(carrera, 0);
                        map.put(carrera, contador+1);
                    }
                    UtilsCSV.WriteCSVFile("carrerasempleados.csv", map, "carrera");
                    RunPython.RunScript("carrerasempleados.csv", "carrera");
                    break;
                case 17:
                    map = new HashMap<String,Integer>();
                    for (int i = 0; i < estudiantes.size(); i++) {
                        carrera = estudiantes.get(i).getCarrera();
                        contador = map.getOrDefault(carrera, 0);
                        map.put(carrera, contador+1);
                    }
                    UtilsCSV.WriteCSVFile("carrerasestudiantes.csv", map, "carrera");
                    RunPython.RunScript("carrerasestudiantes.csv", "carrera");
                    break;
                case 18:
                    map = new HashMap<String,Integer>();
                    for (int i = 0; i < profesores.size(); i++) {
                        carrera = profesores.get(i).getCarrera();
                        contador = map.getOrDefault(carrera, 0);
                        map.put(carrera, contador+1);
                    }
                    UtilsCSV.WriteCSVFile("carrerasprofesores.csv", map, "carrera");
                    RunPython.RunScript("carrerasprofesores.csv", "carrera");
                    break;
                case 19:
                    map = new HashMap<String,Integer>();
                    for (int i = 0; i < empleados.size(); i++) {
                        sexo = empleados.get(i).getSexo();
                        contador = map.getOrDefault(String.format("%c",sexo), 0);
                        map.put(String.format("%c",sexo), contador+1);
                    }
                    UtilsCSV.WriteCSVFile("sexoempleados.csv", map, "sexo");
                    RunPython.RunScript("sexoempleados.csv", "sexo");
                    break;
                case 20:
                    map = new HashMap<String,Integer>();
                    for (int i = 0; i < estudiantes.size(); i++) {
                        sexo = estudiantes.get(i).getSexo();
                        contador = map.getOrDefault(String.format("%c",sexo), 0);
                        map.put(String.format("%c",sexo), contador+1);
                    }
                    UtilsCSV.WriteCSVFile("sexoestudiantes.csv", map, "sexo");
                    RunPython.RunScript("sexoestudiantes.csv", "sexo");
                    break;
                case 21:
                    map = new HashMap<String,Integer>();
                    for (int i = 0; i < profesores.size(); i++) {
                        sexo = profesores.get(i).getSexo();
                        contador = map.getOrDefault(String.format("%c",sexo), 0);
                        map.put(String.format("%c",sexo), contador+1);
                    }
                    UtilsCSV.WriteCSVFile("sexoprofesores.csv", map, "sexo");
                    RunPython.RunScript("sexoprofesores.csv", "sexo");
                    break;
                case 22:
                    for (int i = 0; i < profesores.size(); i++) {
                        tsueldo += profesores.get(i).getSueldo();
                    }
                    System.out.println("Sueldo mensual de todos los profesores: " + tsueldo);
                    break;
                case 23:
                    for (int i = 0; i < empleados.size(); i++) {
                        if(empleados.get(i).getSexo() == 'm'){
                            masculino++;
                        }
                        if(empleados.get(i).getSexo() == 'f'){
                            femenino++;
                        }
                    }
                    System.out.println("Cantidad de empleados hombres "+ masculino);
                    System.out.println("Cantidad de empleados mujeres "+ femenino);
                    break;     
                case 24:
                    for (int i = 0; i < estudiantes.size(); i++) {
                        pestudiantes += estudiantes.get(i).getEdad();
                    }
                    System.out.println("Promedio edad estudiantes: "+ pestudiantes/estudiantes.size());
                    break;
                default:
                    System.out.println("La opcion no esta en el menu");
            }

        } while (opcion != 0);

        sn.close();
    }
}
