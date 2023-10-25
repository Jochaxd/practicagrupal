package com.practicagrupal.dao;

import com.practicagrupal.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbolDao extends JpaRepository <Arbol, Long> {
    
}
