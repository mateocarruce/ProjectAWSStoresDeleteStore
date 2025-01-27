package com.example.ProjectAWSStoresStoreDelete.repository;

import com.example.ProjectAWSStoresStoreDelete.model.Almacen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Long> {
}
