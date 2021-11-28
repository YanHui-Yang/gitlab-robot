package com.dg.response.wework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 企业微信响应格式
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeworkResponse {

    private String msgtype;

    private Markdown markdown;

    @Override
    public String toString() {
        return "{" +
                "\"msgtype\": \"" + msgtype + "\",\n" +
                "\"markdown\" : {" + markdown +
                "}}";
    }
}
