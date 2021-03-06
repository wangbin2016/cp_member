package com.caipiao.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caipiao.common.utils.MD5;
import com.caipiao.member.dao.MemberMapper;
import com.caipiao.member.entity.Member;
import com.caipiao.member.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	@Autowired 
	private MemberMapper memberMapper;
	public void addMember(Member member) {
		String passwrod = MD5.sign(member.getPassword());
		member.setPassword(passwrod);
		memberMapper.insert(member);
	}
	public void regist(Member member) {
		String passwrod = MD5.sign(member.getPassword());
		member.setPassword(passwrod);
		memberMapper.insert(member);
	}
	public Member getMember(String account, String password) {
		password = MD5.sign(password);
		return memberMapper.findMemberByLogin(account, password);
	}
}
