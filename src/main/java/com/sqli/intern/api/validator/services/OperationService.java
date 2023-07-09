package com.sqli.intern.api.validator.services;

import com.sqli.intern.api.validator.utilities.dtos.RequestDto;
import com.sqli.intern.api.validator.utilities.dtos.ResponseDto;
import com.sqli.intern.api.validator.utils.ValidationStatus;

public interface OperationService {
    ValidationStatus compareJson(RequestDto requestDto);

    ResponseDto call(RequestDto requestDto);
}
