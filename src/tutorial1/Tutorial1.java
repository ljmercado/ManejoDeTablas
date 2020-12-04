/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

import tutorial1.entidades.Producto;
import tutorial1.modelo.ProductoData;

/**
 *
 * @author Javier
 */
public class Tutorial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductoData pd=new ProductoData();
        
        pd.guardarProducto(new Producto(1,"Azucar",23,null,2));
        pd.guardarProducto(new Producto(2,"Yerba",22,null,2));
        pd.guardarProducto(new Producto(3,"Arroz",3,null,1));
        
        for(Producto p:pd.obtenerProductos()){
         System.out.println(p);
        }
        pd.borraProducto(new Producto(1,1,"Azucar",23,null,2));
        System.out.println("....................................");
        for(Producto p:pd.obtenerProductos()){
         System.out.println(p);
        }
        Producto pn=new Producto(2,2,"Yerba Marolio",45,null,3);
        pd.modificarProducto(pn);
        System.out.println("............................");
        for(Producto p:pd.obtenerProductos()){
         System.out.println(p);
        }
        
        
    }
    
}
