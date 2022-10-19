package hello.core.member;

// 구현체가 하나만 있을 때는 인터페이스Impl 형태로 만들어 사용한다 (관례)
public class MemberServiceImpl implements MemberService {

    // 인터페이스 의존, 구현체 의존 DI 를 잘 지키고 있지 못하다 
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
