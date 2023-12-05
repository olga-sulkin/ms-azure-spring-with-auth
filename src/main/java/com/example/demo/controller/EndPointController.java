package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipal;

@RestController
public class EndPointController {
//    @GetMapping("Admin")
    @RequestMapping(value = "Admin", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @PreAuthorize("hasAuthority('APPROLE_Admin')")
//    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Object getUser(
//            PreAuthenticatedAuthenticationToken authToken,
                          AbstractAuthenticationToken token
    ) {
//        final Object current = authToken.getPrincipal();
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return token;
//        return "Admin";
    }
    // Client secret: 8bJ8Q~S_hDuhadcYVyaEl95ThPe8zAZ7keZAybiE
    // User name: test-user@olgasulkinoutlook.onmicrosoft.com
    // User pwd: Xuso5020
}
