package net.simplifiedlearning.simplifiedcoding;




//this is very simple class and it only contains the user attributes, a constructor and the getters
// you can easily do this by right click -> generate -> constructor and getters
public class User {

    private int id;
    private String first_name,age,last_name,phone, email,address, gender;

    public User(int id, String first_name,String last_name,String age,String phone,String address, String email, String gender) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
}
