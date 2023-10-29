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


import com.dao.ZiliaoleixingDao;
import com.entity.ZiliaoleixingEntity;
import com.service.ZiliaoleixingService;
import com.entity.vo.ZiliaoleixingVO;
import com.entity.view.ZiliaoleixingView;

@Service("ziliaoleixingService")
public class ZiliaoleixingServiceImpl extends ServiceImpl<ZiliaoleixingDao, ZiliaoleixingEntity> implements ZiliaoleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiliaoleixingEntity> page = this.selectPage(
                new Query<ZiliaoleixingEntity>(params).getPage(),
                new EntityWrapper<ZiliaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiliaoleixingEntity> wrapper) {
		  Page<ZiliaoleixingView> page =new Query<ZiliaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiliaoleixingVO> selectListVO(Wrapper<ZiliaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiliaoleixingVO selectVO(Wrapper<ZiliaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiliaoleixingView> selectListView(Wrapper<ZiliaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiliaoleixingView selectView(Wrapper<ZiliaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
