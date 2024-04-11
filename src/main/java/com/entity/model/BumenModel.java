package com.entity.model;

import com.entity.BumenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-13 14:00:30
 */
public class BumenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 部门简介
	 */
	
	private String bumenjianjie;
				
	
	/**
	 * 设置：部门简介
	 */
	 
	public void setBumenjianjie(String bumenjianjie) {
		this.bumenjianjie = bumenjianjie;
	}
	
	/**
	 * 获取：部门简介
	 */
	public String getBumenjianjie() {
		return bumenjianjie;
	}
			
}
