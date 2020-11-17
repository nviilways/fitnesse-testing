public class Sizecheck {
    private float size;
    private float disksize;


    public Sizecheck() {
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setDisksize(float disksize) {
        this.disksize = disksize;
    }

    public String checkSize(){
        if(size > disksize){
            return "Disk full";
        }
        else{
            return "Good to go";
        }
    }
    
}
