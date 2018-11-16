package com.web.site.dao.member;

import com.web.site.entity.member.MemberExample;
import java.util.List;
import com.web.site.dao.BaseMapper;
import com.web.site.entity.member.Member;

public interface MemberMapper extends BaseMapper<Member, MemberExample> {

	Member selectByMobile(String mobile);


}