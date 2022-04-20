package com.azlir.forgot_password.repository;

import com.azlir.forgot_password.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {}
