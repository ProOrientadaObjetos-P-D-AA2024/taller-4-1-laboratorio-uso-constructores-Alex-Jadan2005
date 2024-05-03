package universidad;
public class universid {
   
    private String nombre;
    private String direccion;
    
    
    

    public universid(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
     
}
