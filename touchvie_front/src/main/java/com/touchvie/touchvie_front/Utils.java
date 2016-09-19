package com.touchvie.touchvie_front;

/**
 * Created by noemi.leon on 16/09/2016.
 */
public class Utils {

    private static final String NO_MAIN_ERROR ="No main section defined";

    public enum ErrorCode {
        no_main_error(NO_MAIN_ERROR);

        private String error;
        ErrorCode(String error) {
            this.error=error;
        }

        public String getError() {
            return error;
        }
    }



    public static String getError( ErrorCode errorCode){

        return errorCode.getError();

    }



}