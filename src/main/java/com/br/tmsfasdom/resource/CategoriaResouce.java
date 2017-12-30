package com.br.tmsfasdom.resource;

import com.br.tmsfasdom.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
//http://localhost:8080/categorias
public class CategoriaResouce {

    @RequestMapping(method=RequestMethod.GET)
    public List<Categoria> listar(){

        Categoria cat1 = new Categoria(1, "Informatica");
        Categoria cat2 = new Categoria (2, "Escritorio");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
        //return "REST está funcionando!";
    }

}
