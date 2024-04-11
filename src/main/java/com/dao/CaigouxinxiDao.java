package com.dao;

import com.entity.CaigouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaigouxinxiVO;
import com.entity.view.CaigouxinxiView;


/**
 * 采购信息
 * 
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public interface CaigouxinxiDao extends BaseMapper<CaigouxinxiEntity> {
	
	List<CaigouxinxiVO> selectListVO(@Param("ew") Wrapper<CaigouxinxiEntity> wrapper);
	
	CaigouxinxiVO selectVO(@Param("ew") Wrapper<CaigouxinxiEntity> wrapper);
	
	List<CaigouxinxiView> selectListView(@Param("ew") Wrapper<CaigouxinxiEntity> wrapper);

	List<CaigouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CaigouxinxiEntity> wrapper);
	
	CaigouxinxiView selectView(@Param("ew") Wrapper<CaigouxinxiEntity> wrapper);
	

}
