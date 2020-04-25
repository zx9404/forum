package com.zx.forum_front.entity;

import lombok.Data;

/**
 * 系统字典
 *
 * @author zhangxiang
 * @date 2020/4/25 15:29
 * @content
 **/
@Data
public class SystemDictionaryDO {
    /**
     * 字典类型
     */
    private String dictionaryType;

    /**
     * 字典值
     */
    private String dictionaryValue;

    /**
     * 字典描述
     */
    private String dictionaryDescribe;
}
