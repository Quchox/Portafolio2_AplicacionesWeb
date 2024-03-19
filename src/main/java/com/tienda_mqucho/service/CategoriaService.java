package com.tienda_mqucho.service;

import com.tienda_mqucho.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
//Se define la firma del metodo para obtener los registros de categoria//
    public List<Categoria> getCategoria(boolean activo);
    
    //se recupera un registro tomando el idCategoria como clave de busqueda
    public Categoria getCategoria(Categoria categoria);
    
    //Si idCategoria tienen un valor, se modifica ese registro
    //Si idCategoria no tiene valor, se inserta un nuevo registro
    public void save(Categoria categoria);
    
    //Se elimina el registro que tenga el valor del idCategoria pasado
    public void delete(Categoria categoria);
}
