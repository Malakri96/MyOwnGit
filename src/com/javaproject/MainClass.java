package com.javaproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class MainClass  {

	public static void main(String args[]) throws JsonProcessingException {
		Employe e=new Employe();
		e.setEmpName("Ram");
		e.setEmpNum("123");
		e.setId(234);
		
		Employe e1=new Employe();
		e1.setEmpName("Ram");
		e1.setEmpNum("123");
		e1.setId(234);
		
		Gson json=new Gson();
		String json1="{\"empName\":\"Ram\",\"id\":234,\"empNum\":\"123\"}";
		
		Employe e2=json.fromJson(json1, Employe.class);
		String s3=e2.getEmpName();
		String s4=e2.getEmpNum();
		Integer s5=e2.getId();
		System.out.println("empName="+s3+" empNum="+s4+" Id="+s5);
		
		ObjectMapper om=new ObjectMapper();
		
		String s=om.writeValueAsString(e1);
		//System.out.println("json="+s);
		//System.out.println("obj="+e1);
		
		
		
	}



}
