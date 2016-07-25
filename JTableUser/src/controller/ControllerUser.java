/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.User;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vuongluis
 */
public class ControllerUser extends AbstractTableModel{

    private JTable table;
    private ArrayList<User> alUser = new ArrayList<>();
    private String[] alCol = {
        "<html><b>Id người dùng</b></html>",
        "<html><b>Tên đăng nhập</b></html>",
        "<html><b>Họ và tên</b></html>",
        "<html><b>Trạng thái</b></html>"
    };
    
    public ControllerUser(JTable tbMain){
        table = tbMain;
        alUser.add(new User(1,"admin","VinaENTER EDU 1",true));
        alUser.add(new User(2,"vinaenter","VinaENTER Editor",false));
        alUser.add(new User(3,"vinaenter1","Nguyên Test 1",true));
        alUser.add(new User(4,"vinaenter1","Nguyên Test 2",true));
        alUser.add(new User(5,"test2","Nguyễn Văn Test",false));
    }
    public void loadTable() {
         table.setModel(this);
        ((JComponent)table.getDefaultRenderer(Boolean.class)).setOpaque(true);     
        
        table.getTableHeader().setPreferredSize(new Dimension(0,30));
        table.setRowHeight(26);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(180);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==0){
            return Integer.class;
        }
        if(columnIndex==3){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex); 
    }
    
    @Override
    public String getColumnName(int column) {
        return alCol[column];
    }
    

    @Override
    public int getRowCount() {
        return alUser.size();
    }

    @Override
    public int getColumnCount() {
        return alCol.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object reObject = null;
        User user = alUser.get(rowIndex);
        switch(columnIndex){
            case 0:
                reObject = user.getId();
                break;
            case 1:
                reObject = user.getUsername();
                break;
            case 2:
                reObject = user.getHoTen();
                break;
            case 3:
                reObject = user.isActive();
                break;
        }
        return reObject;
    }

    public int addItem(User objUser) {
        alUser.add(objUser);
        this.fireTableDataChanged();
        table.scrollRectToVisible(table.getCellRect(this.getRowCount()-1, 0, true));
        return 1;
    }

    public int deleteItem(int id, int row) {
        int rowmodel = table.convertRowIndexToModel(row);
        alUser.remove(rowmodel);
        this.fireTableDataChanged();
        return 1;
    }
}
