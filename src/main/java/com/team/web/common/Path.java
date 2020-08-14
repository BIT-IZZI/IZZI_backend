package com.team.web.common;

public enum Path {
    UPLOAD_PATH;
    @Override
    public String toString() {
        String result = "";
        switch(this) {
            case UPLOAD_PATH:
                result = "C:\\Users\\bit\\Documents\\backend\\src\\main\\resources\\static\\images\\";
                break;

        }

        return result;
    }
}
