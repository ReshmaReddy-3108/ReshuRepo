package com.application.springboot.serviceimpl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.springboot.model.User1;
@Repository
public interface MainInterface extends CrudRepository<User1,Integer>{

}
