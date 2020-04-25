package com.zx.forum_front.dao;

import com.zx.forum_front.entity.SystemParamEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhangxiang
 * @date 2020/4/18 22:41
 * @content
 **/
@Mapper
public interface SystemParamMapper {
    //查询需要预热的系统参数
    public List<SystemParamEntity> selectSystemParamsNeedCached();

    //新增系统参数
    public int insertSystemParam(@Param("paramCode") String paramCode, @Param("paramValue") String paramValue,
                                 @Param("paramDesc") String paramDesc, @Param("paramPrepare") String paramPrepare);

    //修改系统参数
    public int updateSystemParam(@Param("paramCode") String paramCode, @Param("paramValue") String paramValue,
                                 @Param("paramDesc") String paramDesc, @Param("paramPrepare") String paramPrepare);
}
