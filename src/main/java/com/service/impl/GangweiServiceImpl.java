package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GangweiDao;
import com.entity.GangweiEntity;
import com.service.GangweiService;
import com.entity.vo.GangweiVO;
import com.entity.view.GangweiView;

@Service("gangweiService")
public class GangweiServiceImpl extends ServiceImpl<GangweiDao, GangweiEntity> implements GangweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GangweiEntity> page = this.selectPage(
                new Query<GangweiEntity>(params).getPage(),
                new EntityWrapper<GangweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GangweiEntity> wrapper) {
		  Page<GangweiView> page =new Query<GangweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GangweiVO> selectListVO(Wrapper<GangweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GangweiVO selectVO(Wrapper<GangweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GangweiView> selectListView(Wrapper<GangweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GangweiView selectView(Wrapper<GangweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
