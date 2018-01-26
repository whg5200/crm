package com.zking.orm.mapper;

import com.zking.orm.model.Chance;

public interface ChanceMapper {
    int deleteByPrimaryKey(Integer chcId);

    int insert(Chance record);

    int insertSelective(Chance record);

    Chance selectByPrimaryKey(Integer chcId);

    int updateByPrimaryKeySelective(Chance record);

    int updateByPrimaryKey(Chance record);
}