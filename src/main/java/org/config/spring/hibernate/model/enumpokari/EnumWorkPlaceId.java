/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model.enumpokari;

/**
* POKARI: Sp_Employee
*    - Diinput WorkPlaceId dan SalesId dengan format WorkplaceId-EmployeeId 
*    - SalesId di klasifikasikan :
*     '- EXL = Taking Order
*     '- KVE = Canvass
*     '- OFF = Office
*    - Untuk mengetahui WorkplaceId ada di Sheet WorkPlace Id
* 
*    EMPTY(-1, "", "KOSONG"),
*    TAKING_ORDER(0, "- EXL", "Taking Order"),
*    CANVASS(1, "- KVE", "Canvass"),
*    OFFICE(2, "- OFF", "Office/Karyawan");
*/    
public enum EnumWorkPlaceId {
    EMPTY(-1, "", "KOSONG"),
    TAKING_ORDER(0, "- EXL", "EXL : Taking Order"),
    CANVASS(1, "- KVE", "KVE : Canvass"),
    OFFICE(2, "- OFF", "OFF : Office/Karyawan");
    
    private int intCode;
    private String stringCode;
    private String description;
    
    private EnumWorkPlaceId(int intCode, String strCode, String description){
        this.intCode = intCode;
        this.stringCode = strCode;
        this.description = description;
    
    }
    public String getStrCode(){
        return stringCode;
    }
    public int getIntCode(){
        return intCode;
    }
    public String getDescription(){
        return description;
    }
    
}
