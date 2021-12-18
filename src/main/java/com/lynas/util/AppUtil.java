package com.lynas.util;

import com.lynas.dto.ResultDTO;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import static com.lynas.util.AppConstant.*;

public class AppUtil {

    public ResultDTO stringToResultDTO(String str){
        String[] eachResult = str.split(CSV_SEPARATOR);
        return new ResultDTO(
                eachResult[0],
                Double.parseDouble(eachResult[1].trim()),
                Double.parseDouble(eachResult[2].trim()),
                Double.parseDouble(eachResult[3].trim()),
                Double.parseDouble(eachResult[4].trim()),
                Double.parseDouble(eachResult[5].trim()),
                Double.parseDouble(eachResult[6].trim()),
                Double.parseDouble(eachResult[7].trim()),
                Double.parseDouble(eachResult[8].trim()),
                Double.parseDouble(eachResult[9].trim()),
                getSecondsStringTime(eachResult[10].trim())
        );
    }
    Double getSecondsStringTime(String time) {
        String[] timeInArray = time.split(TIME_SEPARATOR);
        int minutes = Integer.parseInt(timeInArray[0]);
        double seconds = Double.parseDouble(timeInArray[1]);
        return (minutes * 60) + seconds;
    }

    public static void loadApplicationConfig() {
        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            A_100_METER = Double.parseDouble(prop.getProperty("config.a.100m"));
            B_100_METER = Double.parseDouble(prop.getProperty("config.b.100m"));
            C_100_METER = Double.parseDouble(prop.getProperty("config.c.100m"));
            A_LONG_JUMP = Double.parseDouble(prop.getProperty("config.a.longjump"));
            B_LONG_JUMP = Double.parseDouble(prop.getProperty("config.b.longjump"));
            C_LONG_JUMP = Double.parseDouble(prop.getProperty("config.c.longjump"));
            A_SHOT_PUT = Double.parseDouble(prop.getProperty("config.a.shortput"));
            B_SHOT_PUT = Double.parseDouble(prop.getProperty("config.b.shortput"));
            C_SHOT_PUT = Double.parseDouble(prop.getProperty("config.c.shortput"));
            A_HIGH_JUMP = Double.parseDouble(prop.getProperty("config.a.highjump"));
            B_HIGH_JUMP = Double.parseDouble(prop.getProperty("config.b.highjump"));
            C_HIGH_JUMP = Double.parseDouble(prop.getProperty("config.c.highjump"));
            A_400_METER = Double.parseDouble(prop.getProperty("config.a.400m"));
            B_400_METER = Double.parseDouble(prop.getProperty("config.b.400m"));
            C_400_METER = Double.parseDouble(prop.getProperty("config.c.400m"));
            A_110_METER = Double.parseDouble(prop.getProperty("config.a.110m"));
            B_110_METER = Double.parseDouble(prop.getProperty("config.b.110m"));
            C_110_METER = Double.parseDouble(prop.getProperty("config.c.110m"));
            A_THROW = Double.parseDouble(prop.getProperty("config.a.throw"));
            B_THROW = Double.parseDouble(prop.getProperty("config.b.throw"));
            C_THROW = Double.parseDouble(prop.getProperty("config.c.throw"));
            A_POLE = Double.parseDouble(prop.getProperty("config.a.pole"));
            B_POLE = Double.parseDouble(prop.getProperty("config.b.pole"));
            C_POLE = Double.parseDouble(prop.getProperty("config.c.pole"));
            A_JAVELIN = Double.parseDouble(prop.getProperty("config.a.javelin"));
            B_JAVELIN = Double.parseDouble(prop.getProperty("config.b.javelin"));
            C_JAVELIN = Double.parseDouble(prop.getProperty("config.c.javelin"));
            A_1500_METER = Double.parseDouble(prop.getProperty("config.a.1500m"));
            B_1500_METER = Double.parseDouble(prop.getProperty("config.b.1500m"));
            C_1500_METER = Double.parseDouble(prop.getProperty("config.c.1500m"));

            TIME_SEPARATOR = prop.getProperty("csv.time.separator");
            CSV_SEPARATOR = prop.getProperty("csv.item.separator");

            XML_FILE_LOCATION = prop.getProperty("xml.file.path");
            XML_FILE_NAME = prop.getProperty("xml.file.name");
            INPUT_CSV_LOCATION = prop.getProperty("input.csv.location");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
