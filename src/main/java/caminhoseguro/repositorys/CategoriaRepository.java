package caminhoseguro.repositorys;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import caminhoseguro.entitys.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {

}
