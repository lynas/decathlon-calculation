package com.lynas;

import com.lynas.dto.ResultDTO;
import com.lynas.service.CompetitionService;
import com.lynas.util.AppUtil;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        AppUtil.loadApplicationConfig();
        String fileName = "results.csv";

        CompetitionService service = new CompetitionService();

        List<ResultDTO> resultList = service.calculateResult(fileName);
        List<ResultDTO> resultListSorted = service.sortResultByPoints(resultList);

        service.writeCalculationResultToXML(resultListSorted);
    }

}




