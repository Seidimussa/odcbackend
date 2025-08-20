package caminhoseguro.entitys;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Este classe representa um produto dentro de sistema
@Entity
@Table(name = "t_produtos") // força o nome da tabela no banco
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Chave primaria auto incremento
    private Long id;

    private String nome;
    private String descricao;
    private Double preco;
    private int quantidade;
    private LocalDateTime data;


    //Relacionamento: muitos produtos podem pertencer a 1 categoria
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
