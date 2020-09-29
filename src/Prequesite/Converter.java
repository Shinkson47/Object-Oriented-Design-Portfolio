package Prequesite;

import com.shinkson47.opex.backend.runtime.errormanagement.LoggerUtils;

/**
 * Provided introductory test / example, modified to be functional.
 *
 * @author De Montfort University (Luke Attwood?), Modified by Jordan Gray.
 */
public class Converter {

    //#region constants
    private static final String DEG_CENTI = " degrees Centigrade ";                                                     //      For ease of printing temps in either direction.
    private static final String DEG_FEHR = " degrees Fahrenheit ";
    //#endregion

    //#region executable
    /**
     * JRE Entry
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        printAsFahrenheit(21);                                                                                //        Print 21C as F.
        printAsCentigrade(convertToFahrenheit(21));                                                           //        Convert 21C to F, then print the conversion of the result back to C.
    }
    //#endregion

    //#endregion methods
    /**
     * Prints a conversion of the parsed <c>centigrade</c> to <c>fahrenheit</c>
     * @param centigrade to convert and print.
     */
    public static void printAsFahrenheit(float centigrade) {
        printConversion(false,                                                                                   // PARAM: false,      We're printing as F, not C.
                        centigrade,                                                                                     //        centigrade, base value
                        convertToFahrenheit(centigrade));                                                               //        conversion, result to print.
    }

    /**
     * Prints a conversion of the parsed <c>fahrenheit</c> to <c>centigrade</c>
     * @param fahrenheit to convert and print.
     */
    public static void printAsCentigrade(float fahrenheit) {
        printConversion(true,                                                                                    // PARAM: true,       We're print as C
                        fahrenheit,                                                                                     //        fahrenheit, base value
                        convertToCentigrade(fahrenheit));                                                               //        conversion, result to print
    }

    /**
     * Prints a conversion between <c>c & f</c>
     * @param isCenti Value is converted to Centigrade? (base = F && conv = C) = true ;; (base = C && conv = F) = false
     * @param base Value prior to conversion
     * @param conv Conversion result
     */
    public static void printConversion(boolean isCenti, float  base, float  conv) {
        String baseString = (isCenti) ? DEG_FEHR : DEG_CENTI;                                                           //          Unlocalized string for base value
        String convString = (isCenti) ? DEG_CENTI : DEG_FEHR;                                                           //                             for conversion result
        LoggerUtils.log(base + baseString + "= " + conv + convString);                                                  // OPEX:    Use Logging utility to store and print.
    }
    //#endregion

    //#region functions
    /**
     * Converts a provided temp in <c>C</c> to <C>F</C>
     *
     * @param centigrade temperature to convert
     * @return Fahrenheit equivelent of <c>centigrade</c>
     */
    public static float convertToFahrenheit(float  centigrade){
        return centigrade * 9 / 5 + 32;                                                                                 // RETURN:  c => f  ((C × 9/5) + 32 = F)
    }

    /**
     * Converts a provided temp in <c>F</c> to <C>C</C>
     *
     * @param fahrenheit temperature to convert
     * @return Centigrade equivelent of <c>fahrenheit</c>
     */
    public static float convertToCentigrade(float  fahrenheit){
        return (fahrenheit - 32) * 5 / 9;                                                                               // RETURN: f => c  ((F − 32) × 5/9 = C)
    }
    //#endregion


}