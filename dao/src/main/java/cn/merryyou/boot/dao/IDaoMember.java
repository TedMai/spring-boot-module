package cn.merryyou.boot.dao;

import cn.merryyou.boot.Member;

/**
 * Created on 2016/12/14 0014.
 *
 * @author zlf
 * @since 1.0
 */
public interface IDaoMember {

    Member findMemberByUid(Long uid) throws Exception;

    Member findMemberByMemberId(Integer memberId) throws Exception;
}
