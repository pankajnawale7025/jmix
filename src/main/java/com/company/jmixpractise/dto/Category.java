package com.company.jmixpractise.dto;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@JmixEntity(name = "jmix_Category")
public class Category {
    @JmixGeneratedValue
    @JmixId
    private Integer id;

    @JmixProperty(mandatory = true)


    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "LABEL", unique = true)
    private String label;



     static final String VALIDATEEMAIL="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

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