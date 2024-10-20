package exercise;

// BEGIN
class Segment {
    Point begin;
    Point end;

    public Segment(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBeginPoint() {
        return this.begin;
    }

    public Point getEndPoint() {
        return this.end;
    }

    public Point getMidPoint() {
        int midX = (this.begin.getX() + this.end.getX()) / 2;
        int midY = (this.begin.getY() + this.end.getY()) / 2;
        return new Point(midX, midY);
    }
}
// END
