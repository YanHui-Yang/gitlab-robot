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
public class Commit implements Serializable {

    @JsonProperty("id")
    private String id;

    @JsonProperty("message")
    private String message;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("url")
    private String url;

    @JsonProperty("author")
    private Author author;

    @JsonProperty("added")
    private List<String> addedList;

    @JsonProperty("modified")
    private List<String> modifiedList;

    @JsonProperty("removed")
    private List<String> removedList;
}
