package entidades;

public class Empleado extends Persona{
    private String empresa;
    
    public Empleado(String nombre, String carrera, long sueldo, long cedula, long id, int edad, char sexo, String empresa) {
        super(nombre, carrera, sueldo, cedula, id, edad, sexo);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setSueldo(String empresa) {
        this.empresa = empresa;
    }

    public void atributos() {
        System.out.println(this.getNombre());
        System.out.println(this.getCarrera());
        System.out.println(this.getSueldo());
        System.out.println(this.getCedula());
        System.out.println(this.getId());
        System.out.println(this.getEdad());
        System.out.println(this.getSexo());
        System.out.println(this.getEmpresa());
    }
}
