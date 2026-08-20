package com.example.Placementmanagement.controler;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Placementmanagement.entity.Adminentity;
import com.example.Placementmanagement.service.AdminService;

@RestController
@RequestMapping("/admins")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    // CREATE
    @PostMapping
    public Adminentity createAdmin(@RequestBody Adminentity admin) {
        return adminService.createAdmin(admin);
    }

    // READ ALL
    @GetMapping
    public List<Adminentity> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Adminentity getAdminById(@PathVariable int id) {
        return adminService.getAdminById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Adminentity updateAdmin(
            @PathVariable int id,
            @RequestBody Adminentity admin) {

        return adminService.updateAdmin(id, admin);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteAdmin(@PathVariable int id) {
        adminService.deleteAdmin(id);
        return "Admin deleted successfully";
    }
}