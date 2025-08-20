package caminhoseguro.repositorys;

import java.util.Optional;

import caminhoseguro.entitys.Categoria;

public interface CategoriaRepository {

    Optional<Categoria> findById(Object categoriaId);

}
