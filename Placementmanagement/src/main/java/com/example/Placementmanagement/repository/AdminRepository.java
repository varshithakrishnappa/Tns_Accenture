package com.example.Placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Placementmanagement.entity.Adminentity;

public interface AdminRepository extends JpaRepository<Adminentity, Integer> {

}