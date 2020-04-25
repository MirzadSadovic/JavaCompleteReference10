package poglavlje37javabeans;

import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

//Bean information class (klasa koja pruza informacije o zrnu)
public class ColorsBeanInfo extends SimpleBeanInfo{
    @Override
    public PropertyDescriptor[] getPropertyDescriptors(){
        try{
            PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
            PropertyDescriptor propertyDescriptor[] = {rectangular};
            return propertyDescriptor;
        }catch(Exception e){
            System.out.println("Došlo je do izuzetka. " + e);
        }
        return null;
    }
}
