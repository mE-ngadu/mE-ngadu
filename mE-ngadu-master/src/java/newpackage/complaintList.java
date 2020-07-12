/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author user
 */
public class complaintList {

    String cate, comp, id, date;


    public complaintList(String cate, String comp, String id, String date) {
        this.cate = cate;
        this.comp = comp;
        this.id = id;
        this.date = date;
    }

    public String getCate() {
        return cate;
    }

    public String getComp() {
        return comp;
    }

    public String getId() {
        return id;
    }
    public String getDate() {
        return date;
    }
}
