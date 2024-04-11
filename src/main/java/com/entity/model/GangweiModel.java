package com.entity.model;

import com.entity.GangweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 岗位
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-13 14:00:30
 */
public class GangweiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 岗位人数
	 */
	
	private String gangweirenshu;
		
	/**
	 * 岗位简介
	 */
	
	private String gangweijianjie;
				
	
	/**
	 * 设置：岗位人数
	 */
	 
	public void setGangweirenshu(String gangweirenshu) {
		this.gangweirenshu = gangweirenshu;
	}
	
	/**
	 * 获取：岗位人数
	 */
	public String getGangweirenshu() {
		return gangweirenshu;
	}
				
	
	/**
	 * 设置：岗位简介
	 */
	 
	public void setGangweijianjie(String gangweijianjie) {
		this.gangweijianjie = gangweijianjie;
	}
	
	/**
	 * 获取：岗位简介
	 */
	public String getGangweijianjie() {
		return gangweijianjie;
	}
			
}
