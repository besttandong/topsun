
package com.topsun.posclient.application.common.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>uploadDataFileResponse complex type�?Java 类�?
 * 
 * <p>以下模式片段指定包含在此类中的预期内容�?
 * 
 * <pre>
 * &lt;complexType name="uploadDataFileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uploadDataFile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadDataFileResponse", propOrder = {
    "uploadDataFile"
})
public class UploadDataFileResponse {

    protected boolean uploadDataFile;

    /**
     * 获取uploadDataFile属�?的�?�?
     * 
     */
    public boolean isUploadDataFile() {
        return uploadDataFile;
    }

    /**
     * 设置uploadDataFile属�?的�?�?
     * 
     */
    public void setUploadDataFile(boolean value) {
        this.uploadDataFile = value;
    }

}
