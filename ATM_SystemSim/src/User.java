public class User {
    private String userFirstName, userLastName;
    private int id , password, acount;

    User (String userFirstName1, String userLastName1, int id1, int password1, int acount1){
            this.userFirstName =  userFirstName1;
            this.userLastName = userLastName1;
            this.id= id1;
            this.password = password1;
            this.acount = acount1;


    }

    public int getAcount() {
        return acount;
    }

    public void setAcount(int acount) {
        this.acount = acount;
    }
}
