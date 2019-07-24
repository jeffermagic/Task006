package com.dao;
import java.util.List;

import com.entities.Emp;
public interface Empdao {
	public List<Emp> List();
	public boolean delete (Emp Emp);
	public boolean saveOrUpdate (Emp Emp);

}
