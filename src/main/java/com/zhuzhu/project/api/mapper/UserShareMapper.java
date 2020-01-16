package com.zhuzhu.project.api.mapper;

import com.zhuzhu.project.api.model.Criteria;
import com.zhuzhu.project.api.model.UserShare;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserShareMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByParams(Criteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByParams(Criteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer uuid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(UserShare record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(UserShare record);

    /**
     * 根据条件查询记录集
     */
    List<UserShare> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    UserShare selectByPrimaryKey(Integer uuid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") UserShare record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") UserShare record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(UserShare record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(UserShare record);
}