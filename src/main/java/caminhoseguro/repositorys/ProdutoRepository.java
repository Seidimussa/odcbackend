package caminhoseguro.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import caminhoseguro.entitys.Produto;

//Repositorio que herda metodos prontos como findAll, save, deleteById
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    

}
