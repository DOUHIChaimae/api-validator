package com.sqli.intern.api.validator.services.impl;

import com.sqli.intern.api.validator.chainofvalidation.StrategyWs;
import com.sqli.intern.api.validator.dtos.RequestDto;
import com.sqli.intern.api.validator.dtos.ResponseDto;
import com.sqli.intern.api.validator.services.OperationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class OperationServiceImpl implements OperationService {
    @Autowired
    private StrategyWs strategyWs;
    @Override
    public ResponseDto call(RequestDto requestDto) {
        final ResponseDto responseDto = ResponseDto.builder()
                .url(requestDto.getUrl())
                .type(requestDto.getType())
                .body(requestDto.getBody())
                .expectedResponse(requestDto.getExpectedResponse())
                .build();
        strategyWs.getCaller(requestDto.getType()).call(responseDto);
        return responseDto;
    }
}
