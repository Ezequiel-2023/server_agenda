package edu.galileo.agenda.controladores;

import edu.galileo.agenda.modeloDatos.Contacto;
import edu.galileo.agenda.service.ContactoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contacto")
public class ContactoController {
    private ContactoService contactoService;
    public ContactoController(ContactoService contactoService) {
        this.contactoService = contactoService;
    }
    @GetMapping
    public List<Contacto> getAll() {
        return this.contactoService.list();
    }
    @PostMapping
    public Contacto add(@RequestBody(required = true) Contacto contacto) {
        return this.contactoService.add(contacto);
    }
}
