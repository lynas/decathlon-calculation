package com.lynas;

import com.lynas.dto.AthleteDTO;
import com.lynas.service.CompetitionService;
import com.lynas.util.AppUtil;

import java.util.List;

import static com.lynas.util.AppConstant.INPUT_CSV_LOCATION;


public class Main {
    public static void main(String[] args) {
        AppUtil.loadApplicationConfig();
        CompetitionService service = new CompetitionService();

        List<AthleteDTO> athleteListWithCalculatedTotalPoints = service.calculateAthleteTotalPoint(INPUT_CSV_LOCATION);
        List<AthleteDTO> athleteListSortedByPoints = service.sortAthleteByTotalPoints(athleteListWithCalculatedTotalPoints);
        service.writeCalculationResultToXML(athleteListSortedByPoints);
    }

}




