package com.lena.model;

/**
 * Created by dmitry on 01.11.17.
 */
public class Ruslan {
    private String hisName;
    private String hisSurName;
    private boolean valid = true;

    public String getHisName() {
        return hisName;
    }

    public void setHisName(String hisName) {
        this.hisName = hisName;
    }

    public String getHisSurName() {
        return hisSurName;
    }

    public void setHisSurName(String hisSurName) {
        this.hisSurName = hisSurName;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
