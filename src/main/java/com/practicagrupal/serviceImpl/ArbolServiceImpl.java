package com.practicagrupal.serviceImpl;

import com.practicagrupal.dao.ArbolDao;
import com.practicagrupal.domain.Arbol;
import com.practicagrupal.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArbolServiceImpl implements ArbolService{
    
    @Autowired //La anotación autowired crea un único objeto mientras se ejecuta la aplicación
    private ArbolDao arbolDao;
    
    @Override
    public List<Arbol> getArbol(boolean activos){
        var lista = arbolDao.findAll(); //encontrar todos los datos que tenga la lista
        return lista;
    }
}
