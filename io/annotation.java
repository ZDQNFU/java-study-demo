import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//@Retention则标注了自定义注解的信息要保留到哪个阶段，分别对应的value取值为SOURCE →CLASS→RUNTIME。
@Target(ElementType.ANNOTATION_TYPE)
public @interface annotation {
}
