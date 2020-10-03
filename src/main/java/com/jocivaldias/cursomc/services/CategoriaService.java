package com.jocivaldias.cursomc.services;

import com.jocivaldias.cursomc.domain.Categoria;
import com.jocivaldias.cursomc.repositories.CategoriaRepository;
import com.jocivaldias.cursomc.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()
        ));
    }

}
