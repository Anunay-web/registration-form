package com.example.Registration.Form.Controller;

import com.example.Registration.Form.Model.Register;
import com.example.Registration.Form.service.RegisterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/register")
@CrossOrigin(origins = "http://localhost:5173")
public class RegisterController {

    private final RegisterService service;

    public RegisterController(RegisterService service) {
        this.service = service;
    }

    @PostMapping
    public Register registerUser(@RequestBody Register register) {
        return service.saveUser(register);
    }

    @GetMapping
    public List<Register> getAllUsers() {
        return service.getAllUsers();
    }
}
