package com.corhuila.backend_sis_dis_2025_a.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.corhuila.backend_sis_dis_2025_a.Entity.Company;

public interface ICompanyRepository  extends JpaRepository<Company, Long> {

}
