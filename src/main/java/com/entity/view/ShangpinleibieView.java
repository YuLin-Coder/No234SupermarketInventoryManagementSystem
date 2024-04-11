package com.entity.view;

import com.entity.ShangpinleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
@TableName("shangpinleibie")
public class ShangpinleibieView  extends ShangpinleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinleibieView(){
	}
 
 	public ShangpinleibieView(ShangpinleibieEntity shangpinleibieEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
