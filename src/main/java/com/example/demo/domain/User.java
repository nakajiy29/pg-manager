package com.example.demo.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    @NotBlank(message = "苗字を入力してください")
    @Size(max = 50, message = "50文字以内で入力してください")
    private String lastname;

    @NotBlank(message = "名前を入力してください")
    @Size(max = 50, message = "50文字以内で入力してください")
    private String firstname;

    @NotBlank(message = "生年月日を入力してください")
    @Pattern(regexp = "19[0-9]{2}|20[0-9]{2}", message = "生年月日を入力してください")
    private String year;

    @NotBlank(message = "生年月日を入力してください")
    @Pattern(regexp = "[1-9]|1[0-2]", message = "生年月日を入力してください")
    private String month;

    @NotBlank(message = "生年月日を入力してください")
    @Pattern(regexp = "[1-9]|[12][0-9]|3[01]", message = "生年月日を入力してください")
    private String day;

    private String name;
    private String birthday;
    private String userId;
}
