package com.tienda_mqucho.controller;


import com.tienda_mqucho.service.CategoriaService;
import com.tienda_mqucho.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/pruebas")
public class PruebasController {
    
    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;
    
    // "/producto/listado"
    @GetMapping("/listado")
    public String listado(Model model){
        var lista = productoService.getProducto(false);
        model.addAttribute("productos", lista);
        model.addAttribute("totalProductos", lista.size());
        
        //Para poder hacer los options del select...
        var categorias = categoriaService.getCategoria(true);
        model.addAttribute("categorias", categorias);
        
        return "/pruebas/listado";
    }
    
  
}
