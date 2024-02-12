package com.company.jmixpractise.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity(name = "category")
@JmixEntity(name = "category")
public class Category {
    @Id
    @JmixGeneratedValue
    @Column(name = "ID")
    private Integer id;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

    @JmixProperty(mandatory = true)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "LABEL", unique = true)
    private String label;


    static final String VALIDATEEMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @NotNull
    @Size(min = 1, max = 50)
    @Pattern(regexp = VALIDATEEMAIL)
    @Column(name = "AUD_MAIL_FACTUAL")
    private String auditorEmail;

    @NotNull
    @Pattern(regexp = VALIDATEEMAIL)
    @Size(min = 1, max = 50)
    @Column(name = "AUD_MAIL_MONETARY_LOW")
    private String auditorEmailMonetaryLow;

    @NotNull
    @Pattern(regexp = VALIDATEEMAIL)
    @Size(min = 1, max = 50)
    @Column(name = "AUD_MAIL_MONETARY_MID")
    private String auditorEmailMonetaryMiddle;

    @NotNull
    @Pattern(regexp = VALIDATEEMAIL)
    @Size(min = 1, max = 50)
    @Column(name = "AUD_MAIL_MONETARY_HIGH")
    private String auditorEmailMonetaryHigh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
