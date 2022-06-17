package cl.escuelainformatica.junio17.controlador;

import cl.escuelainformatica.junio17.servicio.LibroServicio;
import cl.escuelainformatica.junio17.modelo.Libro;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libro") // http://localhost:8080/libro
public class LibroController {

    // GetMapping espera el verbo get.

    //@GetMapping("/obtener") // http://localhost:8080/libro/obtener
    @PostMapping("/obtener")
    public Libro obtener(@RequestBody Libro libro) {
        LibroServicio serv=new LibroServicio();
        return serv.obtener(libro);
    }

}
