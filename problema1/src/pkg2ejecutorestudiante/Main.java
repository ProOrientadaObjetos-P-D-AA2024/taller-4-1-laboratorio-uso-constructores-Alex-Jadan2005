package pkg2ejecutorestudiante;

import universidad.universid;
import universidad.estudiant;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("Datos del Estudiante\n==================================");

        //objetos
        universid universidad = new universid("Dirección Operadores", "Universidad Tecnica");

        estudiant estudiante1 = new estudiant("Juan", 8.5, 7.9, 9.2, universidad);
        estudiant estudiante2 = new estudiant("Maria", 7.8, 8.0, 8.6, universidad);

        System.out.println("Estudiante 1:");
        System.out.println(estudiante1+"\nUniversidad: "+estudiante1.getUniversidad().getNombre()+"\nDireccion: "+estudiante1.getUniversidad().getDireccion());

        System.out.println();
        
        System.out.println("Estudiante 2:");
        System.out.println(estudiante2+"\nUniversedidad: "+estudiante2.getUniversidad().getNombre()+"\nDireccion: "+estudiante2.getUniversidad().getDireccion());

    }
    
}
