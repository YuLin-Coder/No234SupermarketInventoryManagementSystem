package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyingshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyingshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyingshangView;


/**
 * 供应商
 *
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public interface GongyingshangService extends IService<GongyingshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyingshangVO> selectListVO(Wrapper<GongyingshangEntity> wrapper);
   	
   	GongyingshangVO selectVO(@Param("ew") Wrapper<GongyingshangEntity> wrapper);
   	
   	List<GongyingshangView> selectListView(Wrapper<GongyingshangEntity> wrapper);
   	
   	GongyingshangView selectView(@Param("ew") Wrapper<GongyingshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyingshangEntity> wrapper);
   	

}

