package main.java.com.example.ProjectAWSStoresStoreDelete.controller;

import com.example.eliminaralmacen.service.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/almacenes")
public class AlmacenController {

    @Autowired
    private AlmacenService almacenService;

    @DeleteMapping("/{id}")
    public String eliminarAlmacen(@PathVariable Long id) {
        almacenService.eliminarAlmacen(id);
        // Aquí puedes hacer una llamada REST al otro microservicio
        return "Almacén eliminado con ID: " + id;
    }
}
