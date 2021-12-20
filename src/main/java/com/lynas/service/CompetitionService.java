package com.lynas.service;

import com.lynas.dto.AthleteDTO;
import com.lynas.dto.AthletesDTO;
import com.lynas.util.AppUtil;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.lynas.util.AppConstant.XML_FILE_LOCATION;
import static com.lynas.util.AppConstant.XML_FILE_NAME;

public class CompetitionService {

    public List<AthleteDTO> calculateAthleteTotalPoint(String fileName) {
        AppUtil appUtil = new AppUtil();
        PointCalculatorService service = new PointCalculatorService();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            return stream.filter(it -> !it.trim().isEmpty())
                     .map(appUtil::stringToAthleteDTO)
                     .map(service::calculateTotalPoints)
                     .sorted((r1, r2) -> r2.getTotalScore().compareTo(r1.getTotalScore()))
                     .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error accessing data from input file");
        }
    }

    public List<AthleteDTO> sortAthleteByTotalPoints(List<AthleteDTO> athleteList) {
        for (AthleteDTO athlete : athleteList) {
            athlete.setPlace(nextPlace());
        }
        return athleteList;
    }

    public void writeCalculationResultToXML(List<AthleteDTO> athleteList) {
        new WriteDataToXMLService<AthletesDTO>().writeDataToXMLFile(XML_FILE_LOCATION, XML_FILE_NAME,
                new AthletesDTO(athleteList), AthletesDTO.class);
    }

    int position = 1;
    String nextPlace() {
        return "" + position++;
    }

}
