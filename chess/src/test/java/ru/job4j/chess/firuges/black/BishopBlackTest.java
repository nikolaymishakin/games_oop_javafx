package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Cell cell = Cell.E3;
        BishopBlack bishopBlack = new BishopBlack(cell);
        Cell testPosition = bishopBlack.position();
        assertThat(testPosition, is(cell));
    }

    @Test
    public void way() {
        BishopBlack bishopBlackStart = new BishopBlack(Cell.C1);
        Cell[] cells = bishopBlackStart.way(Cell.G5);
        Cell[] expectedCells = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(cells, is(expectedCells));
    }

    @Test
    public void copy() {
        Cell nextCell = Cell.G2;
        BishopBlack bishopBlackStart = new BishopBlack(Cell.F1);
        Figure bishopBlackFinish = bishopBlackStart.copy(nextCell);
        assertThat(nextCell, is(bishopBlackFinish.position()));
    }
}
