package com.dao;

import com.entity.ChukuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChukuxinxiVO;
import com.entity.view.ChukuxinxiView;


/**
 * 出库信息
 * 
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public interface ChukuxinxiDao extends BaseMapper<ChukuxinxiEntity> {
	
	List<ChukuxinxiVO> selectListVO(@Param("ew") Wrapper<ChukuxinxiEntity> wrapper);
	
	ChukuxinxiVO selectVO(@Param("ew") Wrapper<ChukuxinxiEntity> wrapper);
	
	List<ChukuxinxiView> selectListView(@Param("ew") Wrapper<ChukuxinxiEntity> wrapper);

	List<ChukuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChukuxinxiEntity> wrapper);
	
	ChukuxinxiView selectView(@Param("ew") Wrapper<ChukuxinxiEntity> wrapper);
	

}
