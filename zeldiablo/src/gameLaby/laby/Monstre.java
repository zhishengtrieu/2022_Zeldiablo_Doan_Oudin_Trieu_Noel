package gameLaby.laby;

public class Monstre extends Entitee{

    /**
     * constructeur
     *
     * @param dx position selon x
     * @param dy position selon y
     */
    public Monstre(int dx, int dy) {
        super(dx,dy);
    }

    @Override
    public boolean attaquer(Entitee e) {
        return false;
    }

}

