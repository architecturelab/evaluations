package com.architecturelab.evaluations.useCases.diagnostic;

import com.architecturelab.evaluations.core.domain.evaluation.EvaluationInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EvaluationInputUseCases {

    public EvaluationInput create(EvaluationInput evaluationInput);

    public EvaluationInput update(EvaluationInput evaluationInput);

    public List<EvaluationInput> getAll();

    public EvaluationInput getById(Long id);

    public EvaluationInput getByTicketId(Long id);
}
