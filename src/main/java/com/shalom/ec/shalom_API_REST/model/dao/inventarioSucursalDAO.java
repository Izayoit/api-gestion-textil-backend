package com.shalom.ec.shalom_API_REST.model.dao;

import com.shalom.ec.shalom_API_REST.model.entity.inventarioSucursal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

public interface inventarioSucursalDAO extends CrudRepository<inventarioSucursal,Integer> {
    @Query("SELECT i FROM inventarioSucursal i WHERE i.productoBase.id_productoBase = ?1")
    inventarioSucursal buscarPorIdProducto(Integer idProducto);
}
