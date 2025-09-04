package pe.gob.onpe.stae.sc;

import java.util.ResourceBundle;

public class Val {

    public static final ResourceBundle sP = ResourceBundle.getBundle("pe.gob.onpe.stae.sc.resourcebundles.value");

    private static String _REGEDIT_KEY = "jel";
    private static String _REGEDIT_M_KEY = "master";
    private static String _MESSAGE_ERROR_KEY = "El Sistema operativo no se encuentra configurado para ejecutar la solucion STAE.";

    private static String _M_K;
    private static String _M_K_H;
    private static String _M_K_Z;
    private static String _M_K_P;
    private static String _M_K_T;
    private static String _M_K_U;
    private static String _M_K_Q;
    private static String _M_K_S;

    public static final boolean ENV_CAP = false;
    public static final boolean ENV_SIM = true;
    public static final boolean ENV_PRO = true;
    public static final boolean SEG_VUE = false;
    public static final boolean ENCRIPTY = true;
    public static final boolean SIGN_VISIBLE = true;
    public static final boolean ENV_DEV = false;
    public static boolean ENV_PRINT = true;
    public static boolean ENV_QR = true;
    public static boolean ENV_FACE = true;
    public static boolean ENV_RUB = true;
    public static boolean ENV_MOD = true;

    /**
     * @return the _REGEDIT_KEY
     */
    public static String getREGEDIT_KEY() {
        return _REGEDIT_KEY;
    }

    /**
     * @return the _REGEDIT_M_KEY
     */
    public static String getREGEDIT_M_KEY() {
        return _REGEDIT_M_KEY;
    }

    /**
     * @return the _MESSAGE_ERROR_KEY
     */
    public static String getMESSAGE_ERROR_KEY() {
        return _MESSAGE_ERROR_KEY;
    }

    public static String M_K() {
        return sP.getString("m.k");
    }

    public static String M_K_H() {
        return sP.getString("m.k.h");
    }

    public static String M_K_Z() {
        return sP.getString("m.k.z");
    }

    public static String M_K_P() {
        return sP.getString("m.k.p");
    }

    public static String M_K_U() {
        return sP.getString("m.k.u");
    }

    public static String M_K_T() {
        return sP.getString("m.k.t");
    }

    public static String M_K_Q() { return sP.getString("m.k.q"); }

    public static String M_K_S() { return sP.getString("m.k.s"); }
    /**
     * @return the _M_K
     */
    public static String getM_K() {
        return _M_K;
    }

    /**
     * @param aM_K the _M_K to set
     */
    public static void setM_K(String aM_K) {
        _M_K = aM_K;
    }

    /**
     * @return the _M_K_H
     */
    public static String getM_K_H() {
        return _M_K_H;
    }

    /**
     * @param aM_K_H the _M_K_H to set
     */
    public static void setM_K_H(String aM_K_H) {
        _M_K_H = aM_K_H;
    }

    /**
     * @return the _M_K_Z
     */
    public static String getM_K_Z() {
        return _M_K_Z;
    }

    /**
     * @param aM_K_Z the _M_K_Z to set
     */
    public static void setM_K_Z(String aM_K_Z) {
        _M_K_Z = aM_K_Z;
    }

    /**
     * @return the _M_K_P
     */
    public static String getM_K_P() {
        return _M_K_P;
    }

    /**
     * @param aM_K_P the _M_K_P to set
     */
    public static void setM_K_P(String aM_K_P) {
        _M_K_P = aM_K_P;
    }

    /**
     * @return the _M_K_T
     */
    public static String getM_K_T() {
        return _M_K_T;
    }

    /**
     * @param aM_K_T the _M_K_T to set
     */
    public static void setM_K_T(String aM_K_T) {
        _M_K_T = aM_K_T;
    }

    /**
     * @return the _M_K_U
     */
    public static String getM_K_U() {
        return _M_K_U;
    }

    /**
     * @param aM_K_U the _M_K_U to set
     */
    public static void setM_K_U(String aM_K_U) {
        _M_K_U = aM_K_U;
    }

    /**
     * @return the _M_K_Q
     */
    public static String getM_K_Q() {
        return _M_K_Q;
    }

    /**
     * @param aM_K_Q the _M_K_Q to set
     */
    public static void setM_K_Q(String aM_K_Q) {
        _M_K_Q = aM_K_Q;
    }

    /**
     * @return the _M_K_S
     */
    public static String getM_K_S() {
        return _M_K_S;
    }

    /**
     * @param aM_K_S the _M_K_S to set
     */
    public static void setM_K_S(String aM_K_S) {
        _M_K_S = aM_K_S;
    }

}
