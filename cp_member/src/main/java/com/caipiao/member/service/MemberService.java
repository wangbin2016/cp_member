package com.caipiao.member.service;

import com.caipiao.member.entity.Member;

public interface MemberService {
	public void addMember(Member member);

	public Member getMember(String account, String password);
}
