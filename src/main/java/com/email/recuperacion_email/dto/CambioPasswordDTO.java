package com.email.recuperacion_email.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CambioPasswordDTO {

    private String password;

    private String confirmPassword;

    private String tokenPassword;


}
