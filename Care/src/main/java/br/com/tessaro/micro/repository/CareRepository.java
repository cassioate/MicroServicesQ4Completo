package br.com.tessaro.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tessaro.micro.model.Care;

public interface CareRepository extends JpaRepository<Care, Integer>{

}
