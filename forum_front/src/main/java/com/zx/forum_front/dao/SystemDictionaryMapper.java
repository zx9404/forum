package com.zx.forum_front.dao;

import com.zx.forum_front.entity.SystemDictionaryDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统字典
 *
 * @author zhangxiang
 * @date 2020/4/25 15:45
 * @content
 **/
@Mapper
public interface SystemDictionaryMapper {
    /**
     * 根据字典类型查询字典内容
     * @param dictionaryType  字典类型
     * @return
     */
    public List<SystemDictionaryDO> listDictionary(@Param("dictionaryType") String dictionaryType);
}
