package in.bank.card.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bank.card.model.Cards;

@Repository
public interface CardsRepository extends CrudRepository<Cards, Long>{

	List<Cards> findByCustomerId(int customerId);
}
