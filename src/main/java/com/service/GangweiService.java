package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GangweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GangweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GangweiView;


/**
 * 岗位
 *
 * @author 
 * @email 
 * @date 2022-04-13 14:00:30
 */
public interface GangweiService extends IService<GangweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GangweiVO> selectListVO(Wrapper<GangweiEntity> wrapper);
   	
   	GangweiVO selectVO(@Param("ew") Wrapper<GangweiEntity> wrapper);
   	
   	List<GangweiView> selectListView(Wrapper<GangweiEntity> wrapper);
   	
   	GangweiView selectView(@Param("ew") Wrapper<GangweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GangweiEntity> wrapper);
   	

}

