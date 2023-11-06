package com.vti.kshop.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Getter
@Setter
public class AccessoryCreateForm {
    @NotBlank
    @Length(max = 255)
    private String name;

    @NotNull
    @PositiveOrZero
    private Long price;

    @NotBlank
    @Length(max = 255)
    private String statusDamaged;

    @NotBlank
    @Length(max = 255)
    private String repairStatus;

    @NotBlank
    @Length(max = 255)
    private  String LicensePlate;

    @NotNull
    @PastOrPresent
    private LocalDate RepairDate;
}
