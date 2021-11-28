package com.dg.controller;

import com.dg.domain.GitPush;
import com.dg.response.wework.Markdown;
import com.dg.response.wework.WeworkResponse;
import com.dg.service.RobotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/robot")
public class RobotController {

    @Autowired
    private RobotService robotService;

    @PostMapping("/push/{wework}")
    public WeworkResponse push(@RequestBody GitPush pojo, @PathVariable String wework) {
        StringBuilder sb = new StringBuilder();
        sb.append("<font color='info'>**Commit Message**</font>\n")
                .append("> **User Name: **").append("<font color='comment'>").append(pojo.getUserName()).append("</font>").append("\n")
                .append("> **Project Name: **").append("<font color='comment'>").append(pojo.getProject().getName()).append("</font>").append("\n")
                .append("> **Project URL: **").append("<font color='comment'>").append(pojo.getProject().getWebUrl()).append("</font>").append("\n")
                .append("> **Commit Ref: **").append("<font color='comment'>").append(pojo.getProject().getDefaultBranch()).append("</font>").append("\n")
                .append("> **SHA: **").append("<font color='comment'>").append(pojo.getCheckoutSha()).append("</font>").append("\n");

        pojo.getCommitList().forEach(commit -> {
            sb.append("> **Commit Message: **").append("<font color='comment'>").append(commit.getMessage()).append("</font>");
        });

        Markdown markdown = new Markdown();
        markdown.setContent(sb.toString());

        WeworkResponse weworkResponse = new WeworkResponse();
        weworkResponse.setMsgtype("markdown");
        weworkResponse.setMarkdown(markdown);

        robotService.sendMessage(weworkResponse.toString(), wework);

        return weworkResponse;
    }
}
