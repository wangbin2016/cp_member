package com.caipiao.member.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.caipiao.member.entity.Member;

public interface MemberMapper {
	
    int insert(Member record);

    int insertSelective(Member record);
    
    @Select("<script> select * from Member where account=#{account} <if test='password != null'> and password=#{password} </if></script>")
    Member findMemberByLogin(@Param("account")  String account,@Param("password") String password);
}