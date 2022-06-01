# evaluations

## API REST

- Crear
  - URL: POST- http://34.135.72.129/evaluations/evaluation
  - Ejemplo request:
    ```json
    {
    "nombre": "clase 1",
    "vidaUtil": "d5",
    "vigente": "si"
    }
- Actualizar
  - URL: PUT- http://34.135.72.129/evaluations/evaluation
  - Ejemplo request:
    ```json
    {
    "claseId": <<claseId>>,
    "nombre": "clase 1",
    "vidaUtil": "d5",
    "vigente": "si"
    }
- Listar todos
  - URL: GET- http://34.135.72.129/evaluations/evaluations
- Consultar por Id:
  - URL: GET- http://34.135.72.129/evaluations/evaluation/{id}