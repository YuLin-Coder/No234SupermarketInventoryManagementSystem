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
 * 仓库信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
@TableName("cangkuxinxi")
public class CangkuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CangkuxinxiEntity() {
		
	}
	
	public CangkuxinxiEntity(T t) {
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
	 * 仓库号
	 */
					
	private String cangkuhao;
	
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
	 * 设置：仓库号
	 */
	public void setCangkuhao(String cangkuhao) {
		this.cangkuhao = cangkuhao;
	}
	/**
	 * 获取：仓库号
	 */
	public String getCangkuhao() {
		return cangkuhao;
	}
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
