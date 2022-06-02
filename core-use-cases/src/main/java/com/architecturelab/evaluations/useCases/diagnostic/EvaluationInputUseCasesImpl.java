package com.architecturelab.evaluations.useCases.diagnostic;

import com.architecturelab.evaluations.core.domain.evaluation.EvaluationInput;
import com.architecturelab.evaluations.infra.jpa.domain.Evaluation;
import com.architecturelab.evaluations.infra.jpa.repository.ticket.EvaluationJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EvaluationInputUseCasesImpl implements com.architecturelab.evaluations.useCases.diagnostic.EvaluationInputUseCases {

    @Autowired
    private EvaluationJpaRepository evaluationJpaRepository;

    @Override
    public EvaluationInput create(EvaluationInput evaluationInput) {
        Evaluation evaluation = evaluationJpaRepository.save(new Evaluation(
                evaluationInput.getEvaluationId(),
                evaluationInput.getTicketId(),
                evaluationInput.getDescripcion(),
                evaluationInput.getDecision(),
                evaluationInput.getUsuarioCreacion(),
                evaluationInput.getFechaCreacion(),
                evaluationInput.getUsuarioModifica(),
                evaluationInput.getFechaModifica()
        ));
        EvaluationInput input = new EvaluationInput(
                evaluation.getId(),
                evaluation.getTicketId(),
                evaluation.getDescripcion(),
                evaluation.getDecision(),
                evaluation.getUsuarioCreacion(),
                evaluation.getFechaCreacion(),
                evaluation.getUsuarioModifica(),
                evaluation.getFechaModifica()
        );
        return input;
    }

    @Override
    public EvaluationInput update(EvaluationInput evaluationInput) {
        Optional<Evaluation> diagnosticData = evaluationJpaRepository.getById(evaluationInput.getEvaluationId());
        if (diagnosticData.isPresent()){
            Evaluation evaluation = diagnosticData.get();
            evaluation.setTicketId(evaluationInput.getTicketId());
            evaluation.setDescripcion(evaluationInput.getDescripcion());
            evaluation.setDecision(evaluationInput.getDecision());
            evaluation.setUsuarioCreacion(evaluationInput.getUsuarioCreacion());
            evaluation.setFechaCreacion(evaluationInput.getFechaCreacion());
            evaluation.setUsuarioModifica(evaluationInput.getUsuarioModifica());
            evaluation.setFechaModifica(evaluationInput.getFechaModifica());

            Evaluation updated = evaluationJpaRepository.save(evaluation);
            EvaluationInput input = new EvaluationInput(
                    updated.getId(),
                    updated.getTicketId(),
                    updated.getDescripcion(),
                    updated.getDecision(),
                    updated.getUsuarioCreacion(),
                    updated.getFechaCreacion(),
                    updated.getUsuarioModifica(),
                    updated.getFechaModifica()
            );
            return input;
        }
        return null;
    }

    @Override
    public List<EvaluationInput> getAll() {
        List<Evaluation> evaluations = (List<Evaluation>) evaluationJpaRepository.getAll();

        List<EvaluationInput> inputs = new ArrayList<EvaluationInput>();

        evaluations.forEach(i -> {
            EvaluationInput diagnostic = new EvaluationInput(
                    i.getId(),
                    i.getTicketId(),
                    i.getDescripcion(),
                    i.getDecision(),
                    i.getUsuarioCreacion(),
                    i.getFechaCreacion(),
                    i.getUsuarioModifica(),
                    i.getFechaModifica()
            );
            inputs.add(diagnostic);
        });
        return inputs;
    }

    @Override
    public EvaluationInput getById(Long id) {
        Optional<Evaluation> diagnosticData = evaluationJpaRepository.getById(id);
        if (diagnosticData.isPresent()){
            Evaluation evaluation = diagnosticData.get();
            EvaluationInput input = new EvaluationInput(
                    evaluation.getId(),
                    evaluation.getTicketId(),
                    evaluation.getDescripcion(),
                    evaluation.getDecision(),
                    evaluation.getUsuarioCreacion(),
                    evaluation.getFechaCreacion(),
                    evaluation.getUsuarioModifica(),
                    evaluation.getFechaModifica()
            );
            return input;
        }
        return null;
    }

    @Override
    public EvaluationInput getByTicketId(Long id) {
        Optional<Evaluation> diagnosticData = evaluationJpaRepository.getByTicketId(id);
        if (diagnosticData.isPresent()){
            Evaluation evaluation = diagnosticData.get();
            EvaluationInput input = new EvaluationInput(
                    evaluation.getId(),
                    evaluation.getTicketId(),
                    evaluation.getDescripcion(),
                    evaluation.getDecision(),
                    evaluation.getUsuarioCreacion(),
                    evaluation.getFechaCreacion(),
                    evaluation.getUsuarioModifica(),
                    evaluation.getFechaModifica()
            );
            return input;
        }
        return null;
    }
}
