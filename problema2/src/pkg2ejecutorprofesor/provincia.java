package pkg2ejecutorprofesor;
public class provincia {
    
    private String prov_nom;
    private int hab_num;

    
    public provincia(String NombreProvincia, int NumeroHabitantes) {
        this.prov_nom = NombreProvincia;
        this.hab_num = NumeroHabitantes;
    }

    public String getNombreProvincia() {
        return prov_nom;
    }

    public void setNombreProvincia(String NombreProvincia) {
        this.prov_nom = NombreProvincia;
    }

    public int getNumeroHabitantes() {
        return hab_num;
    }

    public void setNumeroHabitantes(int NumeroHabitantes) {
        this.hab_num = NumeroHabitantes;
    }

}
