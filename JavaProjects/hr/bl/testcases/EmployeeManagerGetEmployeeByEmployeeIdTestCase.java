import com.thinking.machines.hr.bl.exceptions.*;
import com.thinking.machines.hr.bl.interfaces.pojo.*;
import com.thinking.machines.hr.bl.interfaces.managers.*;
import com.thinking.machines.hr.bl.pojo.*;
import com.thinking.machines.hr.bl.managers.*;
import java.util.*;
import java.math.*;
import com.thinking.machines.enums.*;
import java.text.*;
public class EmployeeManagerGetEmployeeByEmployeeIdTestCase
{
public static void main(String gg[])
{
try
{
String employeeId="A10000001";

EmployeeManagerInterface employeeManager;
employeeManager=EmployeeManager.getEmployeeManager();

EmployeeInterface employee;

employee=employeeManager.getEmployeeByEmployeeId(employeeId);

SimpleDateFormat sdf;
sdf=new SimpleDateFormat("dd/MM/yyyy");
System.out.println(employee.getEmployeeId());
System.out.println(employee.getName());
//System.out.println(employee.getDesignationCode());
System.out.println(sdf.format(employee.getDateOfBirth()));
System.out.println(employee.getGender());
System.out.println(employee.getIsIndian());
System.out.println(employee.getBasicSalary().toPlainString());
System.out.println(employee.getPANNumber());
System.out.println(employee.getAadharCardNumber());



}catch(BLException blException)
{
if(blException.hasGenericException())
{
System.out.println(blException.getGenericException());
}
List<String> properties=blException.getProperties();
for(String property:properties)
{
System.out.println(blException.getException(property));
}
}
}
}