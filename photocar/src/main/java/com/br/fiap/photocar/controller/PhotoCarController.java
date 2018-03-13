package com.br.fiap.photocar.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.fiap.photocar.component.PhotoCarComponent;
import com.br.fiap.photocar.model.PhotoCar;

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
    
    @RequestMapping(value="/salvar", produces={"image/jpeg"})
    @PostMapping
    public void salvar(@RequestHeader PhotoCar item) {
    	photoCarComponent.salvar(item);
    }



}