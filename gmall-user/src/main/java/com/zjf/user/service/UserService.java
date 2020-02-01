package com.zjf.user.service;

import com.zjf.user.bean.UmsMember;
import com.zjf.user.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zjf
 * @create 2020/2/1-9:24
 */

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
