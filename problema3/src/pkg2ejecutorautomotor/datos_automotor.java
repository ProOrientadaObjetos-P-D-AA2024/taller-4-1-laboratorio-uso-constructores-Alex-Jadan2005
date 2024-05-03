package pkg2ejecutorautomotor;
public class datos_automotor {
    
    private String cedula;
    private int anio;
    private int valorv;
    private double valorm;
    private fabricante f;

    public datos_automotor(String cedula, int anio, int valorv, fabricante f) {
        this.cedula = cedula;
        this.anio = anio;
        this.valorv = valorv;
        this.valorm=calcular();
        this.f = f;
    }

    public fabricante getFabricante() {
        return f;
    }

    public void setFabricante(fabricante f) {
        this.f = f;
    }
    
    
    private double calcular(){
        return (2024-anio)*0.002;
    }
    
    public String toString(){
        return "Cedula: "+cedula+"\nNombre: "+getFabricante().getNombre()+"\nCiudad de Origen: "+getFabricante().getCiudad()+"\nAnio de fabricacion: "+anio
                +"\nvalor del vehiculo: "+valorv+"\nVAlor de matricula: "+valorm;
    }
    
    
}
