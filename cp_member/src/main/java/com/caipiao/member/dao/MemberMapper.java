package com.caipiao.member.dao;

import org.apache.ibatis.annotations.Select;

import com.caipiao.member.entity.Member;

public interface MemberMapper {
	
    int insert(Member record);

    int insertSelective(Member record);
    
    @Select("select * from Member where account=#{arg0} and password=#{arg1}")
    Member findMemberByLogin(String account,String password);
}