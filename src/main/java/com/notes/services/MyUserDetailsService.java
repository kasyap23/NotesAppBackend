/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notes.services;

import com.notes.model.User;
import com.notes.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;

/**
 * @author Kasyap
 */
@Service
@RequiredArgsConstructor(onConstructor=@__(@Autowired))
public class MyUserDetailsService implements UserDetailsService {


    private UserRepository userRepository;

    @Override
    public MyUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.getUserByEmail(email);
        if (user == null)
            return null;
//         Set<GrantedAuthority> authorities = new HashSet<>();
//        authorities.add(new SimpleGrantedAuthority("user"));
        return new MyUserDetails(user);
    }


}
