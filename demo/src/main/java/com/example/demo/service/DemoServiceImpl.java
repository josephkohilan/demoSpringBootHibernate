package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.DefinitionEntity;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	DemoRepository demoRepository;

	@Override
	public List<DefinitionEntity> getDefinitionEntity() {
		return demoRepository.getDefinitionEntity();
	}

}
