package com.example.Registration.Form.service;

import com.example.Registration.Form.Model.Register;
import com.example.Registration.Form.Repository.RegisterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    private final RegisterRepository repository;

    public RegisterService(RegisterRepository repository) {
        this.repository = repository;
    }

    public Register saveUser(Register register) {
        return repository.save(register);
    }

    public List<Register> getAllUsers() {
        return repository.findAll();
    }
}
