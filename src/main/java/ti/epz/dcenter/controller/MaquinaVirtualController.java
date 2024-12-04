package ti.epz.dcenter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ti.epz.dcenter.entity.MaquinaVirtual;
import ti.epz.dcenter.service.MaquinaVirtualService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/vmaquinas")
public class MaquinaVirtualController {

    @Autowired
    MaquinaVirtualService maquinaVirtualService;

    @GetMapping("/")
    public List<MaquinaVirtual> findAll() {
        return maquinaVirtualService.findAll();
    }

    @GetMapping(value = "/id/{id_maquina_virtual}")
    public Optional<MaquinaVirtual> findById(@PathVariable int id_maquina_virtual) {
        return maquinaVirtualService.findById(id_maquina_virtual);
    }

    @PostMapping("/")
    public MaquinaVirtual save(@RequestBody MaquinaVirtual maquinaVirtual) {
        return maquinaVirtualService.save(maquinaVirtual);
    }

    @GetMapping(value = "/servidor/id/{id_servidor}")
    public List<MaquinaVirtual> findByServidor(@PathVariable int id_servidor) {
        return maquinaVirtualService.findByServidorId(id_servidor);
    }
}
