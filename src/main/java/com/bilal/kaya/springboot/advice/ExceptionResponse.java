package com.bilal.kaya.springboot.advice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor //Sınıfın Constructorını üretir.
@NoArgsConstructor  // Parametresiz Constructor üretir.
public class ExceptionResponse {
    private LocalDateTime timeStamp;
    private String message;
    private String code;

}
