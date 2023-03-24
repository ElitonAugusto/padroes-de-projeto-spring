package padroes.gof.padroesdeprojetospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import padroes.gof.padroesdeprojetospring.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
