package gameLaby.laby;

public abstract class Entitee {

    public static final int DEGAT = 1;
    private int pv;
    /**
     * position de l'entitee
     */
    private Position pos;

    public Entitee(int dx, int dy){
        pos = new Position(dx,dy);
        this.pv = 2;
    }

    public Entitee(int dx, int dy,int pv){
        pos = new Position(dx,dy);
        this.pv = pv;
    }

    /**
     * permet de savoir si le personnage est en x,y
     *
     * @param dx position testee
     * @param dy position testee
     * @return true si le personnage est bien en (dx,dy)
     */
    public boolean etrePresent(int dx, int dy) {
        return (this.pos.getX() == dx && this.pos.getY() == dy);
    }

    public boolean etreMort(){
        return pv <= 0;
    }

    public void perdrePv(int degat){
        this.pv-=degat;
    }

    public abstract boolean attaquer(Entitee e);

    // ############################################
    // GETTER
    // ############################################

    /**
     * @return position du personnage
     */
    public Position getPos() {
        return pos;
    }
}
