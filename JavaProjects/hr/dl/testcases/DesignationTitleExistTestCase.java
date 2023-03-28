import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.dao.*;

public class DesignationTitleExistTestCase
{
public static void main(String gg[])
{
String title=gg[0];
try
{
DesignationDAOInterface designationDAO;
designationDAO=new DesignationDAO();
System.out.println(designationDAO.titleExist(title));
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}