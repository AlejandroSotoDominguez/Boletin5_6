
package boletin5_6;

public class Clase {
    int ventas;
    String articulo;
    
    public void almacen(int ventas,String articulo){
        if(ventas<=100 && articulo == "baixo"){
            System.out.println("consumo baixo");
        }else if(ventas>100 && ventas<=500 && articulo == "medio"){
            System.out.println("consumo medio");
        }if(ventas>500 | ventas<=100 && articulo == "alto"){
            System.out.println("consumo alto");
        }if(ventas>1000 && articulo == "primeira necesidade"){
            System.out.println("consumo primeira necesidade");
        }
    }
}
