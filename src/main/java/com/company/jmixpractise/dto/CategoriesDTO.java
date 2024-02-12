package com.company.jmixpractise.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@JmixEntity(name = "jmix_CategoriesDTO")
public class CategoriesDTO {

    @Id
    @JmixGeneratedValue
    @JsonProperty(value = "@id")
    private Integer id;

    private String label;
    private String auditorEmail;
    private String auditorEmailMonetaryLow;

    public Integer getId() {
        return id;
    }






    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAuditorEmail() {
        return auditorEmail;
    }

    public void setAuditorEmail(String auditorEmail) {
        this.auditorEmail = auditorEmail;
    }

    public String getAuditorEmailMonetaryLow() {
        return auditorEmailMonetaryLow;
    }

    public void setAuditorEmailMonetaryLow(String auditorEmailMonetaryLow) {
        this.auditorEmailMonetaryLow = auditorEmailMonetaryLow;
    }

    public String getAuditorEmailMonetaryMiddle() {
        return auditorEmailMonetaryMiddle;
    }

    public void setAuditorEmailMonetaryMiddle(String auditorEmailMonetaryMiddle) {
        this.auditorEmailMonetaryMiddle = auditorEmailMonetaryMiddle;
    }

    public String getAuditorEmailMonetaryHigh() {
        return auditorEmailMonetaryHigh;
    }

    public void setAuditorEmailMonetaryHigh(String auditorEmailMonetaryHigh) {
        this.auditorEmailMonetaryHigh = auditorEmailMonetaryHigh;
    }

    private String auditorEmailMonetaryMiddle;
    private String auditorEmailMonetaryHigh;
}