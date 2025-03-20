package com.corhuila.backend_sis_dis_2025_a.DTO;

import java.sql.Date;

public interface PersonDTO {
    Long getId();

    String getFirstName();

    String getLastName();

    String getPhone();

    String getEmail();

    String getNumberDocumento();

    String getTypeDocument();

    Date getDateBirth();
    
}
