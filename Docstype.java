public class Docstype {
    private String filetype;

    public Docstype() {
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String checkType(){
        if(filetype.equals(".pdf") || filetype.equals(".docx") || filetype.equals(".xls") || filetype.equals(".ppt")){
            return "Ok";
        }
        else{
            return "Not document";
        }
    }
}
