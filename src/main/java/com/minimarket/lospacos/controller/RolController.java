package com.minimarket.lospacos.controller;

import com.minimarket.lospacos.models.entity.Rol;
import com.minimarket.lospacos.service.iface.RolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rol")
public class RolController {
    
    @Autowired
    private RolService rolService;
    
    @GetMapping
    public List<Rol> getAll(){
        return rolService.getAll();
    }
    
    @PostMapping
    public void create(@RequestBody Rol rol){
        rolService.create(rol);
    }
    
    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Rol rol){
        rolService.update(id, rol);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        rolService.delete(id);
    }
}
