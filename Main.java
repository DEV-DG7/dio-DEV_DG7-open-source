import java.util.*;

// Interface comum para todos os algoritmos de recomendação
interface RecommendationStrategy {
    List<String> recommendBooks(String userPreferences);
}

// Algoritmo de recomendação baseado em gênero literário
class GenreBasedRecommendation implements RecommendationStrategy {
    public List<String> recommendBooks(String userPreferences) {
        // Lógica de recomendação baseada em gênero
        return Arrays.asList("1984", "Brave New World", "Fahrenheit 451");
    }
}

// Algoritmo de recomendação baseado em popularidade
class PopularityBasedRecommendation implements RecommendationStrategy {
    public List<String> recommendBooks(String userPreferences) {
        // Lógica de recomendação baseada em popularidade
        return Arrays.asList("The Da Vinci Code", "The Alchemist", "The Catcher in the Rye");
    }
}

// Contexto que utiliza uma estratégia de recomendação
class BookRecommender {
    private RecommendationStrategy strategy;

    public BookRecommender(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public List<String> recommendBooks(String userPreferences) {
        return strategy.recommendBooks(userPreferences);
    }
}

public class Main {
    public static void main(String[] args) {
        // Cliente pode escolher a estratégia de recomendação
        BookRecommender recommender = new BookRecommender(new GenreBasedRecommendation());
        System.out.println("Recomendações de Ficção Científica: " + recommender.recommendBooks("Ficção Científica"));

        // Mudar a estratégia dinamicamente
        recommender.setStrategy(new PopularityBasedRecommendation());
        System.out.println("Recomendações de Bestsellers: " + recommender.recommendBooks("Bestsellers"));
    }
}
