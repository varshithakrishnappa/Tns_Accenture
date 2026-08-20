package com.example.Placementmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Placementmanagement.entity.Adminentity;
import com.example.Placementmanagement.repository.AdminRepository;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    // CREATE
    public Adminentity createAdmin(Adminentity admin) {
        return adminRepository.save(admin);
    }

    // READ ALL
    public List<Adminentity> getAllAdmins() {
        return adminRepository.findAll();
    }

    // READ ONE
    public Adminentity getAdminById(int id) {
        return adminRepository.findById(id).orElse(null);
    }

    // UPDATE
    public Adminentity updateAdmin(int id, Adminentity admin) {

        Adminentity existingAdmin =
                adminRepository.findById(id).orElse(null);

        if (existingAdmin != null) {

            existingAdmin.setName(admin.getName());
            existingAdmin.setEmail(admin.getEmail());
            existingAdmin.setPrice(admin.getPrice());

            return adminRepository.save(existingAdmin);
        }

        return null;
    }

    // DELETE
    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
}