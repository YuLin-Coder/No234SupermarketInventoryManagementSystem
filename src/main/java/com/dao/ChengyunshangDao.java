package com.dao;

import com.entity.ChengyunshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengyunshangVO;
import com.entity.view.ChengyunshangView;


/**
 * 承运商
 * 
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public interface ChengyunshangDao extends BaseMapper<ChengyunshangEntity> {
	
	List<ChengyunshangVO> selectListVO(@Param("ew") Wrapper<ChengyunshangEntity> wrapper);
	
	ChengyunshangVO selectVO(@Param("ew") Wrapper<ChengyunshangEntity> wrapper);
	
	List<ChengyunshangView> selectListView(@Param("ew") Wrapper<ChengyunshangEntity> wrapper);

	List<ChengyunshangView> selectListView(Pagination page,@Param("ew") Wrapper<ChengyunshangEntity> wrapper);
	
	ChengyunshangView selectView(@Param("ew") Wrapper<ChengyunshangEntity> wrapper);
	

}
