package ti.epz.dcenter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ti.epz.dcenter.entity.ServicioMaquinaVirtual;
import ti.epz.dcenter.service.ServicioMaquinaVirtualService;

@RestController
@RequestMapping("/serviciovm")
public class ServicioMaquinaVirtualController {

    @Autowired
    ServicioMaquinaVirtualService servicioMaquinaVirtualService;

    @GetMapping("/")
    public List<ServicioMaquinaVirtual> findAll() {
        return servicioMaquinaVirtualService.findAll();
    }

    @GetMapping(value = "/id/{id_servicio_maquina_virtual}")
    public Optional<ServicioMaquinaVirtual> findById(@PathVariable int id_servicio_maquina_virtual) {
        return servicioMaquinaVirtualService.findById(id_servicio_maquina_virtual);
    }

    @PostMapping("/")
    public ServicioMaquinaVirtual save(@RequestBody ServicioMaquinaVirtual servicioMaquinaVirtual) {
        return servicioMaquinaVirtualService.save(servicioMaquinaVirtual);
    }

}
