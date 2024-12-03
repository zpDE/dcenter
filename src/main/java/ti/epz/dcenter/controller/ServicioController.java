package ti.epz.dcenter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ti.epz.dcenter.entity.Servicio;
import ti.epz.dcenter.service.ServicioService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/servicios")
public class ServicioController {

    @Autowired
    ServicioService servicioService;

    @GetMapping("/")
    public List<Servicio> getAll() {
        return servicioService.findAll();
    }

    @GetMapping(value = "/id/{id_servicio}")
    public Optional<Servicio> getById(@PathVariable Integer id_servicio) {
        return servicioService.findById(id_servicio);
    }

    @PostMapping("/")
    public Servicio postSave(@RequestBody Servicio servicio) {
        return servicioService.save(servicio);
    }

}
