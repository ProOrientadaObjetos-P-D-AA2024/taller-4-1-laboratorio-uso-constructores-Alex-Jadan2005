package universidad;
public class estudiant {
    private String nombre;
    private double califMateria1;
    private double califMateria2;
    private double califMateria3;
    private double promedioCalificaciones;
    private universid universidad;

    public estudiant(String nombre, double califMateria1, double califMateria2, double califMateria3, universid universidad) {
        this.nombre = nombre;
        this.califMateria1 = califMateria1;
        this.califMateria2 = califMateria2;
        this.califMateria3 = califMateria3;
        this.universidad = universidad;
        this.promedioCalificaciones=calcularPromedio();
    }

    public estudiant() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalifMateria1() {
        return califMateria1;
    }

    public void setCalifMateria1(double califMateria1) {
        this.califMateria1 = califMateria1;
    }

    public double getCalifMateria2() {
        return califMateria2;
    }

    public void setCalifMateria2(double califMateria2) {
        this.califMateria2 = califMateria2;
    }

    public double getCalifMateria3() {
        return califMateria3;
    }

    public void setCalifMateria3(double califMateria3) {
        this.califMateria3 = califMateria3;
    }

    public double getPromedioCalificaciones() {
        return promedioCalificaciones;
    }


    private double calcularPromedio() {
        return (califMateria1+califMateria2+califMateria3)/3;
    }
    
    public universid getUniversidad() {
        return universidad;
    }

    public void setUniversidad(universid universidad) {
        this.universidad = universidad;
    }
    

    public String toString() {
        return "Estudiante: "+nombre+"\nCalificaciones\nMateria 1: "+califMateria1+
                "\nMateria2: "+califMateria2+"\nMateria 3: "+califMateria3+"\nPromedio de Calificaciones: "
                +promedioCalificaciones;
    }


}
