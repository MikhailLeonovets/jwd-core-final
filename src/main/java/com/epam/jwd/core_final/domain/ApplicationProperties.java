package com.epam.jwd.core_final.domain;

import com.epam.jwd.core_final.util.PropertyReaderUtil;

/**
 * This class should be IMMUTABLE!
 * <p>
 * Expected fields:
 * <p>
 * inputRootDir {@link String} - base dir for all input files
 * outputRootDir {@link String} - base dir for all output files
 * crewFileName {@link String}
 * missionsFileName {@link String}
 * spaceshipsFileName {@link String}
 * <p>
 * fileRefreshRate {@link Integer}
 * dateTimeFormat {@link String} - date/time format for {@link java.time.format.DateTimeFormatter} pattern
 */
public class ApplicationProperties {
    //todo
    private final String inputRootDir = PropertyReaderUtil.loadProperties("inputRootDir");
    private final String outputRootDir = PropertyReaderUtil.loadProperties("outputRootDir");
    private final String crewFileName = PropertyReaderUtil.loadProperties("crewFileName");
    private final String missionsFileName = PropertyReaderUtil.loadProperties("missionsFileName");
    private final String spaceshipsFileName = PropertyReaderUtil.loadProperties("spaceshipsFileName");
    private final int fileRefreshRate = Integer.parseInt(PropertyReaderUtil.loadProperties("inputRootDir"));
    private final String dateTimeFormat = PropertyReaderUtil.loadProperties("dateTimeFormat");

    public String getInputRootDir() {
        return inputRootDir;
    }

    public String getOutputRootDir() {
        return outputRootDir;
    }

    public String getCrewFileName() {
        return crewFileName;
    }

    public String getMissionsFileName() {
        return missionsFileName;
    }

    public String getSpaceshipsFileName() {
        return spaceshipsFileName;
    }

    public int getFileRefreshRate() {
        return fileRefreshRate;
    }

    public String getDateTimeFormat() {
        return dateTimeFormat;
    }
}
