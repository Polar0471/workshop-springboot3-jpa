package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

// Responsável por salvar os dados
// apenas isso irá instanciar um objeto repository que terá várias operações para se trabalhar com usuário
public interface UserRepository extends JpaRepository<User, Long> {

    

} 
