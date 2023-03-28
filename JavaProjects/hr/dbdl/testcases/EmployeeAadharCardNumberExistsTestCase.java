import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.exceptions.*;
public class EmployeeAadharCardNumberExistsTestCase
{
public static void main(String gg[])
{
String aadharCardNumber=gg[0];
try
{
System.out.println("Aadhar card number : "+aadharCardNumber+" exists : "+new EmployeeDAO().aadharCardNumberExists(aadharCardNumber));
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}