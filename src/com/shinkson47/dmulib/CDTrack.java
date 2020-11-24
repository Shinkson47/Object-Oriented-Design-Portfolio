package com.shinkson47.dmulib;

import java.io.Serializable;

/**
 * Abstract representation of a single CD track's meta data.
 *
 * Does NOT store audio data or a file pointer.
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray</a>
 * @version 1
 */
public class CDTrack implements Serializable {

    //#region properties
    /**
     * The string title (<i>name</i>) of the track.
     * <br><br>
     * i.e Only Love
     */
    private String title;

    /**
     * The artist(s) responsible.
     * <br><br>
     * i.e Ben Howard
     */
    private String artist;

    /**
     * Length, <i>in seconds</i>, of the track.
     */
    private int duration;
    //#endregion


    //#region get/set
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    /**
     * Sets the duration, in seconds, of the track.
     *
     * Defaults to 0 if <i>duration</i> is below 0.
     * @param duration Length, <i>in seconds</i>, of the track.
     */
    public void setDuration(int duration) {
        this.duration = Math.max(duration, 0);
    }

    //#endregion

    //#region constructor
    /**
     * Creates an un-instantiated CDTrack.
     * <br><br>
     * Hidden and deprecated.
     * @deprecated CD Track should be instantiated with data.
     */
    @Deprecated
    public CDTrack(){
        this("","",0);
    }

    /**
     * Creates a new CD Track with an unknown artist, and a length of 0.
     * @param _title Title of the track.
     */
    public CDTrack(String _title){
        this(_title,"unknown artist");
    }

    /**
     * Creates a new CD Track with a specified artist and title, with a duration of 0.
     * @param _title The string title (<i>name</i>) of the track. i.e Only Love
     * @param _artist The artist(s) responsible. i.e Ben Howard
     */
    public CDTrack(String _title, String _artist) {
        this(_title, _artist, 0);
    }

    /**
     * Creates a new CD Track with a specified artist, title, and duration
     * @param _title Title of the track
     * @param _artist The artist(s) responsible. i.e Ben Howard
     * @param _duration Length, <i>in seconds</i>, of the track.
     */
    public CDTrack(String _title, String _artist, int _duration) {
        setTitle(_title);
        setArtist(_artist);
        setDuration(_duration);
    }
    //#endregion


    /**
     * @return A string representation of this track's metadata in the format: <br>
               <i><u>CDTrack:[Title=Only Love, Artist=Ben Howard, Duration=249]</u></i>
     */
    @Override
    public String toString() {
        return "CDTrack:["
                + "Title=" + getTitle()
                + ", Artist=" + getArtist()
                + ", Duration=" + getDuration()
                + "]";
    }
}
