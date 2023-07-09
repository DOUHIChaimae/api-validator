package com.sqli.intern.api.validator.utilities.dtos;

import com.sqli.intern.api.validator.utilities.enums.ValidationStatus;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private String url;
    private String type;
    private String body;
    private String expectedResponse;
    private String httpStatus;
    private String actualResponse;
    private List<String> message;
    private ValidationStatus validationStatus;
}
