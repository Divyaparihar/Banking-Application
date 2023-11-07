package in.bank.insurance.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import in.bank.insurance.model.Insurance;


@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Long>{

	
	public List<Insurance> getByCustomerId(int customerId);
}


