/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1.modelo;

import java.util.ArrayList;
import tutorial1.entidades.Producto;

/**
 *
 * @author Javier
 */
public class ProductoData {
    
    private ArrayList<Producto> lista=new ArrayList<>();
    
    
    public void guardarProducto(Producto p ){
        p.setIdProducto(lista.size()+1);
        lista.add(p);
    
    }
    
    public ArrayList<Producto> obtenerProductos(){
    
        return lista;
    }
    
    public void borraProducto(Producto p){
    
         lista.remove(p);
        
    }
    
    public void modificarProducto(Producto productoNuevo){
    
         for(Producto it:lista){
         
             if(it.getIdProducto()==productoNuevo.getIdProducto()){
                      it.setCodigo(productoNuevo.getCodigo());
                      it.setDescripcion(productoNuevo.getDescripcion());
                      it.setCategoria(productoNuevo.getCategoria());
                      it.setStock(productoNuevo.getStock());
                      it.setPrecio(productoNuevo.getPrecio());
                      break;
             }
         
         }
         
         
        
    }
    
    
    
}
