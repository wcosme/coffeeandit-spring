package br.com.coffeeandit.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.coffeeandit.domain.DailyLimit;

@Repository
public interface DailyLimitRepository extends JpaRepository<DailyLimit, Long> {

	Optional<DailyLimit> findByAgencyAndAccount(Long agency, Long account);
}
