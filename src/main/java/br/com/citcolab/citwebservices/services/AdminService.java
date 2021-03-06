package br.com.citcolab.citwebservices.services;

import br.com.citcolab.citwebservices.model.dto.CredentialsDTO;
import br.com.citcolab.citwebservices.model.dto.RegisterPointDTO;
import br.com.citcolab.citwebservices.model.entity.Administrator;
import br.com.citcolab.citwebservices.model.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    Administrator auth(CredentialsDTO credentialsDTO);
    void registerPoint(RegisterPointDTO registerPointDTO);
    ResponseEntity createUser(UserEntity userEntity);
    ResponseEntity createAdmin(Administrator admin);
}
