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


import com.dao.RukuxinxiDao;
import com.entity.RukuxinxiEntity;
import com.service.RukuxinxiService;
import com.entity.vo.RukuxinxiVO;
import com.entity.view.RukuxinxiView;

@Service("rukuxinxiService")
public class RukuxinxiServiceImpl extends ServiceImpl<RukuxinxiDao, RukuxinxiEntity> implements RukuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RukuxinxiEntity> page = this.selectPage(
                new Query<RukuxinxiEntity>(params).getPage(),
                new EntityWrapper<RukuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RukuxinxiEntity> wrapper) {
		  Page<RukuxinxiView> page =new Query<RukuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RukuxinxiVO> selectListVO(Wrapper<RukuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RukuxinxiVO selectVO(Wrapper<RukuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RukuxinxiView> selectListView(Wrapper<RukuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RukuxinxiView selectView(Wrapper<RukuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
