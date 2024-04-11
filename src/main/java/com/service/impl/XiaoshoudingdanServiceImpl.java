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


import com.dao.XiaoshoudingdanDao;
import com.entity.XiaoshoudingdanEntity;
import com.service.XiaoshoudingdanService;
import com.entity.vo.XiaoshoudingdanVO;
import com.entity.view.XiaoshoudingdanView;

@Service("xiaoshoudingdanService")
public class XiaoshoudingdanServiceImpl extends ServiceImpl<XiaoshoudingdanDao, XiaoshoudingdanEntity> implements XiaoshoudingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshoudingdanEntity> page = this.selectPage(
                new Query<XiaoshoudingdanEntity>(params).getPage(),
                new EntityWrapper<XiaoshoudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshoudingdanEntity> wrapper) {
		  Page<XiaoshoudingdanView> page =new Query<XiaoshoudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoshoudingdanVO> selectListVO(Wrapper<XiaoshoudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoshoudingdanVO selectVO(Wrapper<XiaoshoudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoshoudingdanView> selectListView(Wrapper<XiaoshoudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshoudingdanView selectView(Wrapper<XiaoshoudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
