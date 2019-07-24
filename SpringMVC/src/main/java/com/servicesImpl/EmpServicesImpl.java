package com.servicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Emp;
import com.services.Empservices;
import com.dao.Empdao;
@Service
public class EmpServicesImpl implements Empservices{
    @Autowired    
    Empdao Empdao;

	public java.util.List<Emp> List() {
		// TODO Auto-generated method stub
		return Empdao.List();
	}

	public boolean delete(Emp Emp) {
		// TODO Auto-generated method stub
		return Empdao.delete(Emp);
	}

	public boolean saveOrUpdate(Emp Emp) {
		// TODO Auto-generated method stub
		return Empdao.saveOrUpdate(Emp);
	}
}
    
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
 	 
  
}
*/