package cl.escuelainformatica.junio17.controlador;

import cl.escuelainformatica.junio17.modelo.Libro;
import cl.escuelainformatica.junio17.servicio.LibroServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libro") // http://localhost:8080/libro
public class LibroController {

    @GetMapping("/obtener") // http://localhost:8080/libro/obtener
    public Libro obtener(Libro libro) {
        LibroServicio serv=new LibroServicio();
        return serv.obtener(libro);
    }

}
