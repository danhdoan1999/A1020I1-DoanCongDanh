package case_study.furama_resort.controllers;

public class ExceptionCustomer extends Exception {
    static boolean nameCustomer(String nameCus) throws Exception{
    final String REGEX_NAME_CUSTOMER = "^([^a-z0-9 ][a-z]+( )?)*$";
    if (nameCus.matches(REGEX_NAME_CUSTOMER)){
        return true;
    }else{
        throw new Exception();
    }
}
    static boolean emailException(String emailCus) throws Exception{
     final String REGEX_EMAIL_CUSTOMER = "^[a-z0-9-_]+[@]{1}[a-z]+[.]{1}[a-z]+$";
     if (emailCus.matches(REGEX_EMAIL_CUSTOMER)){
         return true;
     }else{
         throw new Exception();
     }
    }
    static boolean idCardException(String cmndCus) throws Exception {
        final String REGEX_ID_CUSTOMER = "^[0-9]{3}[ ]{1}[0-9]{3}[ ]{1}[0-9]{3}$";
        if (cmndCus.matches(REGEX_ID_CUSTOMER)){
            return true;
        }else {
            throw new Exception();
        }
    }
    static  String genderException(String gender) throws Exception {
        if (gender.equalsIgnoreCase("Male")){
            return "Male";
        }else if (gender.equalsIgnoreCase("Female")){
            return "Female";
        }else if (gender.equalsIgnoreCase("Unknow")){
            return "Unknow";
        }else {
            throw new Exception();
        }
    }
    static Boolean birthdayException(String birthday) throws Exception {
        final String REGEX_BIRTH_CUSTOMER = "^[0-9]{2}[\\/]{1}[0-9]{2}[\\/]{1}[0-9]{4}$";
        if (birthday.matches(REGEX_BIRTH_CUSTOMER)){
            return true;
        }else{
            throw new Exception();
        }
    }
}
