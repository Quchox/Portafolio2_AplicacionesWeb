/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_mqucho.dao;

import com.tienda_mqucho.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Qucho
 */
public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
