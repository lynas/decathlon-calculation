package com.lynas.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "result_list")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultListDTO {

    @XmlElement(name = "result")
    private List<ResultDTO> resultDTOList = null;

    public ResultListDTO() {
    }

    public ResultListDTO(List<ResultDTO> resultDTOList) {
        this.resultDTOList = resultDTOList;
    }

    public List<ResultDTO> getResultDTOList() {
        return resultDTOList;
    }

    public void setResultDTOList(List<ResultDTO> resultDTOList) {
        this.resultDTOList = resultDTOList;
    }

    @Override
    public String toString() {
        return "ResultList{" +
                "resultDTOList=" + resultDTOList +
                '}';
    }
}
