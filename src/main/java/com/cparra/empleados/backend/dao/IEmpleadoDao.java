package com.cparra.empleados.backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cparra.empleados.backend.model.Empleado;

public interface IEmpleadoDao extends MongoRepository<Empleado, String>{

}
