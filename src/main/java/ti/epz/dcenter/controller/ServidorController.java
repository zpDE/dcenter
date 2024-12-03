package ti.epz.dcenter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ti.epz.dcenter.entity.Servidor;
import ti.epz.dcenter.service.ServidorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/servidores")
public class ServidorController {

    @Autowired
    ServidorService servidorService;

    @GetMapping("/")
    public List<Servidor> getAll(){
        return servidorService.findAll();
    }

    @GetMapping(value = "/id/{id_servidor}")
    public Optional<Servidor> getById(@PathVariable int id_servidor){
        return servidorService.findById(id_servidor);
    }

    @PostMapping("/")
    public Servidor postSave(@RequestBody Servidor servidor){
        return servidorService.save(servidor);
    }


}
