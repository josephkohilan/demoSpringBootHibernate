package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entity.DefinitionEntity;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("definition")
	public List<DefinitionEntity> getDefinitionEntity() {
		return demoService.getDefinitionEntity();
	}

}
