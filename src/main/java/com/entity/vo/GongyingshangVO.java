package com.entity.vo;

import com.entity.GongyingshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 供应商
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public class GongyingshangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 供应商名称
	 */
	
	private String gongyingshangmingcheng;
		
	/**
	 * 供应商电话
	 */
	
	private String gongyingshangdianhua;
		
	/**
	 * 供应商地址
	 */
	
	private String gongyingshangdizhi;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
				
	
	/**
	 * 设置：供应商名称
	 */
	 
	public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
		this.gongyingshangmingcheng = gongyingshangmingcheng;
	}
	
	/**
	 * 获取：供应商名称
	 */
	public String getGongyingshangmingcheng() {
		return gongyingshangmingcheng;
	}
				
	
	/**
	 * 设置：供应商电话
	 */
	 
	public void setGongyingshangdianhua(String gongyingshangdianhua) {
		this.gongyingshangdianhua = gongyingshangdianhua;
	}
	
	/**
	 * 获取：供应商电话
	 */
	public String getGongyingshangdianhua() {
		return gongyingshangdianhua;
	}
				
	
	/**
	 * 设置：供应商地址
	 */
	 
	public void setGongyingshangdizhi(String gongyingshangdizhi) {
		this.gongyingshangdizhi = gongyingshangdizhi;
	}
	
	/**
	 * 获取：供应商地址
	 */
	public String getGongyingshangdizhi() {
		return gongyingshangdizhi;
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
			
}
