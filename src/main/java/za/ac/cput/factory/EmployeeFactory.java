package za.ac.cput.factory;

import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;
import za.ac.cput.entity.Employee;
import za.ac.cput.entity.Name;
import za.ac.cput.helper.StringHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Breyton Ernstzen (217203027)
  ADP3 - June Assessment 2022
  Date: 9 June 2022
  School Management
 */
public class EmployeeFactory {
    private static final String validation = "^(.+)@(.+)$";

    public static Employee builder(String staffId, String email){
        StringHelper.checkStringParam("",staffId);
        StringHelper.checkStringParam("",email);
        //checks first if the conditions is met.
        //if no staff id is entered or invalid email is entered, it should throw an IllegalArgumentException
        if(staffId.isEmpty() || !email.matches(validation))
            throw new IllegalArgumentException("Some details missing or invalid email(add '@' into your email)");
        return new Employee.Builder()
                .staffId(staffId)
                .email(email)
                .build();

        }
    }

