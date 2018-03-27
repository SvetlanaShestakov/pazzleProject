package course.puzzle;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class PuzzleTest {

    @Test
    public void badTestNumberOfStraightEdges(){
        List<PuzzlePiece> puzzleList = new ArrayList<PuzzlePiece>();
        PuzzlePiece p1 = new PuzzlePiece(1,1,1,1,1);
        puzzleList.add(p1);
         Puzzle bad = new Puzzle(puzzleList);

        assertFalse(bad.validateNumberOfStraightEdges(1,1));
    }

    @Test
    public void goodTestNumberOfStraightEdges(){
        List<PuzzlePiece> puzzleList = new ArrayList<PuzzlePiece>();
        PuzzlePiece p1 = new PuzzlePiece(1,0,1,1,1);
        puzzleList.add(p1);
        Puzzle good = new Puzzle(puzzleList);

        assertTrue(good.validateNumberOfStraightEdges(1,1));
    }

}
