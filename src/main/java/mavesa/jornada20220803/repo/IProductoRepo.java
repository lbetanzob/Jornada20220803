package mavesa.jornada20220803.repo;

import mavesa.jornada20220803.entidad.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductoRepo extends CrudRepository<Product,Integer> {
}
