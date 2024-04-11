package com.entity.view;

import com.entity.BumenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 部门
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-13 14:00:30
 */
@TableName("bumen")
public class BumenView  extends BumenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BumenView(){
	}
 
 	public BumenView(BumenEntity bumenEntity){
 	try {
			BeanUtils.copyProperties(this, bumenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
