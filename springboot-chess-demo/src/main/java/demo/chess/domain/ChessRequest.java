
package demo.chess.domain;

import java.io.Serializable;

/**
 * 下棋请求入参

 */
public class ChessRequest implements Serializable {

    private static final long serialVersionUID = 2941116627752203899L;

    private String boardId;

    private Integer[][] board;

    private String[] record;

    /**
     * Getter method for property <tt>boardId</tt>.
     *
     * @return property value of boardId
     */
    public String getBoardId() {
        return boardId;
    }

    /**
     * Setter method for property <tt>boardId</tt>.
     *
     * @param boardId value to be assigned to property boardId
     */
    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    /**
     * Getter method for property <tt>board</tt>.
     *
     * @return property value of board
     */
    public Integer[][] getBoard() {
        return board;
    }

    /**
     * Setter method for property <tt>board</tt>.
     *
     * @param board value to be assigned to property board
     */
    public void setBoard(Integer[][] board) {
        this.board = board;
    }

    /**
     * Getter method for property <tt>record</tt>.
     *
     * @return property value of record
     */
    public String[] getRecord() {
        return record;
    }

    /**
     * Setter method for property <tt>record</tt>.
     *
     * @param record value to be assigned to property record
     */
    public void setRecord(String[] record) {
        this.record = record;
    }
}