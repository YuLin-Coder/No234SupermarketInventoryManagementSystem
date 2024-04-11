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


import com.dao.ShangpinleibieDao;
import com.entity.ShangpinleibieEntity;
import com.service.ShangpinleibieService;
import com.entity.vo.ShangpinleibieVO;
import com.entity.view.ShangpinleibieView;

@Service("shangpinleibieService")
public class ShangpinleibieServiceImpl extends ServiceImpl<ShangpinleibieDao, ShangpinleibieEntity> implements ShangpinleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinleibieEntity> page = this.selectPage(
                new Query<ShangpinleibieEntity>(params).getPage(),
                new EntityWrapper<ShangpinleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinleibieEntity> wrapper) {
		  Page<ShangpinleibieView> page =new Query<ShangpinleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinleibieVO> selectListVO(Wrapper<ShangpinleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinleibieVO selectVO(Wrapper<ShangpinleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinleibieView> selectListView(Wrapper<ShangpinleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinleibieView selectView(Wrapper<ShangpinleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
