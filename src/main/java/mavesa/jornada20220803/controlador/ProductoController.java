package mavesa.jornada20220803.controlador;

import mavesa.jornada20220803.entidad.Product;
import mavesa.jornada20220803.repo.IProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private IProductoRepo iprorepo;

    @GetMapping("/listar")
    public List<Product> producto(){
        return (List<Product>) iprorepo.findAll();
    }
}
