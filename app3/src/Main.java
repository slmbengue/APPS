import entity.Article;
import entity.ArticleImpl;
import entity.Chemise;
import entity.ChemiseImpl;
import entity.IArticle;
import entity.IChemise;
import entity.IMontre;
import entity.Montre;
import entity.MontreImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Gestion des chemises
        IChemise chemiseImpl = new ChemiseImpl();
        Chemise chemise = chemiseImpl.saisie();
        chemiseImpl.affichage(chemise);

        // Gestion des montres
        IMontre montreImpl = new MontreImpl();
        Montre montre = montreImpl.saisie();
        montreImpl.affichage(montre);

        // Gestion générale des articles
        IArticle articleImpl = new ArticleImpl();
        Article article = articleImpl.saisie();
        articleImpl.affichage(article);
    }
}