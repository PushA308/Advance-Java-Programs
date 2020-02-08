import java.beans.*;
import java.lang.reflect.Method;

public class TempInfo extends SimpleBeanInfo{
	public PropertyDescriptor[] getPropertyDescriptors(){
		try{
			PropertyDescriptor temp = new PropertyDescriptor("temp",Temperature.class);
			PropertyDescriptor pd[] = {temp};
			return pd;
		}catch(Exception e){
			System.out.println("Exception thrown.");
		}
		return null;
	}
	public MethodDescriptor[] getMethodDescriptors(){
		try{
			Class cl = Temperature.class;
			Class args = {};
			Method cToF = c1.getMethod("cToF",args);
			MethodDescriptor cToFDesc = new MethodDescriptor(cToF);
			cToFDesc.setShortDescription("Convert Celcius to Fahrenheit");
			Method fToC = cl.getMethod("fToC",args);
			MethodDescriptor fToCDesc = new MethodDescriptor(fToC);
			fToCDesc.setShortDescription("Convert Fahrenheit to Celcius");
			MethodDescriptor[] md = {cTOFDesc,fToCDesc};
			return md;
		}catch(Exception e){
			System.out.println("Exception thrown..!");
		}
		return null; 			 		
	}
}