package caminhoseguro.repositorys;

import java.util.Optional;

import caminhoseguro.entitys.Categoria;
import caminhoseguro.services.List;

public interface CategoriaRepository {

    Object save = null;

    Optional<Categoria> findById(Object categoriaId);

    List<Categoria> findAll();

    Categoria save(Categoria categoria);

}
