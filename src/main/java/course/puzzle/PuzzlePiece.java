package course.puzzle;

public class PuzzlePiece {
    private int id;
    private Edge left;
    private Edge top;
    private Edge right;
    private Edge bottom;




    public PuzzlePiece(int id,int left, int top, int right, int bottom) {
        this.id = id;
        this.left = new Edge("left",left);
        this.top = new Edge("top",top);
        this.right = new Edge("right",right);
        this.bottom = new Edge("bottom",bottom);

    }

    public Edge getLeft() {
        return left;
    }

    public Edge getTop() {
        return top;
    }

    public Edge getRight() {
        return right;
    }

    public Edge getBottom() {
        return bottom;
    }

    public int getId() {
        return id;
    }
}
