package JeuSimple;

import gameLaby.laby.Labyrinthe;
import gameLaby.laby.Perso;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import moteurJeu.Clavier;
import moteurJeu.Jeu;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Classe pour representer le jeu
 */
public class LabyJeu implements Jeu  {

    /**
     * Cercle representant le personnage
     */
    private Perso personnage;
    /**
     * Liste des murs du laby
     */
    private boolean[][] murs;


    /**
     * Constructeur a partir du nom d'un labyrinthe
     * @param nom le nom du labyrinthe a charger
     */
    public LabyJeu(String nom) throws IOException {
        // On cree un nouveau labyrinthe a partir du nom donné en param
        Labyrinthe lab = new Labyrinthe(nom);

        this.murs = lab.murs;
        this.personnage = lab.pj;
    }


    /**
     * Met a jour le jeu
     * @param secondes temps ecoule depuis la derniere mise a jour
     * @param clavier objet contenant l'état du clavier'
     */
    @Override
    public void update(double secondes, Clavier clavier) {
        // On déplace le personnage selon les touches du clavier
        if (clavier.droite){
            this.personnage.setCenterX(this.personnage.getCenterX() + 1);
        }

        if (clavier.gauche){
            this.personnage.setCenterX(this.personnage.getCenterX() - 1);
        }

        if (clavier.haut){
            this.personnage.setCenterY(this.personnage.getCenterY() + 1);
        }

        if (clavier.bas){
            this.personnage.setCenterY(this.personnage.getCenterY() - 1);
        }
    }


    /**
     * On initialise le laby
     */
    @Override
    public void init() {
        // On initialise le labyrinthe
    }


    /**
     * Le jeu ne finit pas
     * @return
     */
    @Override
    public boolean etreFini() {
        return false;
    }

    /**
     * getter
     */
    public boolean[][] getMurs(){
        return this.murs;
    }

    public Perso getPj(){
        return this.personnage
    }
}
