package com.shinkson47.portfolio.labs.four.lib;

/**
 * <h1>A University Course Module</h1>
 * <br>
 * <p>
 * Including the name, module code, and examination weighting.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/10/2020</a>
 * @version 1
 * @since v1
 */
public class Module {
    //#region constants
    /**
     * The maximum that {@link this#examWeight} & {@link this#cwkWeight} may sum to.
     */
    public static final int ASSERTED_TOTAL_WEIGHT = 100;
    //#endregion

    //#region fields
    private String code;
    private String name;
    private int examWeight;
    private int cwkWeight;
    //#endregion

    //#region constructor

    /**
     * Creates a new module with no code, name, or weighting.
     *
     * @deprecated - modules should be initialised with data.
     */
    @Deprecated
    public Module() {
        this("CTEC0000","");
    }

    /**
     * Creates a module with the specified <b>code</b> & <b>name</b>.
     * <br>
     * <p>
     *    Weighting is defaulted to 50 : ASSERTED_TOTAL_WIGHT - 50.
     * </p>
     * @param code The module code <i>i.e. CTEC1905</i>
     * @param name Name of the module <i>i.e. Computer Law and Cyber Security</i>.
     */
    public Module(String code, String name) {
        this(code, name, 50);
    }

    /**
     * Creates a module with the specified <b>code</b>, <b>name</b> & <b>weight</b>.
     * <br>
     * <p>
     *    Weighting is configured to <i>examWeight</i> : ASSERTED_TOTAL_WIGHT - <i>examWeight</i>.
     * </p>
     * @param code The module code <i>i.e. CTEC1905</i>
     * @param name Name of the module <i>i.e. Computer Law and Cyber Security</i>.
     * @param examWeight Examination weight of the module. Also infers the cwk weight.
     */

    public Module(String code, String name, int examWeight) {
        this.code = code;
        this.name = name;
        this.examWeight = examWeight;
        setCwkWeight();
    }
    //#endregion

    //#region get/set
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setExamWeight() {
        this.examWeight = assertFromTotal(cwkWeight);
    }

    public void setExamWeight(int examWeight) {
        this.examWeight = examWeight;
        setCwkWeight();
    }

    private void setCwkWeight() {
        this.cwkWeight = assertFromTotal(examWeight);
    }

    public void setCwkWeight(int cwkWeight) {
        this.cwkWeight = cwkWeight;
        setExamWeight();
    }


    public int getCwkWeight() {
        return cwkWeight;
    }


    public int getExamWeight() {
        return examWeight;
    }

    private int assertFromTotal(int val){
        return ASSERTED_TOTAL_WEIGHT - val;
    }
    //#endregion get/set


    /**
     * {@inheritDoc}
     * @return a string representation of the module.
     */
    @Override
    public String toString() {
        return "Module:[" +
                "code=" + code +
                ", name=" + name +
                ", examWeight=" + examWeight +
                ", cwkWeight=" + cwkWeight +
                ']';
    }
}
