package com.zyepaar.zyepaarproject.exception;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseApi {

   private LocalTime timeStamp;
   private String description;

}
