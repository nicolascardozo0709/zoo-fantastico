package com.javeriana.zoo_fantastico.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ZoneResponse {
    private Long id;
    private String name;
    private String description;
    private int capacity;
    private int creatureCount;
}
