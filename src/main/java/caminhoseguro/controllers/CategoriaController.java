package caminhoseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import caminhoseguro.entitys.Categoria;
import caminhoseguro.services.CategoriaServico;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaServico categoriaServico;

    //GET - Listar todas as categorias
    @GetMapping("/getCategorias")
    public Categoria criar(@RequestBody Categoria categoria) {
        return categoriaServico.salvar(categoria);
    }
}
