package diogotech.tutorialrestapi.repository;

import diogotech.tutorialrestapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <UsuarioModel, Integer>{
}
