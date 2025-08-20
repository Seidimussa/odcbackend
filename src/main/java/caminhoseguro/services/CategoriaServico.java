package caminhoseguro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import caminhoseguro.entitys.Categoria;
import caminhoseguro.repositorys.CategoriaRepository;

@Service
public class CategoriaServico {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Listar todas as categorias
    public List<Categoria> listarTodos() {
        return categoriaRepository.findAll();
    }

    // Salvar uma categoria
    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Optional<Categoria> findById(Long categoriaId) {
        return categoriaRepository.findById(categoriaId);
    }

}
