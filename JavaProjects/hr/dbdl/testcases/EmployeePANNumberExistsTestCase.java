import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.exceptions.*;
public class EmployeePANNumberExistsTestCase
{
public static void main(String gg[])
{
String panNumber=gg[0];
try
{
System.out.println("PAN number : "+panNumber+" exists : "+new EmployeeDAO().panNumberExists(panNumber));
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}