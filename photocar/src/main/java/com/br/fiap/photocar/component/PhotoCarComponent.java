package com.br.fiap.photocar.component;


     
        import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.fiap.photocar.model.PhotoCar;
import com.br.fiap.photocar.repository.PhotoCarRepository;

@Service
public class PhotoCarComponent {

    @Autowired
    PhotoCarRepository photoCarRepository;


    public void salvar(PhotoCar bloquinho) {
    	photoCarRepository.save(bloquinho);
    }


    public List<PhotoCar> buscarTodos(){
        return photoCarRepository.findAll();
    }


  

}