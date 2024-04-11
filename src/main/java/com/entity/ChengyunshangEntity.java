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
 * 承运商
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
@TableName("chengyunshang")
public class ChengyunshangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChengyunshangEntity() {
		
	}
	
	public ChengyunshangEntity(T t) {
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
	 * 承运商编号
	 */
					
	private String chengyunshangbianhao;
	
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
	 * 设置：承运商编号
	 */
	public void setChengyunshangbianhao(String chengyunshangbianhao) {
		this.chengyunshangbianhao = chengyunshangbianhao;
	}
	/**
	 * 获取：承运商编号
	 */
	public String getChengyunshangbianhao() {
		return chengyunshangbianhao;
	}
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
