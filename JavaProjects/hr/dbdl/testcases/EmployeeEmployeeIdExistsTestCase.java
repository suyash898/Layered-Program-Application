import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.exceptions.*;
public class EmployeeEmployeeIdExistsTestCase
{
public static void main(String gg[])
{
String employeeId=gg[0];
try
{
System.out.println("Employee Id. : "+employeeId+" exists : "+new EmployeeDAO().EmployeeIdExists(employeeId));
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}