package com.example.work_task.model.rest;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;

    private String password;
}