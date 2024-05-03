package pkg2ejecutorprofesor;
public class Main {
    public static void main(String[] args) {
        //Primer Objeto
        
        
        provincia p1 = new provincia("Loja", 485421);
        datos d1 = new datos("Alex", "Jadan", "3050092331", 4000, p1);
        

        
        System.out.println("=============================\nDatos\n=============================");
        
        System.out.println(d1.toString());

        //OBJETO 2
        provincia p2 = new provincia("Pichincha", 3089473);
        datos d2 = new datos("Adriana", "Jadan", "3050092631",3500, p2);
        

        
        System.out.println("=============================\nDatos\n=============================");
        
        System.out.println(d2.toString());
    }

    
    
}
