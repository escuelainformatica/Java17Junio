package cl.escuelainformatica.junio17.controlador;


import cl.escuelainformatica.junio17.modelo.Encomienda;
import cl.escuelainformatica.junio17.servicio.EncomiendaServicio;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enc")
public class EncomiendaController {

    @PostMapping("/calculo") // http://localhost:8080/enc/calculo
    public int calculo(@RequestBody Encomienda enc) {
        EncomiendaServicio es=new EncomiendaServicio();
        return es.calculo(enc);
    }
    @PostMapping("/redireccion") // http://localhost:8080/enc/redireccion?nuevoDestino=PuntaArenas
    public boolean redireccion(@RequestBody Encomienda enc,String nuevoDestino) {
        EncomiendaServicio es=new EncomiendaServicio();
        return es.redireccion(enc,nuevoDestino);
    }
    @PostMapping("/calculoCarta") // http://localhost:8080/enc/calculoCarta
    public int calculoCarta(@RequestBody Encomienda enc) {
        EncomiendaServicio es=new EncomiendaServicio();
        return es.calculoCarta(enc);
    }

}
