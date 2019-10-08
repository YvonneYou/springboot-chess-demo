
package demo.chess.domain;

import java.io.Serializable;

/**
 * 下棋返回结果

 */
public class ChessResponse implements Serializable {

    private static final long serialVersionUID = 1343074235632113832L;

    private Boolean change;

    private String go;

    private String go2;

    private String keeep;

    /**
     * Getter method for property <tt>change</tt>.
     *
     * @return property value of change
     */
    public Boolean getChange() {
        return change;
    }

    /**
     * Setter method for property <tt>change</tt>.
     *
     * @param change value to be assigned to property change
     */
    public void setChange(Boolean change) {
        this.change = change;
    }

    /**
     * Getter method for property <tt>go</tt>.
     *
     * @return property value of go
     */
    public String getGo() {
        return go;
    }

    /**
     * Setter method for property <tt>go</tt>.
     *
     * @param go value to be assigned to property go
     */
    public void setGo(String go) {
        this.go = go;
    }

    /**
     * Getter method for property <tt>go2</tt>.
     *
     * @return property value of go2
     */
    public String getGo2() {
        return go2;
    }

    /**
     * Setter method for property <tt>go2</tt>.
     *
     * @param go2 value to be assigned to property go2
     */
    public void setGo2(String go2) {
        this.go2 = go2;
    }

    /**
     * Getter method for property <tt>keeep</tt>.
     *
     * @return property value of keeep
     */
    public String getKeeep() {
        return keeep;
    }

    /**
     * Setter method for property <tt>keeep</tt>.
     *
     * @param keeep value to be assigned to property keeep
     */
    public void setKeeep(String keeep) {
        this.keeep = keeep;
    }
}