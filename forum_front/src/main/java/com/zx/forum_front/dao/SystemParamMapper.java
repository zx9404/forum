package com.zx.forum_front.dao;

import com.zx.forum_front.entity.SystemParamDO;
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
    /**
     * 查询需要预热的系统参数
     *
     * @return
     */
    public List<SystemParamDO> selectSystemParamsNeedCached();

    /**
     * 新增系统参数
     *
     * @param paramCode    参数代码
     * @param paramValue   参数值
     * @param paramDesc    参数描述
     * @param paramPrepare 参数是否需要预热
     * @return
     */
    public int insertSystemParam(@Param("paramCode") String paramCode, @Param("paramValue") String paramValue,
                                 @Param("paramDesc") String paramDesc, @Param("paramPrepare") String paramPrepare);

    /**
     * 修改系统参数
     *
     * @param paramCode    参数代码
     * @param paramValue   参数值
     * @param paramDesc    参数描述
     * @param paramPrepare 参数是否需要预热
     * @return
     */
    public int updateSystemParam(@Param("paramCode") String paramCode, @Param("paramValue") String paramValue,
                                 @Param("paramDesc") String paramDesc, @Param("paramPrepare") String paramPrepare);

    /**
     * 删除系统参数
     *
     * @param paramCodes 参数代码(可批量，通过','分隔)
     * @return
     */
    public int deleteSystemParam(@Param("paramCodes") String paramCodes);
}
