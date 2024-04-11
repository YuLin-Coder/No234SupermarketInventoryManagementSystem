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


import com.dao.ChengyunshangDao;
import com.entity.ChengyunshangEntity;
import com.service.ChengyunshangService;
import com.entity.vo.ChengyunshangVO;
import com.entity.view.ChengyunshangView;

@Service("chengyunshangService")
public class ChengyunshangServiceImpl extends ServiceImpl<ChengyunshangDao, ChengyunshangEntity> implements ChengyunshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengyunshangEntity> page = this.selectPage(
                new Query<ChengyunshangEntity>(params).getPage(),
                new EntityWrapper<ChengyunshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengyunshangEntity> wrapper) {
		  Page<ChengyunshangView> page =new Query<ChengyunshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengyunshangVO> selectListVO(Wrapper<ChengyunshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengyunshangVO selectVO(Wrapper<ChengyunshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengyunshangView> selectListView(Wrapper<ChengyunshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengyunshangView selectView(Wrapper<ChengyunshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
