package ru.kata.spring.boot_security.demo.DAO;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.Role;


@Repository
@Transactional
public interface RoleDAO extends JpaRepository<Role, Long> {
}