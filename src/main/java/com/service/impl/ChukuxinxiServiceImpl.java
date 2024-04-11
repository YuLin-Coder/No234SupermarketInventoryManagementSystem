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


import com.dao.ChukuxinxiDao;
import com.entity.ChukuxinxiEntity;
import com.service.ChukuxinxiService;
import com.entity.vo.ChukuxinxiVO;
import com.entity.view.ChukuxinxiView;

@Service("chukuxinxiService")
public class ChukuxinxiServiceImpl extends ServiceImpl<ChukuxinxiDao, ChukuxinxiEntity> implements ChukuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChukuxinxiEntity> page = this.selectPage(
                new Query<ChukuxinxiEntity>(params).getPage(),
                new EntityWrapper<ChukuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChukuxinxiEntity> wrapper) {
		  Page<ChukuxinxiView> page =new Query<ChukuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChukuxinxiVO> selectListVO(Wrapper<ChukuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChukuxinxiVO selectVO(Wrapper<ChukuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChukuxinxiView> selectListView(Wrapper<ChukuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChukuxinxiView selectView(Wrapper<ChukuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
