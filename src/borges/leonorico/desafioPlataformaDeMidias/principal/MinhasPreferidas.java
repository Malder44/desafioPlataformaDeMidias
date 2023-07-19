package borges.leonorico.desafioPlataformaDeMidias.principal;

import borges.leonorico.desafioPlataformaDeMidias.midias.Audio;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 7) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo");
        }
    }

    //TODO: Melhorar essa classe/Refatorar essa classe.
}
