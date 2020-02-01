package com.zjf.user.mapper;

import com.zjf.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zjf
 * @create 2020/2/1-9:27
 */

public interface UserMapper {
    List<UmsMember> selectAllUser();
}
