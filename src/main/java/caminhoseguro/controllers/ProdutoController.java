package caminhoseguro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import caminhoseguro.entitys.Produto;
import caminhoseguro.services.ProdutoServico;

@RestController 
@RequestMapping("/api/v1/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoServico produtoServico;

    //GET -> Lista todos os produtos  
    @GetMapping("/getProdutos")
    public List<Produto> listar() {
        return produtoServico.listarTodos();
    }
    
    //POST -> Criar um novo produro
    @PostMapping("/create")
    public ResponseEntity<?> criar(@RequestBody ProdutoRequest produtoRequest) {
        return produtoServico.salvar(produtoRequest);
    }
}
