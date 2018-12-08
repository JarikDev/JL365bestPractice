package serialization;

import java.io.Serializable;

public class Serialization {
    private static final long serialVersionUID=1;
    Serialization INSTANCE;
    private Object readResolve(){
        return INSTANCE;
    }

}
