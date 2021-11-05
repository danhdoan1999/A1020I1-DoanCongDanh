package com.example.repository;

import com.example.model.Smartphone;
import org.springframework.data.repository.CrudRepository;

public interface SmartphoneRepository  extends CrudRepository<Smartphone,Integer> {
}
