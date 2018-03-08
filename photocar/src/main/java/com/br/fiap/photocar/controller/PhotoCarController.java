package com.br.fiap.photocar.controller;



        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

import com.br.fiap.photocar.component.PhotoCarComponent;
import com.br.fiap.photocar.model.PhotoCar;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/photocar")
public class PhotoCarController {

    @Autowired
    PhotoCarComponent photoCarComponent;



    @GetMapping()
    public List<PhotoCar> buscarTodos(){
        return photoCarComponent.buscarTodos();
    }

    @PostMapping
    public void salvar(@RequestBody PhotoCar item) {
    	photoCarComponent.salvar(item);
    }



}