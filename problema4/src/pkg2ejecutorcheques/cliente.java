package pkg2ejecutorcheques;
public class cliente {
    //datos cliente
    private String nombres;
    private String apellidos;
    private String cedula;
    private banco b; 

    public cliente(String nombres, String apellidos, String cedula, banco b) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.b = b;
    }

    public banco getBanco() {
        return b;
    }

    public void setBanco(banco b) {
        this.b = b;
    }
    
    
    
    public String toString(){
        return "Nombres: "+nombres+"\nApellidos: "+apellidos+"\nCedula: "+cedula+"\nBanco: "+getBanco().getBanco()+"\nNumero de sucurslaes: "
                +getBanco().getNumsucursal()+"\nVAlor del cheque: "+getBanco().getValorcheque()+"\nComision del Banco: "+getBanco().getComision();
    }
}
