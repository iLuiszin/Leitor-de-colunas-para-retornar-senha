import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Challenge {
    public static int calculaNumeroDaSenha(List<String> senha) {

        List<String> listaResultadoEmString = new ArrayList(Arrays.asList("0", "0", "0", "0", "0", "0", "0", "0", "0", "0"));
        String resultadoFinalEmString = "";
        String valorDoElementoAtual;
        String digitoAtual = "";
        int resultadoFinal = 0;
        int qtdZero = 0;
        int qtdUm = 0;
        char k = '0';

        //for (int numeroDaColuna = 0; numeroDaColuna < senha.size(); numeroDaColuna++) 
      for (int z = 0; z < senha.size(); z++){      
      for (int x = 0; x < senha.size(); x++) {
                valorDoElementoAtual = senha.get(x);
              
              char result = valorDoElementoAtual.charAt(0 + z);
              int comp = Character.compare(result, k);

                if (comp == 0 ) {
                    qtdZero++;
                } else {
                    qtdUm++;
                }  
            }
      
      if (qtdZero > qtdUm) {
                listaResultadoEmString.set(z, "0");
            } else if (qtdZero == qtdUm) {
                listaResultadoEmString.set(z, "1");
            } else {
                listaResultadoEmString.set(z, "1");
            }
            qtdZero = 0;
            qtdUm = 0;
      }
            
        for (int z = 0; z < listaResultadoEmString.size(); z++) {
            resultadoFinalEmString = resultadoFinalEmString.concat(listaResultadoEmString.get(z));
        }
        
      resultadoFinal = Integer.parseInt(resultadoFinalEmString,2);
      
        return resultadoFinal;
    }
}
