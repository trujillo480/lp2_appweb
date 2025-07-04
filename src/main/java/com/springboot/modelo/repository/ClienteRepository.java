package com.springboot.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.modelo.entitys.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
