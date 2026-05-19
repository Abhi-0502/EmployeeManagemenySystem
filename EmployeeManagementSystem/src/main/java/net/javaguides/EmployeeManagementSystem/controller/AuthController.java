package net.javaguides.EmployeeManagementSystem.controller;

import net.javaguides.EmployeeManagementSystem.dto.AuthRequest;
import net.javaguides.EmployeeManagementSystem.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {

        // Demo username/password
        if ("admin".equals(request.getUsername())
                && "admin123".equals(request.getPassword())) {

            return jwtUtil.generateToken(request.getUsername());
        }

        return "Invalid Username or Password";
    }
}
