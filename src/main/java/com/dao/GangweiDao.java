package com.dao;

import com.entity.GangweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GangweiVO;
import com.entity.view.GangweiView;


/**
 * 岗位
 * 
 * @author 
 * @email 
 * @date 2022-04-13 14:00:30
 */
public interface GangweiDao extends BaseMapper<GangweiEntity> {
	
	List<GangweiVO> selectListVO(@Param("ew") Wrapper<GangweiEntity> wrapper);
	
	GangweiVO selectVO(@Param("ew") Wrapper<GangweiEntity> wrapper);
	
	List<GangweiView> selectListView(@Param("ew") Wrapper<GangweiEntity> wrapper);

	List<GangweiView> selectListView(Pagination page,@Param("ew") Wrapper<GangweiEntity> wrapper);
	
	GangweiView selectView(@Param("ew") Wrapper<GangweiEntity> wrapper);
	

}
