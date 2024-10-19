package com.easybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(name="Customer",description = "Schema to hold customer and account information")
public class CustomerDto {
    @NotEmpty(message = "Name can't be empty or null")
    @Size(min=5, max=30, message = "The lengthe of the Customer name should be between 5 and 30")
    @Schema(description = "name of customer",example = "anil")
    private String name;
    @NotEmpty(message = "Email can't be empty or null")
    @Email(message = "Email address not valid")
    private String email;
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    @Schema(description = "Mobile of customer",example = "9283219312")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
