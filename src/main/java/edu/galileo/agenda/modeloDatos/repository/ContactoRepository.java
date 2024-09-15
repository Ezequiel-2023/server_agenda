package edu.galileo.agenda.modeloDatos.repository;

import edu.galileo.agenda.modeloDatos.Contacto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactoRepository extends CrudRepository <Contacto, Integer> {
    List<Contacto> findAll();
}
