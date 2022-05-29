package com.architecturelab.evaluations.infra.jpa.dao;

import com.architecturelab.evaluations.infra.jpa.domain.Evaluation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationDao extends CrudRepository<Evaluation, Long> {
}
