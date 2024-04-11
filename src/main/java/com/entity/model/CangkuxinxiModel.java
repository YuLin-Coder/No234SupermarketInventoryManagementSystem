package com.entity.model;

import com.entity.CangkuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 仓库信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public class CangkuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 仓库名称
	 */
	
	private String cangkumingcheng;
		
	/**
	 * 仓库位置
	 */
	
	private String cangkuweizhi;
		
	/**
	 * 仓库类型
	 */
	
	private String cangkuleixing;
		
	/**
	 * 仓库详情
	 */
	
	private String cangkuxiangqing;
				
	
	/**
	 * 设置：仓库名称
	 */
	 
	public void setCangkumingcheng(String cangkumingcheng) {
		this.cangkumingcheng = cangkumingcheng;
	}
	
	/**
	 * 获取：仓库名称
	 */
	public String getCangkumingcheng() {
		return cangkumingcheng;
	}
				
	
	/**
	 * 设置：仓库位置
	 */
	 
	public void setCangkuweizhi(String cangkuweizhi) {
		this.cangkuweizhi = cangkuweizhi;
	}
	
	/**
	 * 获取：仓库位置
	 */
	public String getCangkuweizhi() {
		return cangkuweizhi;
	}
				
	
	/**
	 * 设置：仓库类型
	 */
	 
	public void setCangkuleixing(String cangkuleixing) {
		this.cangkuleixing = cangkuleixing;
	}
	
	/**
	 * 获取：仓库类型
	 */
	public String getCangkuleixing() {
		return cangkuleixing;
	}
				
	
	/**
	 * 设置：仓库详情
	 */
	 
	public void setCangkuxiangqing(String cangkuxiangqing) {
		this.cangkuxiangqing = cangkuxiangqing;
	}
	
	/**
	 * 获取：仓库详情
	 */
	public String getCangkuxiangqing() {
		return cangkuxiangqing;
	}
			
}
