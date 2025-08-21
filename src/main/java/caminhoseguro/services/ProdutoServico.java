package caminhoseguro.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import caminhoseguro.controllers.ProdutoRequest;
import caminhoseguro.entitys.Categoria;
import caminhoseguro.entitys.Produto;
import caminhoseguro.repositorys.CategoriaRepository;
import caminhoseguro.repositorys.ProdutoRepository;

@Service
public class ProdutoServico {

    // Injeção de dependência
    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Método para listar todos os produtos
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    
    public ResponseEntity<?> salvar(ProdutoRequest produtoRequest) {
        Produto newProduto = new Produto();

        //Procurar a categoria
        Optional<Categoria> categoria = categoriaRepository.findById((Long) produtoRequest.getCategoriaId());
        
        if (categoria.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("A categoria com o ID " + produtoRequest.getCategoriaId() + " não foi encontrada.");
        }

        // Set the category and other fields as needed
        newProduto.setNome(produtoRequest.getNome());
        newProduto.setCategoria(categoria.get());
        newProduto.setDescricao(produtoRequest.getDescricao());
        newProduto.setQuantidade(produtoRequest.getQuantidade());
        newProduto.setPreco(produtoRequest.getPreco());
        newProduto.setData(LocalDateTime.now());

        produtoRepository.save(newProduto);

        return ResponseEntity.status(HttpStatus.CREATED).body("Categoria criada com sucesso!");
    }
}
