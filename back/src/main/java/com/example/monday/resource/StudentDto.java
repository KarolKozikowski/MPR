package com.example.monday.resource;

import com.example.monday.data.Semester;
import com.example.monday.data.StudentUnit;

import java.util.UUID;

public record StudentDto(UUID id, String name, StudentUnit unit, Semester semester, Long index) {
}
