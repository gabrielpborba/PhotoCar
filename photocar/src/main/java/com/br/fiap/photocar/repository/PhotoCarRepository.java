package com.br.fiap.photocar.repository;


        import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.fiap.photocar.model.PhotoCar;

public interface PhotoCarRepository extends MongoRepository<PhotoCar, String>{


}