package com.shinkson47.portfolio.labs.seven.PortfolioPlayer.lib;

/**
 * <h1>Portfolio A.1; A player composed of a name, and a hand of dice.</h1>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/10/2020</a>
 * @version 1
 * @since v1
 */
public class Player implements Rollable, Comparable<Player> {

    //#region constants
    /**
     * <h2>The gamertag used when none is supplied.</h2>
     */
    // private /*static*/ final String DEFAULT_GAMER_TAG = ""; // nO MoRe thAn ThReE FiEldS, nO fIeLdS cAn bE StAtIc!

    //#endregion

    //#region fields
    /**
     * <h2>The hand of dice this player can use.</h2>
     * private; locally managed field.
     */
    private Rollable hand;

    /**
     * <h2>The name of the player</h2>
     * public; Creating local wrappers for get/set is redundant, {@link Name} already implements them. <br><br>
     * Whilst not final, the Name instance is not expected to be changed. If the name needs to be altered, it can be achieved
     * with {@link Name#setFirstName(String)} and {@link Name#setFamilyName(String)}.
     */
    private Name name;

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
        this(new Name(), ""/*DEFAULT_GAMER_TAG*/);
    }

    /**
     * Creates a new Player with a specified {@link Player#name} and {@link Player#gamerTag}
     * @param _gamerTag The string representing this {@link Player}'s gamerTag.
     * @param _name The {@link Name) object to be stored as this {@link Player }'s Name.
     */
    public Player(Name _name, String _gamerTag) {
        this(_name, _gamerTag, new PairOfDice());
    }

    /**
     * Creates a new Player with a specified {@link Player#name}, {@link Player#gamerTag} and  {@link Player#hand}
     * @param _gamerTag The string representing this {@link Player}'s gamerTag.
     * @param _name The {@link Name} object to be stored as this {@link Player}'s Name.
     * @param _hand The {@link Rollable) } object to be stored as this {@link Player }'s hand
     */
    public Player(Name _name, String _gamerTag, Rollable _hand){
        setGamerTag(_gamerTag);
        setName(_name);
        setHand(_hand);
    }
    //#endregion

    //#region get/set

    /**
     * <h2>Replaces {@link Player#hand}</h2>
     * Overwrites the existing hand of dice with no notice. <br>
     * Previous hand will be left for garbage collection.
     * @param hand The {@link Rollable) } to store instead.
     */
    public void setHand(Rollable hand) {
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
     * <h2>Returns the {@link Rollable) } that this player holds</h2>
     * @return {link Player#hand}
     */
    public Rollable getHand() {
        return hand;
    }

    public Rollable getRollable(){
        return getHand(); // I don't like this wrapper; it's dumb.
    }

    /**
     * <h2>Returns the {@link Name} of this player</h2>
     * @return {link Player#name}
     */
    public Name getName() {
        return name;
    }

    public String getGamerTag() {
        return gamerTag;
    }

    public void setGamerTag(String gamerTag) {
        this.gamerTag = gamerTag;
    }
    //#endregion

    //#region Rollable

    /**
     * <h2>Rolls the player's hand of dice.</h2>
     */
    @Override
    public void roll() {
        getHand().roll();
    }

    public void rollDice(){
        roll();                       // Again, dumb. Doesn't match the interface provided but is required for the test.
    }

    /**
     * @return the score of the player's hand.
     */
    @Override
    public int getScore() {
        return getHand().getScore();
    }

    // This is also dumb, but the UML provided doesn't match the interface provided so i chucked it in.

    /**
     * @return the score of the player's hand
     */
    public int getDiceScore(){
        return getScore();
    }

    public void setFullPlayerName(String name) {
        String[] names = name.split(" ");
        if (names.length != 2) return;                        // Not / too many  enough names. First / last only?
        getName().setFirstName(Name.sanitize(names[0]));
        getName().setFamilyName(names[1]);
    }

    public void generateGamerTag(int num) {
        if (num <= 100 && num >= 1)
        setGamerTag(
                Reverse((getName().getFirstName() + getName().getFamilyName())).toLowerCase()
                        + num
        );
    }

    public static String Reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    @Override
    public int compareTo(Player o) {
        int result = getName().compareTo(o.getName());
        result += getGamerTag().compareTo(o.getGamerTag());
        return result;
    }

    //#endregion


    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Player:[" +
                "name="+getName()+
                "gt="+getGamerTag()+
                "r="+getRollable()+
                "]";
    }
}