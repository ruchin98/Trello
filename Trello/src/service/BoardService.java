package service;

import model.Board;

import java.util.List;

public class BoardService {

    public void createBoard(String boardName, List<Board> boardList) {
        Board board = new Board();
        board.setName(boardName);
        boardList.add(board);
    }
}
