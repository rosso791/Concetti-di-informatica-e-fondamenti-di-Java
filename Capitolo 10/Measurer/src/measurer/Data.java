/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package measurer;

/**
 *
 * @author Federico
 */
public class Data {
    
    public static Object max (Object[] anObject, Measurer m){
        if (anObject.length == 0){
            return null;
        }
        Object app = anObject[0];
        for(Object obj : anObject){
            if (m.measure(obj)> m.measure(app)){
                app = obj;
            }
        }
        return app;
    }
}
