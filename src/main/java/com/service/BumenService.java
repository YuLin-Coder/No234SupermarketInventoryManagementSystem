package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BumenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BumenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenView;


/**
 * 部门
 *
 * @author 
 * @email 
 * @date 2022-04-13 14:00:30
 */
public interface BumenService extends IService<BumenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BumenVO> selectListVO(Wrapper<BumenEntity> wrapper);
   	
   	BumenVO selectVO(@Param("ew") Wrapper<BumenEntity> wrapper);
   	
   	List<BumenView> selectListView(Wrapper<BumenEntity> wrapper);
   	
   	BumenView selectView(@Param("ew") Wrapper<BumenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BumenEntity> wrapper);
   	

}

