package com.services;

import java.util.List;

import com.entities.Emp;

public interface Empservices {
	public List<Emp> List();
	public boolean delete (Emp Emp);
	public boolean saveOrUpdate (Emp Emp);

}
