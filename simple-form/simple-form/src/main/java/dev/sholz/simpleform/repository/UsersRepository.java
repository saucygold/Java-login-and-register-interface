package dev.sholz.simpleform.repository;

import dev.sholz.simpleform.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel, Integer > {

Optional<UsersModel> findByLoginAndPassword(String Login, String Password);

Optional<UsersModel> findFirstByLogin(String login);

}
