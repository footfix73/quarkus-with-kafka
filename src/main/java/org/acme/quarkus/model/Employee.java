package org.acme.quarkus.model;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {

    @NotBlank(message = "Primer apellido no puede ser nulo")
    private String firstName;

    private String lastName;

    @NotBlank(message = "Codigo empresa no puede ser nulo")
    private String empCode;

}
