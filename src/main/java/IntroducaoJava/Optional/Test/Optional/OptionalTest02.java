package IntroducaoJava.Optional.Test.Optional;
//1 procure manga por titulo e se existir atualize o título.
//2 caso Id nao exista, lance uma exceçao e ligue o argumento exception
//3- procure por titulo, e caso nao exista crie um novo manga.

import IntroducaoJava.Optional.Dominio.Manga;
import IntroducaoJava.Optional.Repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        MangaRepository mangaRepository = new MangaRepository();

        Optional<Manga> mangaByTitle = mangaRepository.findByTitle("Naruto"); //se existir eu atualizo.
        mangaByTitle.ifPresent(manga -> manga.setTitle("Naruto Shippuden")); //se existir vira isso.
        System.out.println(mangaByTitle);

        Manga mangaById = mangaRepository.findById(4).orElseThrow(IllegalArgumentException::new);
                //.orElseThrow(IllegalArgumentException :: new)); usando method reference
        System.out.println(mangaById);

        Manga verifiedMangaTitle = mangaRepository.findByTitle("Boku no hero")
                .orElseGet(()-> new Manga("goku", 4, 60));
        System.out.println(verifiedMangaTitle);





    }

 }

//Resumo das Funções Utilizadas:
//ifPresent: Executa a operação passada como parâmetro se o valor no Optional estiver presente. Aqui, você usou para atualizar o título de um manga.
//
//orElseThrow: Lança uma exceção caso o valor no Optional esteja ausente. Aqui, você usou para lançar uma IllegalArgumentException caso não encontre um manga com ID 4.
//
//orElseGet: Retorna o valor contido no Optional se ele estiver presente, ou executa a função fornecida como parâmetro para criar um novo valor. Aqui, você usou para criar um novo manga caso o título "Boku no hero" não seja encontrado.


