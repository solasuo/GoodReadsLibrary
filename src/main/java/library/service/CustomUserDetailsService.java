package library.service;

import java.util.List;
import java.util.Optional;
import library.entity.User;
import library.repository.UserRepository;
import library.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    
    @Autowired
    private UserRepository userRepo;
        
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }        
        return new CustomUserDetails(user);        
    }
    
    public List findAll() {
        var listUsers = (List<User>) userRepo.findAll();
        return listUsers;
    }    
}
