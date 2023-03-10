package com.project.lms.security.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TokenVO {
    private String grantType;
    private String accessToken;
    private String refreshToken;

    public TokenVO(String access){
        this.accessToken=access;
    }
}
