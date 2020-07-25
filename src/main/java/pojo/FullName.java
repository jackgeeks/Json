package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: pojo
 * @ClassName: FullName
 * @Description: @todo
 * @CreateDate: 2020/7/26 1:35
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FullName {
    private String firstName;
    private String middleName;
    private String lastName;


    @Override
    public String toString() {
        return "[firstName=" + firstName + ", middleName="
                + middleName + ", lastName=" + lastName + "]";
    }
}
