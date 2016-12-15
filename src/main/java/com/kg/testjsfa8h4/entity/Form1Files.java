package com.kg.testjsfa8h4.entity;
// Generated Dec 15, 2016 10:08:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Form1Files generated by hbm2java
 */
@Entity
@Table(name="form1_files"
    ,catalog="testjsfa8h4"
)
public class Form1Files  implements java.io.Serializable {


     private Integer id;
     private Form1 form1;
     private String fileName;
     private String fileDate;
     private byte[] fileData;

    public Form1Files() {
    }

    public Form1Files(Form1 form1, String fileName, String fileDate, byte[] fileData) {
       this.form1 = form1;
       this.fileName = fileName;
       this.fileDate = fileDate;
       this.fileData = fileData;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_FORM1", nullable=false)
    public Form1 getForm1() {
        return this.form1;
    }
    
    public void setForm1(Form1 form1) {
        this.form1 = form1;
    }

    
    @Column(name="FILE_NAME", nullable=false, length=50)
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    
    @Column(name="FILE_DATE", nullable=false, length=50)
    public String getFileDate() {
        return this.fileDate;
    }
    
    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }

    
    @Column(name="FILE_DATA", nullable=false)
    public byte[] getFileData() {
        return this.fileData;
    }
    
    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }




}


