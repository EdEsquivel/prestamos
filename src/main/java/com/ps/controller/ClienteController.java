package com.ps.controller;

import com.ps.model.Cliente;
import com.ps.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController // Decir que esta clase es administrada o controlada por SPRING (Framework)
@RequestMapping("/clientes") // Agregar una ruta para mi clase (/clientes)
public class ClienteController {

    //ResponseEntity nos sirven para dar respuestas a peticiones HTTP con estados del tipo (200 - 404 - 500)

    private final IClienteService iClienteService;

    /*@GetMapping
    public List<Cliente> getAllClientes(){
        return null;
    }*/

    @GetMapping()
    public ResponseEntity<List<Cliente>> getClienteByName(@RequestParam String nombre) {
        List<Cliente> cliente = iClienteService.getClienteByName(nombre);
        return ResponseEntity.ok(cliente);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        Cliente cliente = iClienteService.getClienteById(id);
        return ResponseEntity.ok(cliente);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente createdCliente = iClienteService.createCliente(cliente);
        return new ResponseEntity<>(createdCliente, HttpStatus.CREATED);
    }


    @PutMapping
    public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente) {
        Cliente updatedCliente = iClienteService.updateCliente(cliente);
        return ResponseEntity.ok(updatedCliente);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        iClienteService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }

}
