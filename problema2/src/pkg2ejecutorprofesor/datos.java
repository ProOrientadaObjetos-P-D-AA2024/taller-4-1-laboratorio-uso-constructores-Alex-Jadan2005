package pkg2ejecutorprofesor;
public class datos {
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldo;
    private double total;
    private provincia prov;

    public datos(String nombre, String apellido, String cedula, double sueldo, provincia prov) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.prov = prov;
        this.total=calcular();
    }
    
    private double calcular(){
        return (sueldo*0.20)+sueldo;
    }
    
    public provincia getProvincia() {
        return prov;
    }

    public void setProvincia(provincia prov) {
        this.prov = prov;
    }

    public String toString() {
        return "Nombre: "+nombre+"\nApellido: "+apellido+"\nCedula: "+cedula+"\nSueldo basico: "+sueldo+
                "\nSueldo total: "+total+"\n=========================="+"\n  Datos de la Provincia"+
                "\nProvincia: "+getProvincia().getNombreProvincia()+ 
                "\nNúmero de habitantes: "+getProvincia().getNumeroHabitantes();
    }

}
