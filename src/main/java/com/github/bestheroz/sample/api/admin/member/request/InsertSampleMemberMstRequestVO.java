package com.github.bestheroz.sample.api.admin.member.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.joda.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class InsertSampleMemberMstRequestVO {
    @NotEmpty
    @ApiModelProperty(value = "회원 아이디", required = true)
    private String memberId;
    @NotEmpty
    @ApiModelProperty(value = "회원 비밀번호", required = true)
    private String memberPw;
    @NotEmpty
    @ApiModelProperty(value = "회원 명", required = true)
    private String memberName;
    @NotEmpty
    @ApiModelProperty(value = "회원 타입", required = true)
    private String memberType;
    @ApiModelProperty(value = "로그인 실패 건수")
    private Integer loginFailCnt;
    @ApiModelProperty(value = "계정 잠김 여부")
    private Boolean closeTf;
    @ApiModelProperty(value = "계정 만료 일시")
    private LocalDateTime expired;
}
