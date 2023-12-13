package com.demo;

public class Demo_c {
	String name,phone,email,dob,gender,language,program;
	Demo_c(String name,String phone,String email,String dob,String gender,String language,String program)
	{
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.dob=dob;
		this.gender=gender;
		this.language=language;
		this.program=program;
	}
	String display(String type)
	{	
		String data="";
		if(type=="name")
		{
			data=name;
		}else if (type=="phone") {
			data=phone;
		}else if (type=="email") {
			data=email;
		}else if (type=="dob") {
			data=dob;
		}else if (type=="gender") {
			data=gender;
		}else if (type=="language") {
			data=language;
		}else if (type=="program") {
			data=program;
		}
		return data;
	}
}
