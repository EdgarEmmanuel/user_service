package com.example.user_service.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class JwtResponse {
    public String token;
    public Long id;
    public String username;
    public String password;
    public List<String> roles;

}
