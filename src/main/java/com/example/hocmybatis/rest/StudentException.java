//package com.example.hocmybatis.rest;
//
//import org.springframework.validation.FieldError;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@ControllerAdvice
//public class StudentException {
//
//    @ExceptionHandler(RuntimeException.class)
//    public Map<String, String> handleValidationExceptions(RuntimeException ex) {
//        Map<String, String> errors = new HashMap<>();
//        errors.put("lan","cho");
////        ex.getBindingResult().getAllErrors().forEach((error) -> {
////            String fieldName = ((FieldError) error).getField();
////            String errorMessage = error.getDefaultMessage();
////            errors.put(fieldName, errorMessage);
////        });
//        return errors;
//    }
//}
