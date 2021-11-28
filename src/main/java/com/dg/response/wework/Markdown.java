package com.dg.response.wework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Markdown implements Serializable {

    private String content;

    @Override
    public String toString() {
        /*StringBuilder sb = new StringBuilder();
        sb.append("\"").append("markdown").append("\": {\n")
                        .append("> ")*/
        return "\"content\": \"" + content + '\"';
    }
}
