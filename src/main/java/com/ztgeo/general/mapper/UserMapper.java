package com.ztgeo.general.mapper;
import com.github.wxiaoqi.security.common.mapper.CommonMapper;
import com.ztgeo.general.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends CommonMapper<User> {
     List<User> selectMemberByGroupId(@Param("groupId") String groupId);
     List<User> selectLeaderByGroupId(@Param("groupId") String groupId);
    List<String> selectUserDataDepartIds(String userId);
}
