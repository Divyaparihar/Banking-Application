package in.bank.loans.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import in.bank.loans.model.Loans;


@Repository
public interface LoansRepository extends CrudRepository<Loans, Long>{

	
	public List<Loans> getByCustomerId(int customerId);
}


