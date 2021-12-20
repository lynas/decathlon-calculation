package com.lynas;

import com.lynas.dto.ResultDTO;
import com.lynas.service.CompetitionService;
import com.lynas.util.AppUtil;

import java.util.List;

import static com.lynas.util.AppConstant.INPUT_CSV_LOCATION;


public class Main {
    public static void main(String[] args) {
        AppUtil.loadApplicationConfig();
        CompetitionService service = new CompetitionService();

        List<ResultDTO> resultList = service.calculateResult(INPUT_CSV_LOCATION);
        List<ResultDTO> resultListSorted = service.sortResultByPoints(resultList);
        service.writeCalculationResultToXML(resultListSorted);
    }

}




