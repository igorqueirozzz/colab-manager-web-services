package br.com.citcolab.citwebservices.model.repository;

import br.com.citcolab.citwebservices.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    boolean existsByEmail(String email);

    boolean existsByCpf(String cpf);

    boolean existsByEmployerId(Long employerId);

    UserEntity findByCpf(String cpf);
}
