package com.shinkson47.portfolio.labs.four.lib;

/**
 * <h1>Representation of a rectangle</h1>
 * <br>
 * <p>
 * A square which can be of different lengths on two axis only.
 *
 * Such that a rectangle has four sides, A, B, C, D
 * <blockquote>
 * <br>   <span>|-A-|</span>
 * <br>   <span>D#B</span>
 * <br>   <span>|-C-|</span>
 * </blockquote>
 * <br>
 * where A & C must be equal, but can remain independant of the other equal pair, B & D.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/10/2020</a>
 * @version 1
 * @since v1
 */
public class Rectangle {

    //#region fields
    /**
     * <h2>Width of the rectanble</h2>
     * The size of the x axis.
     * Effects sides D & B only.
     */
    private int width;

    /**
     * <h2>Height of the rectanble</h2>
     * The size of the y axis.
     * Effects sides A & C only.
     */
    private int height;

    /**
     * <h2>Y Position</h2>
     * Top of the rectangle is offset from the top of the display port by y.
     */
    private int y;

    /**
     * <h2>X Position</h2>
     * Left of the rectangle is offset from the left of the display port by y.
     */
    private int x;
    //#endregion

    //#region constructor


    /**
     * Creates a rectangle with <b>width</b> & <b>height</b>,
     * with no offset.
     * @param width of the rectangle
     * @param height of the rectangle
     */
    public Rectangle(int width, int height) {
        this(width, height, 0, 0);
    }

    /**
     * Creates a rectangle with <b>width</b> & <b>height</b>, and offset by
     * <b>y</b> & <b>x</b>
     * @param width of the rectangle
     * @param height of the rectangle
     * @param y y offset
     * @param x x offset
     */
    public Rectangle(int width, int height, int y, int x) {
        setWidth(width);
        setHeight(height);
        setY(y);
        setX(x);
    }

    //#endregion

    //#region get/set

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //#endregion

    //#region methods

    //#endregion

}
