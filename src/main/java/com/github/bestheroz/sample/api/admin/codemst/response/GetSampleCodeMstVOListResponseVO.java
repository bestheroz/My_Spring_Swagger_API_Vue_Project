package com.github.bestheroz.sample.api.admin.codemst.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GetSampleCodeMstVOListResponseVO {
    @ApiModelProperty(value = "그룹 코드")
    private String groupCode;
    @ApiModelProperty(value = "그룹 코드 명")
    private String groupCodeName;
    @ApiModelProperty(value = "비고")
    private String remark1;
}
