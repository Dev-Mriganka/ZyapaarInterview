package com.zyepaar.zyepaarproject.exception;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

   @ExceptionHandler(value = ItemException.class)
   public ResponseEntity<ResponseApi> itemExceptionHandler(ItemException ie, WebRequest web) {

      ResponseApi responseApi = new ResponseApi();
      responseApi.setDescription(ie.getMessage());
      responseApi.setTimeStamp(LocalTime.now());

      return new ResponseEntity<ResponseApi>(responseApi, HttpStatus.BAD_REQUEST);

   }

   @ExceptionHandler(value = CategoryException.class)
   public ResponseEntity<ResponseApi> categoryExceptionHandler(CategoryException ce, WebRequest web) {

      ResponseApi responseApi = new ResponseApi();
      responseApi.setDescription(ce.getMessage());
      responseApi.setTimeStamp(LocalTime.now());

      return new ResponseEntity<ResponseApi>(responseApi, HttpStatus.BAD_REQUEST);

   }

   @ExceptionHandler(value = Exception.class)
   public ResponseEntity<ResponseApi> ExceptionHandler(Exception e) {

      ResponseApi responseApi = new ResponseApi();
      responseApi.setDescription(e.getMessage());
      responseApi.setTimeStamp(LocalTime.now());

      return new ResponseEntity<ResponseApi>(responseApi, HttpStatus.BAD_REQUEST);

   }

   @ExceptionHandler(value = MethodArgumentNotValidException.class)
   public ResponseEntity<ResponseApi> itemExceptionHandler(MethodArgumentNotValidException me) {

      ResponseApi responseApi = new ResponseApi();
      responseApi.setDescription(me.getMessage());
      responseApi.setTimeStamp(LocalTime.now());

      return new ResponseEntity<ResponseApi>(responseApi, HttpStatus.BAD_REQUEST);

   }

}
