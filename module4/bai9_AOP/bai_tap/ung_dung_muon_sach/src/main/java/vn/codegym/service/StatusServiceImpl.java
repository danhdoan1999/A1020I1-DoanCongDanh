package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Status;
import vn.codegym.repository.StatusRepository;
@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    StatusRepository statusRepository;
    @Override
    public void createStatus() {
        statusRepository.save(new Status(1,"available"));
        statusRepository.save(new Status(2,"used"));
    }
}
