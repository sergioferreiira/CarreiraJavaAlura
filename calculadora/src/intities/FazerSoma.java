package intities;

public class FazerSoma {
    private int x;
    private int y;

    public FazerSoma(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int fazerSomar(Integer x, Integer y){
        return x + y;
    }



}
