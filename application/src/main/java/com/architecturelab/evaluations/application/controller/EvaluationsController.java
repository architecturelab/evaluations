package com.architecturelab.evaluations.application.controller;

import com.architecturelab.evaluations.core.domain.evaluation.EvaluationInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluations")
public class EvaluationsController {

    @Autowired
    private com.architecturelab.evaluations.useCases.diagnostic.EvaluationInputUseCases evaluationInputUseCases;

    @GetMapping("/evaluation/{id}")
    public ResponseEntity<EvaluationInput> getDiagnosticById(@PathVariable Long id) {
        try {
            EvaluationInput evaluationInput = evaluationInputUseCases.getById(id);
            if (evaluationInput != null) {
                return new ResponseEntity<>(evaluationInput, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/evaluation/ticket/{ticketId}")
    public ResponseEntity<EvaluationInput> getDiagnosticByTicketId(@PathVariable Long ticketId) {
        try {
            EvaluationInput evaluationInput = evaluationInputUseCases.getByTicketId(ticketId);
            if (evaluationInput != null) {
                return new ResponseEntity<>(evaluationInput, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/evaluation")
    public ResponseEntity<EvaluationInput> createDiagnostic(@RequestBody EvaluationInput evaluationInput) {
        try {
            EvaluationInput _evaluationInput = evaluationInputUseCases.create(evaluationInput);
            return new ResponseEntity<>(_evaluationInput, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/evaluation")
    public ResponseEntity<EvaluationInput> updateDiagnostic(@RequestBody EvaluationInput evaluationInput) {
        try {
            EvaluationInput _evaluationInput = evaluationInputUseCases.update(evaluationInput);
            if (_evaluationInput !=null) {
                return new ResponseEntity<>(_evaluationInput, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/evaluations")
    public ResponseEntity<List<EvaluationInput>> getAllDiagnostics() {
        try {
            List<EvaluationInput> evaluationInputs = evaluationInputUseCases.getAll();
            if (evaluationInputs.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(evaluationInputs, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
