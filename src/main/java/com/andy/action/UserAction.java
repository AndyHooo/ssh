package com.andy.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.alibaba.fastjson.JSONObject;


/**
 * @ClassName UserAction
 * @Description user相关操作
 * @author Andy
 * @Date 2016年7月27日 下午9:24:20
 * @version 1.0.0
 */

@ParentPackage("struts-default")
@Namespace("/user")
@Results({@Result(name = "success",location = "/jsp/success.jsp"),
	@Result(name = "error",location = "/jsp/error.jsp")})
public class UserAction {
	
	private String name;
	
	/**
	 * @Description 用户注册
	 * @return
	 */
	
	@Action(value = "reg")
	public String reg(){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", name);
		System.out.println(jsonObject.toString());
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
