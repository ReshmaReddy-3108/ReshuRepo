package com.application.springboot.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.springboot.model.User1;
import com.application.springboot.serviceimpl.MainServiceImpl;

@Service
@Transactional
public class MainService {
	@Autowired
	private MainServiceImpl msi;


/*private final MainInterface msI;
public MainService(MainInterface msI){
	this.msI=msI;
}*/
	
public ArrayList<User1> getData(User1 u1){
	ArrayList ls =  new ArrayList();
	ls=msi.getData(u1);
	return ls;
}

public void add(User1 us1){
	msi.add(us1);
}
}
