package com.chapter.two.innerClass;

public class Run {
    public static void main(String[] args){
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordVale");
        System.out.println(publicClass.getUsername() + " "
                + publicClass.getPassword());
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + " "
                + privateClass.getAddress());
    }
}
