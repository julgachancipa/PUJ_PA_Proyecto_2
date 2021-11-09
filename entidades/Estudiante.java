package entidades;

public class Estudiante extends Empleado{
    double precio_hora = 25000.5;
    private int creditos;
    private int horas_monitorias;

    public Estudiante(String nombre, String carrera, long cedula, long id, int edad, char sexo, String universidad, int creditos, int horas_monitorias) {
        super(nombre, carrera, cedula, id, edad, sexo, universidad);
        this.creditos = creditos;  
        this.horas_monitorias = horas_monitorias;      
    }

    public int getCreditos() {
        return this.creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHorasMonitorias() {
        return this.horas_monitorias;
    }

    public void setHorasMonitorias(int horas_monitorias) {
        this.horas_monitorias = horas_monitorias;
    }

    public void atributos() {
        System.out.println(this.getNombre());
        System.out.println(this.getCarrera());
        System.out.println(this.getCedula());
        System.out.println(this.getId());
        System.out.println(this.getEdad());
        System.out.println(this.getSexo());
        System.out.println(this.getCreditos());
        System.out.println(this.getHorasMonitorias());
        System.out.println(this.sueldo());
    }

    @Override public double sueldo()
    {
        return (double)(precio_hora * this.getHorasMonitorias());
    }
}
