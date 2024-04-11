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


import com.dao.CaigouxinxiDao;
import com.entity.CaigouxinxiEntity;
import com.service.CaigouxinxiService;
import com.entity.vo.CaigouxinxiVO;
import com.entity.view.CaigouxinxiView;

@Service("caigouxinxiService")
public class CaigouxinxiServiceImpl extends ServiceImpl<CaigouxinxiDao, CaigouxinxiEntity> implements CaigouxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaigouxinxiEntity> page = this.selectPage(
                new Query<CaigouxinxiEntity>(params).getPage(),
                new EntityWrapper<CaigouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaigouxinxiEntity> wrapper) {
		  Page<CaigouxinxiView> page =new Query<CaigouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaigouxinxiVO> selectListVO(Wrapper<CaigouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaigouxinxiVO selectVO(Wrapper<CaigouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaigouxinxiView> selectListView(Wrapper<CaigouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaigouxinxiView selectView(Wrapper<CaigouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
