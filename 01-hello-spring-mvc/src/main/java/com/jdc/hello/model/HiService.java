package com.jdc.hello.model;

import org.springframework.stereotype.Service;

@Service
public class HiService {

	public String getMessage() {
		return "Hi from root application context";
	}
}
