package br.com.tessaro.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tessaro.micro.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer>{

}
