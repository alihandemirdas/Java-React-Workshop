package alihandemirdas.northwind.business.abstracts;

import java.util.List;

import alihandemirdas.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product>  getAll();
}
