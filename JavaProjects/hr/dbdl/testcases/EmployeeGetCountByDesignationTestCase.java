import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.exceptions.*;
public class EmployeeGetCountByDesignationTestCase
{
public static void main(String gg[])
{
int designationCode=Integer.parseInt(gg[0]);
try
{
System.out.println("Number of employees with designation code : "+designationCode+" is "+new EmployeeDAO().getCountByDesignation(designationCode));
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}