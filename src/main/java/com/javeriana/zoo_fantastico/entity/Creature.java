package com.javeriana.zoo_fantastico.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Creature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre de la criatura no puede estar vacio")
    private String name;

    @NotBlank(message = "La especie no puede estar vacia")
    private String species;

    @Min(value = 0, message = "El tamano no puede ser negativo")
    private double size;

    @Min(value = 1, message = "El nivel de peligro minimo es 1")
    @Max(value = 10, message = "El nivel de peligro maximo es 10")
    private int dangerLevel;

    private String healthStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "zone_id")
    private Zone zone;
}
