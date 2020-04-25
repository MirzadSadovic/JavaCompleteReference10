package poglavlje37javabeans;

//Prikazuje propertije i evente
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class IntrospectorDemo {

    public static void main(String[] args) {
        
        try{
            Class<?> c = Class.forName("Colors");
            BeanInfo beanInfo = Introspector.getBeanInfo(c);
            
            System.out.println("Properties:");
            PropertyDescriptor propertyDescriptor[] = beanInfo.getPropertyDescriptors();
            for(int i =0; i<propertyDescriptor.length; i++){
                System.out.println("\t" + propertyDescriptor[i].getName());
            }
            
            System.out.println("Events:");
            EventSetDescriptor eventSetDescriptor[] = beanInfo.getEventSetDescriptors();
            for(int i =0; i < eventSetDescriptor.length; i++){
                System.out.println("\t" + propertyDescriptor[i].getName());
            }
        }catch(Exception e){
            System.out.println("Došlo je do izuzetka " + e);
        }
    }
}
