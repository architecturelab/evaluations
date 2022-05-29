# evaluations

## API REST

### CLASE
- Crear
  - URL: POST- http://34.122.37.103/evaluations/type
  - Ejemplo request:
    ```json
    {
    "nombre": "clase 1",
    "vidaUtil": "d5",
    "vigente": "si"
    }
- Actualizar
  - URL: PUT- http://34.122.37.103/evaluations/type
  - Ejemplo request:
    ```json
    {
    "claseId": <<claseId>>,
    "nombre": "clase 1",
    "vidaUtil": "d5",
    "vigente": "si"
    }
- Listar todos
  - URL: GET- http://34.122.37.103/evaluations/types
- Consultar por Id:
  - URL: GET- http://34.122.37.103/evaluations/type/{id}
### MARCA
- Crear
  - URL: POST- http://34.122.37.103/evaluations/brand
    - Ejemplo request:
      ```json
      { 
      "nombre": "marca 1",
      "vidaUtil": "d5",
      "vigente": "si"
      }
- Actualizar
  - URL: PUT- http://34.122.37.103/evaluations/brand
  - Ejemplo request:
    ```json
    {
    "marcaId": <<marcaId>>,
    "nombre": "marca 1",
    "vidaUtil": "d5",
    "vigente": "si"
    }
- Listar todos
    - URL: GET- http://34.122.37.103/evaluations/brands
- Consultar por Id:
    - URL: GET- http://34.122.37.103/evaluations/brand/{id}
### MODELO
- Crear
- URL: POST- http://34.122.37.103/evaluations/model
  - Ejemplo request:
    ```json
    { 
    "nombre": "model 1",
    "marcaId": <<marcaId>>,
    "vidaUtil": "d5",
    "vigente": "si"
    }
- Actualizar
  - URL: PUT- http://34.122.37.103/evaluations/model
    - Ejemplo request:
      ```json
      {
      "modeloId": <<modeloId>>,
      "nombre": "model 1",
      "marcaId": <<marcaId>>,
      "vidaUtil": "d5",
      "vigente": "si"
      }
- Listar todos
  - URL: GET- http://34.122.37.103/evaluations/models
- Consultar por Id:
  - URL: GET- http://34.122.37.103/evaluations/model/{id}
### DEPENDENCIA
- Crear
  - URL: POST- http://34.122.37.103/evaluations/dependency
    - Ejemplo request:
      ```json
      { 
      "nombre": "dependencia 1",
      "vigente": "si"
      }
- Actualizar
  - URL: PUT- http://34.122.37.103/evaluations/dependency
    - Ejemplo request:
      ```json
      {
      "dependenciaId": <<dependenciaId>>,
      "nombre": "dependencia 1",
      "vigente": "si"
      }
- Listar todos
    - URL: GET- http://34.122.37.103/evaluations/dependencies
- Consultar por Id:
    - URL: GET- http://34.122.37.103/evaluations/dependency/{id}
### ITEM
- Crear
  - URL: POST- http://34.122.37.103/evaluations/item
    - Ejemplo request:
      ```json
      { 
      "claseId": <<claseId>>,
      "marcaId": <<marcaId>>,
      "modeloId": <<modeloId>>,
      "serial": "132165498301",
      "fechaIngreso": "2020-04-02",
      "fechaFinalGarantia": "2025-04-02",
      "valor": 2000000.00,
      "fechaBaja": "2025-03-30",
      "dependenciaId": <<dependenciaId>>
      }
- Actualizar
  - URL: PUT- http://34.122.37.103/evaluations/item
    - Ejemplo request:
      ```json
      {
      "itemId": <<itemId>>
      "claseId": 5,
      "marcaId": 7,
      "modeloId": 9,
      "serial": "132165498301",
      "fechaIngreso": "2020-04-02",
      "fechaFinalGarantia": "2025-04-02",
      "valor": 2000000.00,
      "fechaBaja": "2025-03-30",
      "dependenciaId": 3
      }
- Listar todos
  - URL: GET- http://34.122.37.103/evaluations/items
- Consultar por Id:
  - URL: GET- http://34.122.37.103/evaluations/item/{id}