package com.example.studentms.controller;


import com.example.studentms.dto.StudentDTO;
import com.example.studentms.exception.ResourceNotFoundException;
import com.example.studentms.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentController {


private final StudentService service;


public StudentController(StudentService service) { this.service = service; }


@PostMapping
public ResponseEntity<StudentDTO> create(@Valid @RequestBody StudentDTO dto) {
return ResponseEntity.status(HttpStatus.CREATED).body(service.createStudent(dto));
}


@GetMapping
public List<StudentDTO> getAll() { return service.
