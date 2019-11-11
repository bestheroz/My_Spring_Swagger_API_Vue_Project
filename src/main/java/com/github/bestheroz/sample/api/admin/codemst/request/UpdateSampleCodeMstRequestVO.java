package com.github.bestheroz.sample.api.admin.codemst.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class UpdateSampleCodeMstRequestVO {
    @NotEmpty
    @ApiModelProperty(value = "그룹 코드 명", required = true)
    private String groupCodeName;
    @ApiModelProperty(value = "비고")
    private String remark1;
}
