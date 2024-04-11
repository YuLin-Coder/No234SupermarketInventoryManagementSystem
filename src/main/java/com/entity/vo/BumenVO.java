package com.entity.vo;

import com.entity.BumenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-13 14:00:30
 */
public class BumenVO  implements Serializable {
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
