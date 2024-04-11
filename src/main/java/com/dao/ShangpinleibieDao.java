package com.dao;

import com.entity.ShangpinleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinleibieVO;
import com.entity.view.ShangpinleibieView;


/**
 * 商品类别
 * 
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public interface ShangpinleibieDao extends BaseMapper<ShangpinleibieEntity> {
	
	List<ShangpinleibieVO> selectListVO(@Param("ew") Wrapper<ShangpinleibieEntity> wrapper);
	
	ShangpinleibieVO selectVO(@Param("ew") Wrapper<ShangpinleibieEntity> wrapper);
	
	List<ShangpinleibieView> selectListView(@Param("ew") Wrapper<ShangpinleibieEntity> wrapper);

	List<ShangpinleibieView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinleibieEntity> wrapper);
	
	ShangpinleibieView selectView(@Param("ew") Wrapper<ShangpinleibieEntity> wrapper);
	

}
