package com.programmers.heavenpay.member.converter;

import com.programmers.heavenpay.member.dto.response.MemberCreateResponse;
import com.programmers.heavenpay.member.dto.response.MemberDeleteResponse;
import com.programmers.heavenpay.member.dto.response.MemberFindResponse;
import com.programmers.heavenpay.member.dto.response.MemberUpdateResponse;
import com.programmers.heavenpay.member.entity.Member;
import com.programmers.heavenpay.member.entity.vo.GenderType;
import org.springframework.stereotype.Component;

@Component
public class MemberConverter {
    public Member toMemberEntity(String email, String name, String phoneNumber, String birth, String gender) {
        return Member.builder()
                .email(email)
                .name(name)
                .phoneNumber(phoneNumber)
                .birth(birth)
                .gender(GenderType.of(gender))
                .build();
    }

    public MemberFindResponse toMemberFindDResponse(Member member) {
        return MemberFindResponse.builder()
                .id(member.getId())
                .email(member.getEmail())
                .name(member.getName())
                .phoneNumber(member.getPhoneNumber())
                .birth(member.getBirth())
                .gender(member.getGender())
                .build();
    }

    public MemberCreateResponse toMemberCreateResponse(Long id) {
        return MemberCreateResponse.builder()
                .id(id)
                .build();
    }

    public MemberUpdateResponse toMemberUpdateResponse(Member member) {
        return MemberUpdateResponse.builder()
                .id(member.getId())
                .email(member.getEmail())
                .name(member.getName())
                .phoneNumber(member.getPhoneNumber())
                .birth(member.getBirth())
                .gender(member.getGender())
                .build();
    }

    public MemberDeleteResponse toMemberDeleteResponse(Member member) {
        return MemberDeleteResponse.builder()
                .id(member.getId())
                .email(member.getEmail())
                .name(member.getName())
                .phoneNumber(member.getPhoneNumber())
                .birth(member.getBirth())
                .gender(member.getGender())
                .build();
    }
}
