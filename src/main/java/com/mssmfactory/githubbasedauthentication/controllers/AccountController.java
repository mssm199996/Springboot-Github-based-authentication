package com.mssmfactory.githubbasedauthentication.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class AccountController {

    @GetMapping()
    public String index() {
        return "Index !";
    }

    @GetMapping("account")
    public String findMyDetails(OAuth2AuthenticationToken token) {
        System.out.println("Visitor token: " + token.getPrincipal());
        return "Hello logged in visitor !";
    }
}
