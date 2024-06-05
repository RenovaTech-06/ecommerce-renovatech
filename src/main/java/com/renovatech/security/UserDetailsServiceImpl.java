package com.renovatech.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.renovatech.model.Cliente;
import com.renovatech.repository.ClienteRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	 @Autowired
	    private ClienteRepository clienteRepository;

	    @Override
	    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {

	        Optional<Cliente> cliente = clienteRepository.findByEmail(userEmail);

	        if (cliente.isPresent())
	            return new UserDetailsImpl(cliente.get());
	        else
	            throw new ResponseStatusException(HttpStatus.FORBIDDEN);
	    }

}
