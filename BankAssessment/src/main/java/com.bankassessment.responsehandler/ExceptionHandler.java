/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bankassessment.responsehandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */

public class ExceptionHandler extends ResponseEntityExceptionHandler {
	public static ResponseEntity<Object> generateResponse(int responseCode, HttpStatus status, boolean success, String message) {
		Map<String, Object> errorResponse = new HashMap<String, Object>();
		errorResponse.put("responseCode", responseCode);
		errorResponse.put("status", status.value());
		errorResponse.put("success", success);
		errorResponse.put("message", message);
		return new ResponseEntity<Object>(errorResponse, status);
	}
}
