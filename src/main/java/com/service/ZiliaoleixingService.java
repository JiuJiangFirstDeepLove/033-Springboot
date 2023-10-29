package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiliaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiliaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiliaoleixingView;


/**
 * 资料类型
 *
 * @author 
 * @email 
 * @date 2023-02-26 22:02:58
 */
public interface ZiliaoleixingService extends IService<ZiliaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiliaoleixingVO> selectListVO(Wrapper<ZiliaoleixingEntity> wrapper);
   	
   	ZiliaoleixingVO selectVO(@Param("ew") Wrapper<ZiliaoleixingEntity> wrapper);
   	
   	List<ZiliaoleixingView> selectListView(Wrapper<ZiliaoleixingEntity> wrapper);
   	
   	ZiliaoleixingView selectView(@Param("ew") Wrapper<ZiliaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiliaoleixingEntity> wrapper);
   	
}

