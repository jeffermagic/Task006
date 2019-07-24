package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="emp")
public class Emp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="idEMP")
	private int idEMP;
	
	
	@Column(name="Empname")
	private String Empname;
	
	@Column (name="email")
	private String mail;
	
	public int getId() {
		return idEMP;
	
	}
	public void setId (int idEMP)
	{
		this.idEMP= idEMP;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname (String Empname) {
		this.Empname=Empname;
	}
	public String getmail () {
		return mail;
		}
	public void setmail(String mail) {
		this.mail=mail;
	}
	
}
