package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaigouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaigouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaigouxinxiView;


/**
 * 采购信息
 *
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
public interface CaigouxinxiService extends IService<CaigouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaigouxinxiVO> selectListVO(Wrapper<CaigouxinxiEntity> wrapper);
   	
   	CaigouxinxiVO selectVO(@Param("ew") Wrapper<CaigouxinxiEntity> wrapper);
   	
   	List<CaigouxinxiView> selectListView(Wrapper<CaigouxinxiEntity> wrapper);
   	
   	CaigouxinxiView selectView(@Param("ew") Wrapper<CaigouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaigouxinxiEntity> wrapper);
   	

}

