package caminhoseguro.entitys;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "t_clientes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
}
