/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_ws;

import java.util.ArrayList;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author acerPC
 */
@WebService(serviceName = "Bank")
public class Bank {

    MainController m = new MainController();

  
    
    @WebMethod(operationName = "CheckAvailability")
    public boolean CheckAvailability(@WebParam(name = "field") String field, @WebParam(name = "value") String value, @WebParam(name = "table") String table) throws Exception {
        return control.CheckAvailability(field, value, table);
    }

    
    @WebMethod(operationName = "DisplayEmployees")
    public ArrayList<String> DisplayEmployees() throws Exception {
        return m.DisplayEmployees();
    }

    
    @WebMethod(operationName = "SelectEmployee")
    public String[] SelectEmployee(@WebParam(name = "username") String username) throws Exception {
        return m.DisplayEmployees(username);
    }

    
    @WebMethod(operationName = "CreateEmployee")
    public int CreateEmployee(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password) throws Exception {
        return m.CreateEmployee(name, position, username, password);
    }

    
    @WebMethod(operationName = "EditEmployee")
    public int editEmployee(@WebParam(name = "name") String name, @WebParam(name = "position") String position, @WebParam(name = "username") String username, @WebParam(name = "password") String password) throws Exception {
        return m.editEmployee(name, position, username, password);
    }

    
    @WebMethod(operationName = "DeleteEmployee")
    public int DeleteEmployee(@WebParam(name = "username") String username) throws Exception {
        return m.DeleteEmployee(username);
    }

    @WebMethod(operationName = "DisplayCustomer")
    public ArrayList<String> DisplayCustomer() throws Exception {
        return m.DisplayCustomer();
    }
    
    @WebMethod(operationName = "SelectCustomer")
    public String[] SelectCustomer(@WebParam(name = "accountNumber") String accountNumber) throws Exception {
        return m.SelectCustomer(accountNumber);
    }
    
    @WebMethod(operationName = "CreateCustomer")
    public int CreateCustomer(@WebParam(name = "name") String name, @WebParam(name = "birthDate") String birthDate, @WebParam(name = "address") String address, @WebParam(name = "mobile") String mobile, @WebParam(name = "email") String email, @WebParam(name = "accountType") String accountType, @WebParam(name = "accountNumber") String accountNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "balance") double balance, @WebParam(name = "card") String card) throws Exception {
        return m.CreateCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, sortCode, balance, card);
    }
    
    @WebMethod(operationName = "EditCustomer")
    public int EditCustomer(@WebParam(name = "name") String name, @WebParam(name = "birthDate") String birthDate, @WebParam(name = "address") String address, @WebParam(name = "mobile") String mobile, @WebParam(name = "email") String email, @WebParam(name = "accountType") String accountType, @WebParam(name = "accountNumber") String accountNumber, @WebParam(name = "sortCode") String sortCode, @WebParam(name = "balance") double balance, @WebParam(name = "card") String card) throws Exception {
        return m.EditCustomer(name, birthDate, address, mobile, email, accountType, accountNumber, sortCode, balance, card);
    }
    
    @WebMethod(operationName = "DeleteCustomer")
    public int DeleteCustomer(@WebParam(name = "accountNumber") String accountNumber) throws Exception {
        return m.DeleteCustomer(accountNumber);
    }
    
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) throws Exception {
        return m.login(username, password);
    }

    @WebMethod(operationName = "logout")
    public void logout() {
        m.logout();
    }
}
