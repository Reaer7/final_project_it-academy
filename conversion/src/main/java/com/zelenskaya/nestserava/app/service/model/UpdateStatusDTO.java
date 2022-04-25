package com.zelenskaya.nestserava.app.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import static com.zelenskaya.nestserava.app.service.model.ServiceConstants.APPLICATION_CONV_ID;
import static com.zelenskaya.nestserava.app.service.model.ServiceConstants.MAX_SIZE_FOR_UUID;
import static com.zelenskaya.nestserava.app.service.model.ServiceConstants.MESSAGE_PATTERN_FOR_UUID;
import static com.zelenskaya.nestserava.app.service.model.ServiceConstants.PATTERN_FOR_UUID;
import static com.zelenskaya.nestserava.app.service.model.ServiceConstants.STATUS;

@Getter
@Setter
@EqualsAndHashCode
public class UpdateStatusDTO {
    @JsonProperty(STATUS)
    private StatusEnumDTO status;
    @JsonProperty(APPLICATION_CONV_ID)
    @Size(max = MAX_SIZE_FOR_UUID)
    @NotBlank
    @Pattern(regexp = PATTERN_FOR_UUID,
            message = MESSAGE_PATTERN_FOR_UUID)
    private String applicationConvId;
}
