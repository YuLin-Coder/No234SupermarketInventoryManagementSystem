package com.entity.vo;

import com.entity.KehuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 客户
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public class KehuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 客户头像
	 */
	
	private String kehutouxiang;
		
	/**
	 * 客户电话
	 */
	
	private String kehudianhua;
		
	/**
	 * 客户地址
	 */
	
	private String kehudizhi;
				
	
	/**
	 * 设置：客户姓名
	 */
	 
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
				
	
	/**
	 * 设置：客户头像
	 */
	 
	public void setKehutouxiang(String kehutouxiang) {
		this.kehutouxiang = kehutouxiang;
	}
	
	/**
	 * 获取：客户头像
	 */
	public String getKehutouxiang() {
		return kehutouxiang;
	}
				
	
	/**
	 * 设置：客户电话
	 */
	 
	public void setKehudianhua(String kehudianhua) {
		this.kehudianhua = kehudianhua;
	}
	
	/**
	 * 获取：客户电话
	 */
	public String getKehudianhua() {
		return kehudianhua;
	}
				
	
	/**
	 * 设置：客户地址
	 */
	 
	public void setKehudizhi(String kehudizhi) {
		this.kehudizhi = kehudizhi;
	}
	
	/**
	 * 获取：客户地址
	 */
	public String getKehudizhi() {
		return kehudizhi;
	}
			
}
