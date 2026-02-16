package com.example.Registration.Form.Repository;

import com.example.Registration.Form.Model.Register;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegisterRepository extends MongoRepository<Register, String> {
}
