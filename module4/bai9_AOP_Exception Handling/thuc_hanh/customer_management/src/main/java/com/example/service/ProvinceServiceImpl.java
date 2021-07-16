package com.example.service;

import com.example.model.Province;
import com.example.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProvinceService")
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(int id) {
        return provinceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Province province) {
        provinceRepository.delete(province);
    }

    @Override
    public void update(Province province) {
        provinceRepository.save(province);
    }
}
