package padroes.gof.padroesdeprojetospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import padroes.gof.padroesdeprojetospring.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
