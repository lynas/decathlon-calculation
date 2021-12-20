package com.lynas.service;

import com.lynas.dto.AthleteDTO;

import static com.lynas.util.AppConstant.*;

public class PointCalculatorService {
    public AthleteDTO calculateTotalPoints(AthleteDTO athleteDTO) {
        double totalScore = 0.0;
        totalScore += calculatePoint(A_100_METER, B_100_METER, C_100_METER, athleteDTO.getRun100Meter());
        totalScore += calculatePoint(A_LONG_JUMP, B_LONG_JUMP, C_LONG_JUMP, athleteDTO.getLongJump()*100);
        totalScore += calculatePoint(A_SHOT_PUT, B_SHOT_PUT, C_SHOT_PUT, athleteDTO.getShotPut());
        totalScore += calculatePoint(A_HIGH_JUMP, B_HIGH_JUMP, C_HIGH_JUMP, athleteDTO.getHighJump()*100);
        totalScore += calculatePoint(A_400_METER, B_400_METER, C_400_METER, athleteDTO.getRun400Meter());
        totalScore += calculatePoint(A_110_METER, B_110_METER, C_110_METER, athleteDTO.getHurdles110Metres());
        totalScore += calculatePoint(A_THROW, B_THROW, C_THROW, athleteDTO.getDiscusThrow());
        totalScore += calculatePoint(A_POLE, B_POLE, C_POLE, athleteDTO.getPoleVault()*100);
        totalScore += calculatePoint(A_JAVELIN, B_JAVELIN, C_JAVELIN, athleteDTO.getJavelinThrow());
        totalScore += calculatePoint(A_1500_METER, B_1500_METER, C_1500_METER, athleteDTO.getRun1500Meter());
        athleteDTO.setTotalScore(totalScore);
        return athleteDTO;
    }

    public Double calculatePoint(Double valueA, Double valueB, Double valueC, Double valueP) {
        return Math.floor(valueA * Math.pow(Math.abs(valueP - valueB), valueC));
    }
}
