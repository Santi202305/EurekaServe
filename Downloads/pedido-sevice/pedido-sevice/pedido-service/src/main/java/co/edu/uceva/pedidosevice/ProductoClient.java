package co.edu.uceva.pedidosevice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "producto-service") // Nombre del servicio en Eureka
public interface ProductoClient {

    @GetMapping("/productos") // Endpoint del servicio de productos
    List<ProductoDTO> obtenerProductos();
}