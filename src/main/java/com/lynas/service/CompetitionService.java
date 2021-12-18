package com.lynas.service;

import com.lynas.dto.ResultDTO;
import com.lynas.dto.ResultListDTO;
import com.lynas.util.AppUtil;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.lynas.util.AppConstant.XML_FILE_LOCATION;
import static com.lynas.util.AppConstant.XML_FILE_NAME;

public class CompetitionService {

    public List<ResultDTO> calculateResult(String fileName) {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            return stream.filter(it -> !it.trim().isEmpty())
                     .map(it -> new AppUtil().stringToResultDTO(it))
                     .map(r -> new PointCalculatorService().calculate(r))
                     .sorted((r1, r2) -> r2.getTotalScore().compareTo(r1.getTotalScore()))
                     .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error accessing data from input file");
        }
    }

    public List<ResultDTO> sortResultByPoints(List<ResultDTO> resultList) {
        for (ResultDTO resultDTO : resultList) {
            resultDTO.setPlace(nextPlace());
        }
        return resultList;
    }

    public void writeCalculationResultToXML(List<ResultDTO> resultList) {
        new WriteDataToXMLService<ResultListDTO>().writeDataToXMLFile(XML_FILE_LOCATION, XML_FILE_NAME,
                new ResultListDTO(resultList), ResultListDTO.class);
    }

    int position = 1;
    String nextPlace() {
        return "" + position++;
    }

}
