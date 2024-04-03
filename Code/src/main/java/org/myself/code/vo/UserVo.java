package org.myself.code.vo;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class UserVo {
    @NotNull
    private int id;
    @Max(9)
    private String username;
    @Max(19)
    @Min(7)
    @NotBlank(message = "密码不能为空！！！")
    private String password;
    @Email(message = "不是正确的邮件格式")
    public String email;
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}