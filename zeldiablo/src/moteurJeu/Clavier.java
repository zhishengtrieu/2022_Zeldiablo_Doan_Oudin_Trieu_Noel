package moteurJeu;

import javafx.scene.input.KeyEvent;

public class Clavier {

    /**
     * controle appuyes
     */
    public boolean haut, bas, gauche, droite, space;

    /**
     * stocke les commandes
     *
     * @param event evenement clavier
     */
    public void appuyerTouche(KeyEvent event) {

        switch (event.getCode()) {

            // si touche bas
            case S:
            case DOWN:
                this.bas = true;
                break;

            // si touche haut
            case Z:
            case UP:
                this.haut = true;
                break;

            // si touche gauche
            case Q:
            case LEFT:
                this.gauche = true;
                break;

            // si touche droite
            case D:
            case RIGHT:
                this.droite = true;
                break;

                // Si touche espace
            case SPACE:
                this.space =true;
                break;
        }

    }

    /**
     * stocke les commandes
     *
     * @param event evenement clavier
     */
    public void relacherTouche(KeyEvent event) {

        switch (event.getCode()) {

            // si touche bas
            case S:
            case DOWN:
                this.bas = false;
                break;

            // si touche haut
            case Z:
            case UP:
                this.haut = false;
                break;

            // si touche gauche
            case Q:
            case LEFT:
                this.gauche = false;
                break;

            // si touche droite
            case D:
            case RIGHT:
                this.droite = false;
                break;

                // si touche espace
            case SPACE:
                this.space = false;
                break;
        }
    }

    //setter pour les tests
    public void setHaut(boolean haut) {
        this.haut = haut;
    }

    public void setBas(boolean bas) {
        this.bas = bas;
    }

    public void setDroite(boolean droite) {
        this.droite = droite;
    }

    public void setGauche(boolean gauche) {
        this.gauche = gauche;
    }

    public void setSpace(boolean space){
        this.space = space;
    }
}
