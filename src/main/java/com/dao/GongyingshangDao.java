package com.dao;

import com.entity.GongyingshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyingshangVO;
import com.entity.view.GongyingshangView;


/**
 * 供应商
 * 
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public interface GongyingshangDao extends BaseMapper<GongyingshangEntity> {
	
	List<GongyingshangVO> selectListVO(@Param("ew") Wrapper<GongyingshangEntity> wrapper);
	
	GongyingshangVO selectVO(@Param("ew") Wrapper<GongyingshangEntity> wrapper);
	
	List<GongyingshangView> selectListView(@Param("ew") Wrapper<GongyingshangEntity> wrapper);

	List<GongyingshangView> selectListView(Pagination page,@Param("ew") Wrapper<GongyingshangEntity> wrapper);
	
	GongyingshangView selectView(@Param("ew") Wrapper<GongyingshangEntity> wrapper);
	

}
