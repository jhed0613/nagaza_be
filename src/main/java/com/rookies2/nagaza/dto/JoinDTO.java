package com.rookies2.nagaza.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JoinDTO {

    private String username;
    private String password;
    private String email;
    private String nickname;
}