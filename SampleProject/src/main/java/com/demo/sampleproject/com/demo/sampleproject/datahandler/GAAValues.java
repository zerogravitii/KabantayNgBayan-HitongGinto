package com.demo.sampleproject.com.demo.sampleproject.datahandler;

/**
 * Created by kevinpanuelos on 11/16/13.
 */
public class GaaValues {

    public static final String APP_ID = "528710895e13db245f366503";

    public static enum APPRO_TYPE {
        NEW ("new_appro"),
        AUTO ("auto_appro");

        private final String param;

        private APPRO_TYPE (String parameter) {
            this.param = parameter;
        }

        public String getParam(){
            return this.param;
        }

    }

}
