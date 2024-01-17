package com.example.monday.resource;

import java.util.UUID;

public record StudentDto(UUID id, String name, StudentUnit unit, Semester semester, Long index) {
}
