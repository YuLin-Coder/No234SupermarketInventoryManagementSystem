package com.entity.vo;

import com.entity.XiaoshoudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 销售订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public class XiaoshoudingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 订单数量
	 */
	
	private Integer dingdanshuliang;
		
	/**
	 * 订单总价
	 */
	
	private Float dingdanzongjia;
		
	/**
	 * 订单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dingdanshijian;
		
	/**
	 * 订单详情
	 */
	
	private String dingdanxiangqing;
		
	/**
	 * 员工账号
	 */
	
	private String yuangongzhanghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：订单数量
	 */
	 
	public void setDingdanshuliang(Integer dingdanshuliang) {
		this.dingdanshuliang = dingdanshuliang;
	}
	
	/**
	 * 获取：订单数量
	 */
	public Integer getDingdanshuliang() {
		return dingdanshuliang;
	}
				
	
	/**
	 * 设置：订单总价
	 */
	 
	public void setDingdanzongjia(Float dingdanzongjia) {
		this.dingdanzongjia = dingdanzongjia;
	}
	
	/**
	 * 获取：订单总价
	 */
	public Float getDingdanzongjia() {
		return dingdanzongjia;
	}
				
	
	/**
	 * 设置：订单时间
	 */
	 
	public void setDingdanshijian(Date dingdanshijian) {
		this.dingdanshijian = dingdanshijian;
	}
	
	/**
	 * 获取：订单时间
	 */
	public Date getDingdanshijian() {
		return dingdanshijian;
	}
				
	
	/**
	 * 设置：订单详情
	 */
	 
	public void setDingdanxiangqing(String dingdanxiangqing) {
		this.dingdanxiangqing = dingdanxiangqing;
	}
	
	/**
	 * 获取：订单详情
	 */
	public String getDingdanxiangqing() {
		return dingdanxiangqing;
	}
				
	
	/**
	 * 设置：员工账号
	 */
	 
	public void setYuangongzhanghao(String yuangongzhanghao) {
		this.yuangongzhanghao = yuangongzhanghao;
	}
	
	/**
	 * 获取：员工账号
	 */
	public String getYuangongzhanghao() {
		return yuangongzhanghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
