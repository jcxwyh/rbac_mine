package pro.onlyou.rbac.mine.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class DeptVO {

    private Integer id;

    @NotBlank(message = "")
    @Length(min=2,max=10,message = "")
    private String name;

    @NotNull(message = "")
    private Integer seq;

    @Length(max=200,message = "")
    private String remark;

    private Integer parentId;
}
