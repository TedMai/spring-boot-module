package cn.merryyou.boot.dao;

import cn.merryyou.boot.Member;
import cn.merryyou.boot.dao.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created on 2016/12/14 0014.
 *
 * @author zlf
 * @since 1.0
 */
@Component
public class DaoMember implements IDaoMember {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Member findMemberByUid(Long uid) throws Exception {
        return memberMapper.findMemberByUid(uid);
    }

    @Override
    public Member findMemberByMemberId(Integer memberId) throws Exception {
        return memberMapper.findMemberByMemberId(memberId);
    }
}
