package com.example.ProjectAWSStoresStoreDelete.service;

import com.example.ProjectAWSStoresStoreDelete.model.Almacen;
import com.example.ProjectAWSStoresStoreDelete.repository.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlmacenService {

    @Autowired
    private AlmacenRepository almacenRepository;

    public void eliminarAlmacen(Long id) {
        Almacen almacen = almacenRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Almacén no encontrado con ID: " + id));
        almacenRepository.delete(almacen);
    }
}
