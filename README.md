# -Simulador-de-Autômatos-Finitos
Este simulador foi criado para a realização de um trabalho para a disciplina de Teoria da Computação, ministrada pelo professor Wellington Della Mura.

Foram feitos três exemplos para usar nos autômatos, cada exemplo funciona no autômatos de mesmo número, logo, o exemplo 1 funciona no autômatos 1. Todos os 3 exemplos têm 3 fases de evolução: q0, q1, q2; E 2 fases de resposta (aceito e recusado): q3, qerro. Se ao final da execução do codigo aparecer 1, o que foi digitado foi aceito pelo autômatos, se aparecer 0, foi recusado.



O primeiro exemplo é o alfabeto [A B C]:
  
    O estado q0 aceita tanto como "a" como "c", se for digitado "a" ele evolui para q1 e se for digitado "c" ele evolui para q3
  
    O estado q1 aceita "b" e evolui para q2
  
    O estado q2 aceita "b" e volta para q0
  
    Logo para aparecer 1 terá q ser digitado "abbc" ou somente "c"


O segundo exemplo é o alfabeto [D E F]- 
  
    O estado q0 aceita "d" e evolui para q1 
  
    O estado q1 aceita "e" e evolui para q2
  
    O estado q2 aceita "f" e evolui para q3
  
    Logo para aparecer 1 terá q ser digitado "def"
  
  
O terceiro exemplo é o alfabeto [G H I]- 
  
    O estado q0 aceita "g" e evolui para q1
  
    O estado q1 aceita "h" e evolui para q2 ou se for digitado "i" ele evolui para q3 
  
    O estado q2 aceita "i" e retorna para o estado q1
  
    Logo para aparecer 1 terá q ser digitado "ghii" ou "gi"
