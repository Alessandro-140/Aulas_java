


// Algoritmo de ordenação bubble sort
// você irá com ordenar membros de um vetor utilizando o algoritmo de ordenação bubble sort.

class Aula_33 {
 
    public static void main(String[] args) {
     
    int vetor[] = {3, 6, 2, 1, 8, 4};
     int aux;
     boolean controle;
     
     for(int i = 0; i < vetor.length; ++i){
     controle = true;
     for(int j = 0; j < (vetor.length - 1); ++j){
     
     // Aqui se o vetor j for maior que o vetor j incremento + 1 porque seu limite e sempre 1 a menos.
     if(vetor[j] > vetor[j + 1]){
    // Abaixo o auxiliar recebe o vetor [j]
     aux = vetor[j];
     // vetor[j] está incrementando + 1, porque ser sempre um a menos no final
     vetor[j] = vetor[j + 1];
     vetor[j + 1] = aux;
     controle = false;
     }
     }
     if(controle){
     break;
     }
     
     }
     
     for (int i = 0; i < vetor.length; ++i) {
     System.out.print(vetor[i] + " ");
     }
     
    }
    }
    

    //-------------------------------------------------------

