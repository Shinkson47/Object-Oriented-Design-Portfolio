package com.shinkson47.portfolio.labs.six.composition.main;

import com.shinkson47.portfolio.labs.six.startingplayer.lib.Name;
import com.shinkson47.portfolio.labs.six.startingplayer.lib.PairOfDice;

/**
 * <h1>Portfolio A.1; A player composed of a name, and a hand of dice.</h1>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/10/2020</a>
 * @version 1
 * @since v1
 */
public class Player {

    //#region constants
    /**
     * <h2>The gamertag used when none is supplied.</h2>
     */
    public static final String DEFAULT_GAMER_TAG = "NullTag";

    //#endregion

    //#region fields
    /**
     * <h2>The hand of dice this player can use.</h2>
     * private; locally managed field.
     */
    private PairOfDice hand;

    /**
     * <h2>The name of the player</h2>
     * public; Creating local wrappers for get/set is redundant, {@link Name} already implements them. <br><br>
     * Whilst not final, the Name instance is not expected to be changed. If the name needs to be altered, it can be achieved
     * with {@link Name#setFirstName(String)} and {@link Name#setFamilyName(String)}.
     */
    public Name name;

    /**
     * <h2>The player's gamertag.</h2>
     * Can be considered as a username, nickname, or pseudonym, that identifies them within the game.
     * Is independent to their true identifying name.
     * <br><br>
     * private; Locally managed primitive.
     */
    private String gamerTag;
    //#endregion

    //#region construction

    /**
     * <h2>Creates a blank Player</h2>
     * Who has no name or gamer tag.
     * @see Player#DEFAULT_GAMER_TAG
     */
    public Player(){
        this("", new Name());
    }

    /**
     * Creates a new Player with a specified {@link Player#name} and {@link Player#gamerTag}
     * @param _gamerTag The string representing this {@link Player}'s gamerTag.
     * @param _name The {@link Name) object to be stored as this {@link Player}'s Name.
     */
    public Player(String _gamerTag, Name _name) {
        this(_gamerTag, _name, new PairOfDice());
    }

    /**
     * Creates a new Player with a specified {@link Player#name}, {@link Player#gamerTag} and  {@link Player#hand}
     * @param _gamerTag The string representing this {@link Player}'s gamerTag.
     * @param _name The {@link Name) object to be stored as this {@link Player}'s Name.
     * @param _hand The {@link PairOfDice} object to be stored as this {@link Player}'s hand
     */
    public Player(String _gamerTag, Name _name, PairOfDice _hand){
        gamerTag = _gamerTag;
        name = _name;
        hand = _hand;
    }
    //#endregion


    //#region get/set

    /**
     * <h2>Replaces {@link Player#hand}</h2>
     * Overwrites the existing hand of dice with no notice. <br>
     * Previous hand will be left for garbage collection.
     * @param hand The {@link PairOfDice} to store instead.
     */
    public void setHand(PairOfDice hand) {
        this.hand = hand;
    }

    /**
     * <h2>Replaces {@link Player#name}</h2>
     * Overwrites the existing hand of dice with no notice. <br>
     * Previous hand will be left for garbage collection.
     * @param name The {@link Name} to store instead.
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * <h2>Returns the {@link PairOfDice} that this player holds</h2>
     * @return {link Player#hand}
     */
    public PairOfDice getHand() {
        return hand;
    }

    /**
     * <h2>Returns the {@link Name} of this player</h2>
     * @return {link Player#name}
     */
    public Name getName() {
        return name;
    }

    //#endregion


}
