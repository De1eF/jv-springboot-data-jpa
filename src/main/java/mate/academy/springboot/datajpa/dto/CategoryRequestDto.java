package mate.academy.springboot.datajpa.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CategoryRequestDto {
    @NotNull
    private String name;
}
