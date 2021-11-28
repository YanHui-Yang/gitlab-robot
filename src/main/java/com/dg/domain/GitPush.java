package com.dg.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GitPush implements Serializable {

    @JsonProperty("object_kind")
    private String objectKind;

    @JsonProperty("event_name")
    private String eventName;

    @JsonProperty("before")
    private String before;

    @JsonProperty("after")
    private String after;

    @JsonProperty("ref")
    private String ref;

    @JsonProperty("checkout_sha")
    private String checkoutSha;

    @JsonProperty("message")
    private String message;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("user_username")
    private String userUsername;

    @JsonProperty("user_email")
    private String userEmail;

    @JsonProperty("user_avatar")
    private String userAvatar;

    @JsonProperty("project")
    private Project project;

    @JsonProperty("commits")
    private List<Commit> commitList;

    @JsonProperty("total_commits_count")
    private String totalCommitsCount;

    @JsonProperty("repository")
    private Repository repository;
}
