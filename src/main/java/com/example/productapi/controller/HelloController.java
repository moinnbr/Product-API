package com.example.productapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
@GetMapping("/hello-second")
public String helloSecond() {
return "Hello from the second API!";
}
}