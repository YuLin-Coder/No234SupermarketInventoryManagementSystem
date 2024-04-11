package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShangpinleibieEntity;
import com.entity.view.ShangpinleibieView;

import com.service.ShangpinleibieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 商品类别
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-13 14:00:29
 */
@RestController
@RequestMapping("/shangpinleibie")
public class ShangpinleibieController {
    @Autowired
    private ShangpinleibieService shangpinleibieService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangpinleibieEntity shangpinleibie,
		HttpServletRequest request){
        EntityWrapper<ShangpinleibieEntity> ew = new EntityWrapper<ShangpinleibieEntity>();
		PageUtils page = shangpinleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinleibie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangpinleibieEntity shangpinleibie, 
		HttpServletRequest request){
        EntityWrapper<ShangpinleibieEntity> ew = new EntityWrapper<ShangpinleibieEntity>();
		PageUtils page = shangpinleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinleibie), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangpinleibieEntity shangpinleibie){
       	EntityWrapper<ShangpinleibieEntity> ew = new EntityWrapper<ShangpinleibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangpinleibie, "shangpinleibie")); 
        return R.ok().put("data", shangpinleibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangpinleibieEntity shangpinleibie){
        EntityWrapper< ShangpinleibieEntity> ew = new EntityWrapper< ShangpinleibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangpinleibie, "shangpinleibie")); 
		ShangpinleibieView shangpinleibieView =  shangpinleibieService.selectView(ew);
		return R.ok("查询商品类别成功").put("data", shangpinleibieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangpinleibieEntity shangpinleibie = shangpinleibieService.selectById(id);
        return R.ok().put("data", shangpinleibie);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangpinleibieEntity shangpinleibie = shangpinleibieService.selectById(id);
        return R.ok().put("data", shangpinleibie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangpinleibieEntity shangpinleibie, HttpServletRequest request){
    	shangpinleibie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinleibie);
        shangpinleibieService.insert(shangpinleibie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangpinleibieEntity shangpinleibie, HttpServletRequest request){
    	shangpinleibie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinleibie);
        shangpinleibieService.insert(shangpinleibie);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShangpinleibieEntity shangpinleibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangpinleibie);
        shangpinleibieService.updateById(shangpinleibie);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangpinleibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShangpinleibieEntity> wrapper = new EntityWrapper<ShangpinleibieEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shangpinleibieService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
