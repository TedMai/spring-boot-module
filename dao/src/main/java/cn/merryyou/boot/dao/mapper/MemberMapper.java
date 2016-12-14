package cn.merryyou.boot.dao.mapper;

import cn.merryyou.boot.Member;
import org.apache.ibatis.annotations.Param;

/**
 * Created on 2016/12/14 0014.
 *
 * @author zlf
 * @since 1.0
 */
public interface MemberMapper {

    Member findMemberByUid(@Param("uid") Long uid) throws Exception;

    Member findMemberByMemberId(@Param("employee_id") Integer memberId) throws Exception;
}
