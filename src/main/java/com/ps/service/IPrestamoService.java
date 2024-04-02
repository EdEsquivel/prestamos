package com.ps.service;

import com.ps.model.Cliente;
import com.ps.model.Prestamo;

import java.util.List;

public interface IPrestamoService {

    Prestamo getPrestamoById(Long id);

    Prestamo createPrestamo(Prestamo prestamo);

    Prestamo updatePrestamo(Prestamo prestamo);

    void deletePrestamo(Long id);

}
