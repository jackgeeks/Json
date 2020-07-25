package pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: jackgeeks
 * @ProjectName: json
 * @Package: pojo
 * @ClassName: Person
 * @Description: @todo
 * @CreateDate: 2020/7/26 1:33
 * @Version: 1.0
 */
@NoArgsConstructor
@Data
public class Person {
    private String name;
    private FullName fullName;
    private int age;
    private Date birthday;
    private List<String> hobbies;
    private Map<String, String> clothes;
    private List<Person> friends;

    // getter/setter省略

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Person [name=" + name + ", fullName=" + fullName + ", age="
                + age + ", birthday=" + birthday + ", hobbies=" + hobbies
                + ", clothes=" + clothes + "]\n");
        if (friends != null) {
            str.append("Friends:\n");
            for (Person f : friends) {
                str.append("\t").append(f);
            }
        }
        return str.toString();
    }
}
