package padroes.gof.padroesdeprojetospring.service;


 // ‘Interface’ que define o padrão Strategy no domínio de cliente. Com
 // isso, se necessário, podemos ter multiplas implementações dessa mesma ‘interface’.

import padroes.gof.padroesdeprojetospring.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
