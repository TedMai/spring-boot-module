package cn.merryyou.boot.service;

import cn.merryyou.boot.Member;
import cn.merryyou.boot.dao.IDaoMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 2016/12/14 0014.
 *
 * @author zlf
 * @since 1.0
 */
@Service
public class MemberService implements IMemberService {

    @Autowired
    private IDaoMember daoMember;

    @Override
    public Member findMemberByUid(Long uid) throws Exception {
        return daoMember.findMemberByUid(uid);
    }

    @Override
    public Member findMemberByMemberId(Integer memberId) throws Exception {
        return daoMember.findMemberByMemberId(memberId);
    }
}
