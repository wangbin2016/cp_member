package com.caipiao.member.entity;

import java.util.Date;

import lombok.Data;
@Data
public class Member {

    private String id;

    private String account;

    private String nickname;

    private String password;

    private Date createTime;

    private Integer status;

    private String email;

    private String mobile;

	@Override
	public String toString() {
		return "Member [id=" + id + ", account=" + account + ", nickname=" + nickname + ", password=" + password
				+ ", createTime=" + createTime + ", status=" + status + ", email=" + email + ", mobile=" + mobile + "]";
	}
    

}