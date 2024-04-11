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


import com.dao.GongyingshangDao;
import com.entity.GongyingshangEntity;
import com.service.GongyingshangService;
import com.entity.vo.GongyingshangVO;
import com.entity.view.GongyingshangView;

@Service("gongyingshangService")
public class GongyingshangServiceImpl extends ServiceImpl<GongyingshangDao, GongyingshangEntity> implements GongyingshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyingshangEntity> page = this.selectPage(
                new Query<GongyingshangEntity>(params).getPage(),
                new EntityWrapper<GongyingshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyingshangEntity> wrapper) {
		  Page<GongyingshangView> page =new Query<GongyingshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyingshangVO> selectListVO(Wrapper<GongyingshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyingshangVO selectVO(Wrapper<GongyingshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyingshangView> selectListView(Wrapper<GongyingshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyingshangView selectView(Wrapper<GongyingshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
