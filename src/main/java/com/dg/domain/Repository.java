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
public class Repository implements Serializable {

    @JsonProperty("name")
    private String name;

    @JsonProperty
    private String url;

    @JsonProperty("description")
    private String description;

    @JsonProperty("homepage")
    private String homepage;

    @JsonProperty("git_http_url")
    private String gitHttpUrl;

    @JsonProperty("git_ssh_url")
    private String gitSshUrl;
}
