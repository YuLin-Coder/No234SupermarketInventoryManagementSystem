package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RukuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RukuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RukuxinxiView;


/**
 * 入库信息
 *
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public interface RukuxinxiService extends IService<RukuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RukuxinxiVO> selectListVO(Wrapper<RukuxinxiEntity> wrapper);
   	
   	RukuxinxiVO selectVO(@Param("ew") Wrapper<RukuxinxiEntity> wrapper);
   	
   	List<RukuxinxiView> selectListView(Wrapper<RukuxinxiEntity> wrapper);
   	
   	RukuxinxiView selectView(@Param("ew") Wrapper<RukuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RukuxinxiEntity> wrapper);
   	

}

