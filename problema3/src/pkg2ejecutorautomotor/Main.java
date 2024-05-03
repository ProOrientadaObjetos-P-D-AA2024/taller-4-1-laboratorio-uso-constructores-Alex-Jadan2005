package pkg2ejecutorautomotor;
public class Main {
    public static void main(String[] args) {
        //datos: 
        //d: cedula,anio de fabrica, valor de vehiculo, valor matricula, f
        //f: nombre del fabricante, ciudad origen
        
        //objetos
        fabricante f=new fabricante("Alex","Loja");
        datos_automotor d = new datos_automotor("3050092331",2006,30500,f);
        //objeto 2
        fabricante f2=new fabricante("Adriana","Quito");
        datos_automotor d2 = new datos_automotor("3050092631",2014,20500,f2);
        
        
        //imprimir
        System.out.println("==========================\nDatos\n==========================\n"+d.toString());
        
        System.out.println("==========================\nDatos\n==========================\n"+d2.toString());
    }
    
}
