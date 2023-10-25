package com.practicagrupal.service;

import com.practicagrupal.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    //Se declara un método para obtener un ArrayList de Objetos Categoria
    //Objetos vienen de la base de datos, todos los registros
    
    public List<Arbol> getArbol(boolean activos);
    
    //Abajo se colocarán los métodos para hacer el CRUD de categorias, pero en semana 6
}
