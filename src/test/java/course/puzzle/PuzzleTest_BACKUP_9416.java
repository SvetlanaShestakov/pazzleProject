package course.puzzle;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class PuzzleTest {

    @Test
<<<<<<< HEAD
    public void testWrongNumberOfStraitEdges(){
        //PuzzlePiece p1 = new PuzzlePiece(1,)
=======
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
>>>>>>> af320c493f40c33bd9e22c512b773bc3ee374691
    }

}
