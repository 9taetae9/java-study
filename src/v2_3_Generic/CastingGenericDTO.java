package v2_3_Generic;

import java.io.Serializable;

public class CastingGenericDTO<T> implements Serializable {
    private T object;

    public void setObject(T object){
        this.object = object;
    }

    public T getObject(){
        return object;
    }
}
