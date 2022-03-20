package alihandemirdas.northwind.business.abstracts;

import java.util.List;

import alihandemirdas.northwind.core.utilities.results.DataResult;
import alihandemirdas.northwind.core.utilities.results.Result;
import alihandemirdas.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>>  getAll();
	Result add(Product product);
}	
