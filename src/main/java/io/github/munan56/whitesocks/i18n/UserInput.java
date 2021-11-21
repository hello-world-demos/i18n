package io.github.munan56.whitesocks.i18n;

import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class UserInput {

    private String name;

    @Min(value = 2, message = I18nErrors.USER_VALUE_MIN_2)
    private String age;


}
