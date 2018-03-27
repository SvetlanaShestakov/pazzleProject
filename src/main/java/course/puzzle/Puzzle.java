package course.puzzle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Puzzle {
    private List<PuzzlePiece> puzzle = new ArrayList<PuzzlePiece>();

    public Puzzle(List<PuzzlePiece> puzzle) {
        this.puzzle = puzzle;
    }

    public Map<Integer, Integer> getPossibleSolutions() {
        Map<Integer, Integer> solutions = new HashMap<Integer, Integer>();

        return solutions;
    }

    public List<PuzzlePiece> getListOfPiecesWithSpecificEdge(Edge edge) {
        List<PuzzlePiece> specificEdges = new ArrayList<PuzzlePiece>();


        return specificEdges;
    }

    public boolean validateNumberOfStraightEdges(int width, int height) {
        Edge leftStraight = new Edge("left", 0);
        int numOfLeftEdges = getListOfPiecesWithSpecificEdge(leftStraight).size();

        if (numOfLeftEdges < width - 2) {
            return false;

        }


        return false;
    }

}
