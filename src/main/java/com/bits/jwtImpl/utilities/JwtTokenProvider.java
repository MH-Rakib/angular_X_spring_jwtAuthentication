package com.bits.jwtImpl.utilities;

import com.auth0.jwt.JWT;
import com.bits.jwtImpl.principal.UserPrincipal;
import com.bits.jwtImpl.securityConstrains.SecurityConstrains;
import org.springframework.beans.factory.annotation.Value;

public class JwtTokenProvider {

    @Value("jwt.secret")
    private String secret;

    public String generateJwtToken(UserPrincipal userPrincipal){
        String[] claims = getClaimsFromUser(userPrincipal);

//        return JWT.create()
//                .withIssuer(SecurityConstrains.BITS_LLC)
//                .withAudience(SecurityConstrains.BITS_ADMINISTRATION)

        return null;
    }

    public String[] getClaimsFromUser(UserPrincipal userPrincipal){
        return null;
    }

}
