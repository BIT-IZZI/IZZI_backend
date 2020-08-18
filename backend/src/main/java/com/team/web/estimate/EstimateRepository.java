package com.team.web.estimate;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstimateRepository extends JpaRepository<Estimate,Long>, IEstimateRepository {
}
