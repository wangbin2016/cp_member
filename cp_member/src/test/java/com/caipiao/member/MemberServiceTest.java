package com.caipiao.member;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;
import com.caipiao.member.entity.Member;
import com.caipiao.member.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemberServiceTest {
	
	private MemberService memberService;
	
	@Before
	public void befor() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		memberService = (MemberService)ac.getBean("memberService");
		DruidDataSource dataSource = (DruidDataSource)ac.getBean("dataSource");
		System.out.println(dataSource.getUsername() +"   "+dataSource.getPassword());
		log.info("初始化配置");
	}
	
	//@Test
	public void exe() {
		Member member = new Member();
		member.setAccount("test");
		member.setCreateTime(new Date());
		member.setEmail("test@qq.com");
		member.setMobile("123456789");
		member.setNickname("哈哈");
		member.setPassword("test123");
		member.setStatus(1);
		memberService.addMember(member);
	}
	
	@Test
	public void find() {
		String account="test";
		String password="test123";
		Member member = memberService.getMember(account, password);
		System.out.println(member);
	}
	
	@After
	public void after() {
		log.info("测试完成");
	}
}
