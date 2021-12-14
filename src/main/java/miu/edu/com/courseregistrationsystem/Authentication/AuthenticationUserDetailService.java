package miu.edu.com.courseregistrationsystem.Authentication;

import lombok.RequiredArgsConstructor;
import miu.edu.com.studentregistrationsystem.domain.Person;
import miu.edu.com.studentregistrationsystem.service.Implementation.PersonServiceImpl;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
@RequiredArgsConstructor
public class AuthenticationUserDetailService implements UserDetailsService {
    private final PersonServiceImpl personService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = personService.findByUsername(username);
        System.out.println("username"+username);
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(person.getRole().toString()));
        return new User(person.getUsername(), person.getPassword(), authorities);
    }
}
