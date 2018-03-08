package com.caipiao.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caipiao.member.dao.MemberMapper;
import com.caipiao.member.entity.Member;
import com.caipiao.member.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public void addMember(Member member) {
		memberMapper.insert(member);
	}

	@Override
	public Member getMember(String account, String password) {
		return memberMapper.findMemberByLogin(account, password);
	}

}
