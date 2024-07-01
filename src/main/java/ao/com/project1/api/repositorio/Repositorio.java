package ao.com.project1.api.repositorio;





import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ao.com.project1.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa,Integer>   {
    
    Object save = null;

    @SuppressWarnings("null")
    List<Pessoa> findAll();

  Pessoa findByCodigo(int codigo);

  List <Pessoa> findByOrderByNome();

  int countByCodigo(int codigo);
}