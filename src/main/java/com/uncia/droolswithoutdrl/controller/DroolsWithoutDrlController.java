package com.uncia.droolswithoutdrl.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uncia.droolswithoutdrl.service.DroolsWithoutDrlService;

@RestController
@RequestMapping("/ruleservice")
public class DroolsWithoutDrlController {

	@Autowired
	private DroolsWithoutDrlService droolsWithoutDrlService;

	@PostMapping("/getDate")
	public ResponseEntity<Date> getRate(@RequestParam String inputDate) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

         Date inputDate1 = dateFormat.parse(inputDate);
		
         Date date2 = droolsWithoutDrlService.getDate(inputDate1);
		return new ResponseEntity<>(date2, HttpStatus.OK);
	}
	
}
