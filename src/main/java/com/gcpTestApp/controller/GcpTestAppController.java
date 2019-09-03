package com.gcpTestApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GcpTestAppController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getText1() {
		String str = "Hey!!! Default Api from GCP Srevice... ";
		return str;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getText2() {
		String str = "Hey!!! test Api from GCP Srevice... ";
		return str;
	}

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public String getText3() {
		String str = "Hey!!! first Api from GCP Srevice... ";
		return str;
	}
}