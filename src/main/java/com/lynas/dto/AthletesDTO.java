package com.lynas.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "athletes")
@XmlAccessorType(XmlAccessType.FIELD)
public class AthletesDTO {

    @XmlElement(name = "athlete")
    private List<AthleteDTO> athletes = null;

    public AthletesDTO() {
    }

    public AthletesDTO(List<AthleteDTO> athletes) {
        this.athletes = athletes;
    }

    public List<AthleteDTO> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<AthleteDTO> athletes) {
        this.athletes = athletes;
    }
}
