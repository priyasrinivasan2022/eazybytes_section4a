package com.easybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {
    @NotEmpty(message = "Account number can't be empty or null")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account number must be 10 digits")
    private Long accountNumber;
    @NotEmpty(message = "Account type can't be null or empty")
    @Schema(description = "Account type of Eazy Bank account", example = "Savings")
    private String accountType;
    @NotEmpty(message = "Branch address can't be null or empty")
    @Schema(description = "Eazy Bank branch address", example = "123 NewYork")
    private String branchAddress;
}
