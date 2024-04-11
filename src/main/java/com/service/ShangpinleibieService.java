package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinleibieView;


/**
 * 商品类别
 *
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public interface ShangpinleibieService extends IService<ShangpinleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinleibieVO> selectListVO(Wrapper<ShangpinleibieEntity> wrapper);
   	
   	ShangpinleibieVO selectVO(@Param("ew") Wrapper<ShangpinleibieEntity> wrapper);
   	
   	List<ShangpinleibieView> selectListView(Wrapper<ShangpinleibieEntity> wrapper);
   	
   	ShangpinleibieView selectView(@Param("ew") Wrapper<ShangpinleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinleibieEntity> wrapper);
   	

}

