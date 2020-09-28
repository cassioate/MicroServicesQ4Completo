package br.com.tessaro.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tessaro.micro.model.StaffType;

public interface StaffTypeRepository extends JpaRepository<StaffType, Integer>{

}
