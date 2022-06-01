package com.architecturelab.evaluations.infra.jpa.repository.ticket;

import com.architecturelab.evaluations.infra.jpa.domain.Evaluation;

import java.util.Optional;

public interface EvaluationJpaRepository {

    public Evaluation save(Evaluation entity);

    public Iterable<Evaluation> getAll();

    public Optional<Evaluation> getById(Long id);

}
