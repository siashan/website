package com.web.site.service.member;

import com.web.site.entity.member.MemberExample;
import com.web.site.service.BaseService;
import com.web.site.dao.member.MemberMapper;
import com.web.site.entity.member.Member;
import com.web.site.common.util.PasswordUtil;
import jodd.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.web.site.common.support.keygen.MyKeyGenerator;
import com.web.site.common.support.validator.constraints.IsMobile;
import com.web.site.common.support.validator.constraints.IsPassword;
import org.springframework.stereotype.Service;
import org.apache.commons.lang.RandomStringUtils;

/**
 * <p>
 * 会员 服务实现类
 * </p>
 *
 * @author Small
 * @since 2018-10-26
 */
@Service
public class MemberService extends BaseService<MemberMapper, Member, MemberExample> {

    public Member selectByMobile(String mobile) {
        return baseMapper.selectByMobile(mobile);
    }

    @Transactional
    public void register(String mobile, String passpword, String un) {
        Member member = new Member();
        member.setId(MyKeyGenerator.genKey());
        member.setMobile(mobile);
        String sa = PasswordUtil.generatorSalt();
        member.setSalt(sa);
        member.setPassword(PasswordUtil.encodePassword(passpword,sa));
        // 查询推荐人
        if(StringUtil.isNotBlank(un)){
            Member member1 = selectByMobile(un);
            member.setRecommendId(member1.getId());
        }
        insertSelective(member);
    }


    public Member checkLogin( String mobile,  String password) {
        Member member = selectByMobile(mobile);
        String newPwd = PasswordUtil.encodePassword(password, member.getSalt());
        if (!newPwd.equals(member.getPassword())){
            return null;
        }
        return member;
    }
}