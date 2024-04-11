package com.entity.vo;

import com.entity.ChengyunshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 承运商
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public class ChengyunshangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 承运商名称
	 */
	
	private String chengyunshangmingcheng;
		
	/**
	 * 承运商电话
	 */
	
	private String chengyunshangdianhua;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 承应商地址
	 */
	
	private String chengyingshangdizhi;
				
	
	/**
	 * 设置：承运商名称
	 */
	 
	public void setChengyunshangmingcheng(String chengyunshangmingcheng) {
		this.chengyunshangmingcheng = chengyunshangmingcheng;
	}
	
	/**
	 * 获取：承运商名称
	 */
	public String getChengyunshangmingcheng() {
		return chengyunshangmingcheng;
	}
				
	
	/**
	 * 设置：承运商电话
	 */
	 
	public void setChengyunshangdianhua(String chengyunshangdianhua) {
		this.chengyunshangdianhua = chengyunshangdianhua;
	}
	
	/**
	 * 获取：承运商电话
	 */
	public String getChengyunshangdianhua() {
		return chengyunshangdianhua;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：承应商地址
	 */
	 
	public void setChengyingshangdizhi(String chengyingshangdizhi) {
		this.chengyingshangdizhi = chengyingshangdizhi;
	}
	
	/**
	 * 获取：承应商地址
	 */
	public String getChengyingshangdizhi() {
		return chengyingshangdizhi;
	}
			
}
