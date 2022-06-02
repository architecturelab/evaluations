package com.architecturelab.evaluations.infra.jpa.repository.ticket;

import com.architecturelab.evaluations.infra.jpa.dao.EvaluationDao;
import com.architecturelab.evaluations.infra.jpa.domain.Evaluation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
@EnableJpaRepositories(basePackages = {"com.architecturelab.evaluations"})
@EntityScan("com.architecturelab.evaluations")
public class EvaluationJpaRepositoryImpl implements EvaluationJpaRepository {

    @Autowired
    private EvaluationDao evaluationDao;

    @Override
    public Evaluation save(Evaluation entity) {
        return evaluationDao.save(entity);
    }

    @Override
    public Iterable<Evaluation> getAll() {
        return evaluationDao.findAll();
    }

    @Override
    public Optional<Evaluation> getById(Long id) {
        return evaluationDao.findById(id);
    }

    @Override
    public Optional<Evaluation> getByTicketId(Long ticketId) {
        return evaluationDao.findByTicketId(ticketId);
    }
}
