package com.example.monday.resource;

import com.example.monday.data.StudentUnit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

public record StudentDto(UUID id, String name, StudentUnit unit, Long index) {
}
