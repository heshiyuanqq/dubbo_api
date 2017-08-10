package com.dubbo.test.pojo;

import java.io.Serializable;

import javax.xml.ws.ServiceMode;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BaseBean implements Serializable{

	//private static final long serialVersionUID = 3652016037713542990L;
	
	private String xxx;
    private String yyy;
    private Integer zzz;
    
    
    public static void main(String[] args) {
    	
		BaseBean bean = new BaseBean();
		
	}
}
