package pkg2ejecutorcheques;
public class banco {
    //datos banco
    private String Banco;
    private int numsucursal;
    private double valorcheque;
    private double comision;

    public banco(String Banco, int numsucursal, double valorcheque) {
        this.Banco = Banco;
        this.numsucursal = numsucursal;
        this.valorcheque = valorcheque;
        this.comision = calcularcomision();
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public int getNumsucursal() {
        return numsucursal;
    }

    public void setNumsucursal(int numsucursal) {
        this.numsucursal = numsucursal;
    }

    public double getValorcheque() {
        return valorcheque;
    }

    public void setValorcheque(double valorcheque) {
        this.valorcheque = valorcheque;
    }

    public double getComision() {
        return comision;
    }
    
    
    
    private double calcularcomision(){
        return valorcheque*0.003;
    }
    
    
}
