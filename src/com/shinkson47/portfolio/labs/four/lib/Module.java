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
    public static final int ASSERTED_TOTAL = 100;
    //#endregion
    //#region fields
    private String code;
    private String name;
    private int examWeight;
    private int cwkWeight;
    //#endregion

    //#region constructor
    public Module() {
        this("CTEC0000","");
    }

    public Module(String code, String name) {
        this(code, name, 50);
    }

    public Module(String code, String name, int examWeight) {
        this(code, name, examWeight,0);
    }

    public Module(String code, String name, int examWeight, int cwkWeight) {
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

    protected void setExamWeight() {
        this.examWeight = assertFromTotal(cwkWeight);
    }

    public void setExamWeight(int examWeight) {
        this.examWeight = examWeight;
        setCwkWeight();
    }

    protected void setCwkWeight() {
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

    protected int assertFromTotal(int val){
        return ASSERTED_TOTAL - val;
    }
    //#endregion get/set


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
