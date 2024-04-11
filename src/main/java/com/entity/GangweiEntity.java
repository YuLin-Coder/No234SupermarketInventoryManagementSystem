package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 岗位
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-13 14:00:30
 */
@TableName("gangwei")
public class GangweiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GangweiEntity() {
		
	}
	
	public GangweiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 岗位
	 */
					
	private String gangwei;
	
	/**
	 * 岗位人数
	 */
					
	private String gangweirenshu;
	
	/**
	 * 岗位简介
	 */
					
	private String gangweijianjie;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：岗位
	 */
	public void setGangwei(String gangwei) {
		this.gangwei = gangwei;
	}
	/**
	 * 获取：岗位
	 */
	public String getGangwei() {
		return gangwei;
	}
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
