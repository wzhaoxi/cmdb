package com.zhe800.dao;

import com.zhe800.model.Server;
import com.zhe800.model.ServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerMapper {
    int countByExample(ServerExample example);

    int deleteByExample(ServerExample example);

    int insert(Server record);

    int insertSelective(Server record);

    List<Server> selectByExample(ServerExample example);

    int updateByExampleSelective(@Param("record") Server record, @Param("example") ServerExample example);

    int updateByExample(@Param("record") Server record, @Param("example") ServerExample example);
}