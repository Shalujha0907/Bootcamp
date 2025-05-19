public  class Square implements Parallelogram {
    private final int length;
    public Square(int side) {
        this.length = side;
    }

    @Override
    public int area() {
        return length * length;
    }

    @Override
    public int perimeter() {
        return 4 * length;
    }
}

