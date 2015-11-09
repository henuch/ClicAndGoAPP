package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import BusinessDelegator.UserServicesDelegate;
import entities.Ticket;
import entities.User;





public class UserTableModel extends AbstractTableModel {

    List<User> users;
    String[] entete = {"userId", "name","surname", "email", "password"};

    public UserTableModel(String name, String surname, String email, String password) {
        users = UserServicesDelegate.doFindAllUsers();
    }
 public UserTableModel(){
     users = UserServicesDelegate.doFindAllUsers();
 }
 
 

    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: {
                return users.get(rowIndex).getUserId();
            }
            case 1: {
                return users.get(rowIndex).getName();
            }
            case 2: {
                return users.get(rowIndex).getSurname();

            }
            case 3: {
                return users.get(rowIndex).getEmail();
            }
            case 4: {
                return users.get(rowIndex).getPassword();

            }
            default:
                throw new IllegalArgumentException();

        }
    }

    @Override
    public String getColumnName(int column) {

        return entete[column];

    }

   
    public List<User> searchUsers(  int id) {

        User users = UserServicesDelegate.findUserById(id);
        List<User> searchUsers = new ArrayList<>();
        List<User> resultList = new ArrayList<>();;

        
        
        
        
        return searchUsers;
    }

}