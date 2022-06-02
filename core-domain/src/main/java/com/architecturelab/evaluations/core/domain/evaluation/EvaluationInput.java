package com.architecturelab.evaluations.core.domain.evaluation;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class EvaluationInput {

    private Long evaluationId;

    private Long ticketId;

    private String descripcion;

    private Boolean decision;

    private String usuarioCreacion;

    private Date fechaCreacion;

    private String usuarioModifica;

    private Date fechaModifica;
}
