package com.andremarcolino.webservice.repository;

import org.apache.catalina.realm.JNDIRealm.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<User, Long> {

}