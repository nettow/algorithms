/*

A corrida de lesmas é um esporte que cresceu muito nos últimos anos, fazendo com que várias pessoas dediquem suas vidas tentando capturar lesmas velozes, e treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de capturar lesmas velozes não é uma tarefa muito fácil, pois praticamente todas as lesmas são muito lentas. Cada lesma é classificada em um nível dependendo de sua velocidade:


Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .


Sua tarefa é identificar qual nível de velocidade da lesma mais veloz de um grupo de lesmas.

Entrada
A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: A primeira linha contém um inteiro L (1 ≤ L ≤ 500) representando o número de lesmas do grupo, e a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50) representando as velocidades de cada lesma do grupo.

A entrada termina com o fim do arquivo (EOF).

Saída
Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da lesma mais veloz do grupo.

*/

import java.util.Scanner;

public class Uri1786 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int numberOfSlugs = input.nextInt(),level = 0;

            for(int i = 0; i < numberOfSlugs; i++){
                int velocity = input.nextInt();

                if(velocity < 1 || velocity > 50) {
                    System.out.println("Velocidade acima ou abaixo do esperado.");
                    System.exit(0);
                } else if (velocity < 10 && level <= 1)
                    level = 1;
                    else if (velocity > 20 && level <= 2)
                        level = 3;
                    else if (level < 2)
                        level = 2;
            }
            System.out.println(level);
        }
    }
}
