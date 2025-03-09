package IntroducaoJava.Optional.Repositorio;
import IntroducaoJava.Optional.Dominio.Manga;
//1 procure manga por titulo e se existir atualize o título.
//2 caso Id nao exista, lance uma exceçao e ligue o argumento exception
//3- procure por titulo, e caso nao exista crie um novo manga.

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = new ArrayList<>(List.of(
            new Manga("Naruto", 1,100),
            new Manga("One Piece", 2,30),
            new Manga("Berserk", 3, 40)));

    //METÓDO ESPECÍFICO PARA TÍTULO , reutilizando findBy
        public Optional<Manga> findByTitle( String title) {
            return  findBy(manga -> manga.getTitle().equals(title));

        }
        // Método específico para buscar por ID, reutilizando findBy
        public Optional<Manga> findById(Integer id) {
            return findBy(manga -> manga.getId().equals(id));

        }


    //MÉTODO GENÉRICO PARA BUSCA usando Predicate
    public Optional<Manga> findBy (  Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) { // Retorna imediatamente o primeiro encontrado
                found = manga;
            }
        }
        return Optional.ofNullable(found); // Retorna Optional vazio se não encontrar
    }
}
//findByTitle(String title) → Chama findBy, passando um Predicate que verifica se o título do Manga é igual ao que foi passado.
//2️⃣ findById(int id) → Chama findBy, passando um Predicate que verifica se o ID do Manga é igual ao argumento.
//Isso evita código duplicado e mantém a lógica de busca centralizada em findBy.