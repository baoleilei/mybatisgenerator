package me.zhige.dao;

import me.zhige.domain.Warehouserproblem;

public interface WarehouserproblemMapper {
    int deleteByPrimaryKey(Integer problemid);

    int insert(Warehouserproblem record);

    int insertSelective(Warehouserproblem record);

    Warehouserproblem selectByPrimaryKey(Integer problemid);

    int updateByPrimaryKeySelective(Warehouserproblem record);

    int updateByPrimaryKey(Warehouserproblem record);
}