package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void whenPositionIsC8() {
        Cell expectedPosition = Cell.C8;
        BishopBlack firstBishop = new BishopBlack(expectedPosition);
        Cell currentPosition = firstBishop.position();
        assertThat(currentPosition).isEqualTo(expectedPosition);
    }

    @Test
    void whenCopyIsC8ToG8() {
        Cell firstPosition = Cell.C8;
        Cell secondPosition = Cell.G8;
        BishopBlack firstBishop = new BishopBlack(firstPosition);
        Figure secondBishop = firstBishop.copy(secondPosition);
        Cell currentPosition = secondBishop.position();
        assertThat(currentPosition).isEqualTo(secondPosition);
    }

    @Test
    void whenWayC1ToG5() {
        Cell startPosition = Cell.C1;
        Cell endPosition = Cell.G5;
        Cell[] expectedCells = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        BishopBlack firstBishop = new BishopBlack(startPosition);
        firstBishop.way(endPosition);
        assertThat(firstBishop.way(endPosition)).isEqualTo(expectedCells);
    }
}