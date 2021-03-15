package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	//	http://localhost:8080/div?value1=100&value2=4
	// http://localhost:8080/div?value1=100&value2=4&value3=2
	//	http://localhost:8080/div?value1=100&value2=4&value3=2&value4=2
	@RequestMapping(value = "/div", method = RequestMethod.GET)
	public String divideValue(String value1, String value2, String value3, String value4) {
		
				Integer newValue = 0;
				
				if (value4 != null) {
					newValue = Integer.parseInt(value1) / Integer.parseInt(value2) / Integer.parseInt(value3) / Integer.parseInt(value4); 
				} else if (value3 != null) {
					newValue = Integer.parseInt(value1) / Integer.parseInt(value2) / Integer.parseInt(value3); 
				} else if (value2 != null) {
					newValue = Integer.parseInt(value1) / Integer.parseInt(value2); 
				} else if (value1 != null) {
					newValue = Integer.parseInt(value1);
				}
				
				System.out.println(newValue);
				return newValue.toString();
		}
	
	//	http://localhost:8080/add?value1=11&value2=3
	//	http://localhost:8080/add?value1=11&value2=3&value3=13
	//	http://localhost:8080/add?value1=11&value2=3&value3=13&value4=7
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addValue(String value1, String value2, String value3, String value4) {
		
			Integer newValue = 0;
			
			if (value4 != null) {
				newValue = Integer.parseInt(value1) + Integer.parseInt(value2) + Integer.parseInt(value3) + Integer.parseInt(value4); 
			} else if (value3 != null) {
				newValue = Integer.parseInt(value1) + Integer.parseInt(value2) + Integer.parseInt(value3); 
			} else if (value2 != null) {
				newValue = Integer.parseInt(value1) + Integer.parseInt(value2); 
			} else if (value1 != null) {
				newValue = Integer.parseInt(value1);
			}
			
			System.out.println(newValue);
			return newValue.toString();
		}
	
	//	http://localhost:8080/mult?value1=9&value2=23
	//	http://localhost:8080/mult?value1=9&value2=23&value3=2
	//	http://localhost:8080/mult?value1=9&value2=23&value3=2&value4=5
	@RequestMapping(value = "/mult", method = RequestMethod.GET)
	public String multiplyValue(String value1, String value2, String value3, String value4) {
		
		Integer newValue = 0;
		
			if (value4 != null) {
				newValue = Integer.parseInt(value1) * Integer.parseInt(value2) * Integer.parseInt(value3) * Integer.parseInt(value4); 
			} else if (value3 != null) {
				newValue = Integer.parseInt(value1) * Integer.parseInt(value2) * Integer.parseInt(value3); 
			} else if (value2 != null) {
				newValue = Integer.parseInt(value1) * Integer.parseInt(value2); 
			} else if (value1 != null) {
				newValue = Integer.parseInt(value1);
			}
			
			System.out.println(newValue);
			return newValue.toString();
		}
}
