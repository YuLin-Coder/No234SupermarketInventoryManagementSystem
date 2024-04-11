package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengyunshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengyunshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengyunshangView;


/**
 * 承运商
 *
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public interface ChengyunshangService extends IService<ChengyunshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengyunshangVO> selectListVO(Wrapper<ChengyunshangEntity> wrapper);
   	
   	ChengyunshangVO selectVO(@Param("ew") Wrapper<ChengyunshangEntity> wrapper);
   	
   	List<ChengyunshangView> selectListView(Wrapper<ChengyunshangEntity> wrapper);
   	
   	ChengyunshangView selectView(@Param("ew") Wrapper<ChengyunshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengyunshangEntity> wrapper);
   	

}

