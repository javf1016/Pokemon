http://localhost:8080/pokemons?offset=0&limit=20

# Patrón de Diseño: Service Layer (Capa de Servicio)
El Service Layer Pattern se utiliza para definir una capa de servicios que abstrae la lógica de negocio y orquesta la interacción entre diferentes componentes de la aplicación, como controladores y repositorios.

* Implementación:
PokemonApiService: Esta clase implementa la capa de servicio. Se encarga de interactuar con la API de Pokémon a través de RestTemplate, encapsulando la lógica de negocio necesaria para construir la URL con parámetros de paginación, realizar la solicitud HTTP, y manejar la respuesta.

* Justificación:
Separación de Responsabilidades: Mantiene el controlador REST (PokemonRestController) libre de lógica de negocio, lo que facilita la escalabilidad y mantenimiento del código.
Reutilización: La lógica de consumo de la API está centralizada en la capa de servicio, permitiendo que otros componentes o servicios puedan reutilizar esta funcionalidad si es necesario.

# Patrón de Diseño: Adapter (Adaptador)
El Adapter Pattern se usa para convertir la interfaz de una clase en otra interfaz que el cliente espera. En este contexto, podemos aplicar el patrón adaptador para mapear y adaptar los datos recibidos desde la API externa de Pokémon al formato esperado por nuestra aplicación.

* Implementación:
PokemonResponse y PokemonResult: Estas clases actúan como adaptadores al mapear la estructura de la respuesta JSON de la API externa al modelo que se utiliza en la aplicación. Este patrón es particularmente útil cuando necesitas interactuar con APIs externas cuya estructura no coincide exactamente con la estructura de datos de tu aplicación.

* Justificación:
Integración Fácil: Permite integrar datos de una API externa en tu aplicación sin necesidad de modificar la estructura interna de tus modelos.
Flexibilidad: Si la estructura de la API externa cambia, solo necesitas modificar las clases adaptadoras (PokemonResponse y PokemonResult) sin impactar el resto del sistema.
