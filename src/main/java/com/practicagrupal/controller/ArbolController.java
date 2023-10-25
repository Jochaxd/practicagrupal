package com.practicagrupal.controller;

import com.practicagrupal.service.ArbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/arbol")
public class ArbolController {
    @Autowired
    private ArbolService arbolService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var arbol = arbolService.getArbol(false);
        model.addAttribute("arbol", arbol);
        model.addAttribute("totalArbol", arbol.size());
        
        return "/arbol/listado";
    }
    //se va a agregar más información la próxima semana
}
