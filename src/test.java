import sun.security.jca.GetInstance;
import sun.util.resources.LocaleData;

import java.time.Instant;
import java.util.Date;

public enum test {
    haha("a"),xixi("b");
    private String value;
    public String getValue(){
        return this.value;
    };
    private test(String v){
        this.value=v;
    }
    public static void  main(String[] args) {
        System.out.println(test.haha.getValue());
        System.out.println(new Date());
        System.out.println(Instant.now());

    }
}
