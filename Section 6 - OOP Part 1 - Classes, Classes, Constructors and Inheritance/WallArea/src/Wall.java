public class Wall {

    private double width;
    private double hight;

    public Wall() {

    }

    public Wall(double width, double hight) {

        setHight(hight);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        if (hight < 0) {
            this.hight = 0;
        } else {
            this.hight = hight;
        }
    }

    public double getArea() {
        return (this.getHight() * this.getWidth());
    }
}
