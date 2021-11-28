package com.dg.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Project implements Serializable {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("web_url")
    private String webUrl;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("git_ssh_url")
    private String gitSshUrl;

    @JsonProperty("git_http_url")
    private String gitHttpUrl;

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("visibility_level")
    private String visibilityLevel;

    @JsonProperty("path_with_namespace")
    private String pathWithNamespace;

    @JsonProperty("default_branch")
    private String defaultBranch;

    @JsonProperty("ci_config_path")
    private String ciConfigPath;

    @JsonProperty("homepage")
    private String homepage;

    @JsonProperty("url")
    private String url;

    @JsonProperty("ssh_url")
    private String sshUrl;

    @JsonProperty("http_url")
    private String httpUrl;
}
