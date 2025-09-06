package com.tattooservice.persistence.repository.jpa;

import com.tattooservice.persistence.dto.BookingsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<BookingsDTO, String> {

}
