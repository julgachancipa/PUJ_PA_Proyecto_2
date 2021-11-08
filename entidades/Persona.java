package entidades;

import java.io.Serializable;

public class Persona implements Serializable{
    private String nombre;
    private String carrera;
    private long sueldo;
    private long cedula;
    private long id;
    private int edad;
    private char sexo;

    public Persona(String nombre, String carrera, long sueldo, long cedula, long id, int edad, char sexo) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.sueldo = sueldo;
        this.cedula = cedula;
        this.id = id;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public long getSueldo() {
        return this.sueldo;
    }

    public long getCedula() {
        return this.cedula;
    }

    public long getId() {
        return this.id;
    }

    public int getEdad() {
        return this.edad;
    }

    public char getSexo() {
        return this.sexo;
    }
}
