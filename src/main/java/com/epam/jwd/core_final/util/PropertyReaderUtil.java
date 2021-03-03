package com.epam.jwd.core_final.util;

import com.epam.jwd.core_final.domain.ApplicationProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class PropertyReaderUtil {

    private static final Properties properties = new Properties();

    private PropertyReaderUtil() {
    }

    /**
     * try-with-resource using FileInputStream
     *
     * @see {https://www.netjstech.com/2017/09/how-to-read-properties-file-in-java.html for an example}
     * <p>
     * as a result - you should populate {@link ApplicationProperties} with corresponding
     * values from property file
     */
    public static String loadProperties(String parameter) {
        final String propertiesFileName = "resource/application.properties";
        try {
            properties.load(new FileInputStream(propertiesFileName));
            return properties.getProperty(parameter);
        } catch (IOException e) {
            System.out.println("Properties file doesn't exist");
            System.exit(1);
        }
        return null;
    }
}
