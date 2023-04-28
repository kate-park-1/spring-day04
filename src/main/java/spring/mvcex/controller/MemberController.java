package spring.mvcex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvcex.domain.Member;
import spring.mvcex.repository.MemberRepository;
import spring.mvcex.repository.MemoryMemberRepository;

import java.util.List;

@Controller
public class MemberController {
  @RequestMapping("/members/addMember") // 회원가입 - 회원
  public String addMember(){
    return "members/addMember";
  }

//  @RequestMapping("/members/saveMember")
//  public String saveMember(){
//    return "members/save-member";
//  }

  @RequestMapping("/members/memberList") // 회원목록 - 관리자
  public String memberList(Model model){
    MemberRepository memberRepository = new MemoryMemberRepository();
    MemoryMemberRepository mmr = (MemoryMemberRepository)memberRepository;
    mmr.createMembers();
    List<Member> members = memberRepository.findAll();
    model.addAttribute("members", members);

    return "members/memberList";
  }

  @RequestMapping("/members/memberInfo") // 회원상세정보조회 - 관리자
    public String memberInfo(@RequestParam(value = "id") Long id,
                             Model model){
    MemberRepository memberRepository = new MemoryMemberRepository();
    Member findMember = memberRepository.findById(id);
    model.addAttribute("member", findMember);

    return "members/memberInfo";
  }
}
