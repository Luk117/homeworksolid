# Principios SOLID 

## Principio Single Responsability
Se aplicó a todas las clases/entiddes con el fin de que tuvieran una sola tarea. Este se puede ver
reflejado explícitamente en la clase GuardarEstudiante, ya que no tendria sentida que realizará otra acción diferente a guardar un 
estudiante. 

## Principio Open/Closed
Nos dimos cuenta que habían varios métodos que al agregar más objetos (carreras) modificaría el resultado del
método, por lo cual en un futuro no tendría escalabilidad ni extensibilidad. Aplicando el concepto de CodeSmell, hicimos refactor y se 
cambió la lógica de los if por un método más "genérico" que sirviera sin importar la carrera a la que pertenezca el estudiante. Asegurando
de esta manera que estos métodos estén abiertos para extensión pero cerrados para modificación. Esto se puede ver reflejado explicitamente 
en el método verMateriasEstudiantes() en la clase Main y en enviarMaterialEstudiante() en la clase EnvioMaterial.

## Principio Liskov Substitution
Según la lógica planteada no fue necesario aplicar el polimorfismo.

## Principio Interface Segregation
Se implementaron dos interfaces ServicioEmail y GuardarEstudiante, con el fin de que los métodos implementados
fueron utilizados, logrando que ninguno de esto causará un error o una excepción. 

## Principio Dependency Inversion
Se implementó para los servicios de correo y de guardar estudiante, de tal forma que ese servicio no dependa 
solamente de Outlook o de Gmail, o en el caso de las bases de datos no dependa de MySQL u Oracle, sino que maneja de por medio unas interfaces
que evitan el acoplamiento de estas clases. 
 
