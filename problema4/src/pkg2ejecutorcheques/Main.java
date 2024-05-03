package pkg2ejecutorcheques;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        //creaar objetos        
        banco b=new banco("Loja",200,450);
        cliente c=new cliente("Willian Alexander","Jadan Urgiles","3050092331",b);
        //crear segundo objeto
        banco b2=new banco("Pichincha",450,5690);
        cliente c2=new cliente("Adriana Elizabeth","Jadan Urgiles","3050092631",b2);
        
        
        //imprimir
        System.out.println("==========================\nDatos\n==========================\n"+c.toString());
       
        System.out.println("==========================\nDatos\n==========================\n"+c2.toString());
    }
    
}
