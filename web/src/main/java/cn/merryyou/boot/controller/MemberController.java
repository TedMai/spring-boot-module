package cn.merryyou.boot.controller;

import cn.merryyou.boot.Member;
import cn.merryyou.boot.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2016/12/14 0014.
 *
 * @author zlf
 * @since 1.0
 */
@RestController
public class MemberController {
    @Autowired
    private IMemberService memberService;

    @RequestMapping("/member/{memberId}")
    Member findMemberByMemberId(@PathVariable("memberId") Integer memberId) throws Exception {
        return memberService.findMemberByMemberId(memberId);
    }
}
