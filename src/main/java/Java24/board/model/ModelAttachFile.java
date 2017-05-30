package Java24.board.model;

import java.util.Arrays;
import java.util.Date;

public class ModelAttachFile {
    private Integer attachfileno= null;  //` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    private String  filename    = "";    //` VARCHAR(50) NOT NULL,
    private String  filetype    = "";    //` VARCHAR(30) NULL DEFAULT NULL,
    private Integer filesize    = null;  //` INT(11) NULL DEFAULT NULL,
    private Integer articleno   = null;  //` INT(11) NULL DEFAULT NULL,
    private Boolean UseYN       = null;  //` TINYINT(1) NULL DEFAULT '1',
    private String  InsertUID   = "";    //` VARCHAR(40) NULL DEFAULT NULL,
    private Date    InsertDT    = null;  //` DATETIME NULL DEFAULT NULL,
    private String  UpdateUID   = "";    //` VARCHAR(40) NULL DEFAULT NULL,
    private Date    UpdateDT    = null;  //` DATETIME NULL DEFAULT NULL,
    private Byte[]  imageData   = null;  //` LONGBLOB NULL,

    public ModelAttachFile() {
        super();
    }
    @Override
    public String toString() {
        return "ModelAttachFile [attachfileno=" + attachfileno + ", filename="
                + filename + ", filetype=" + filetype + ", filesize=" + filesize
                + ", articleno=" + articleno + ", UseYN=" + UseYN
                + ", InsertUID=" + InsertUID + ", InsertDT=" + InsertDT
                + ", UpdateUID=" + UpdateUID + ", UpdateDT=" + UpdateDT
                + ", imageData=" + Arrays.toString(imageData) + "]";
    }
    public Integer getAttachfileno() {
        return attachfileno;
    }
    public void setAttachfileno(Integer attachfileno) {
        this.attachfileno = attachfileno;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getFiletype() {
        return filetype;
    }
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    public Integer getFilesize() {
        return filesize;
    }
    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }
    public Integer getArticleno() {
        return articleno;
    }
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    public Boolean getUseYN() {
        return UseYN;
    }
    public void setUseYN(Boolean useYN) {
        UseYN = useYN;
    }
    public String getInsertUID() {
        return InsertUID;
    }
    public void setInsertUID(String insertUID) {
        InsertUID = insertUID;
    }
    public Date getInsertDT() {
        return InsertDT;
    }
    public void setInsertDT(Date insertDT) {
        InsertDT = insertDT;
    }
    public String getUpdateUID() {
        return UpdateUID;
    }
    public void setUpdateUID(String updateUID) {
        UpdateUID = updateUID;
    }
    public Date getUpdateDT() {
        return UpdateDT;
    }
    public void setUpdateDT(Date updateDT) {
        UpdateDT = updateDT;
    }
    public byte[] getImageData() {
        return imageData;
    }
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }
    
    
}
