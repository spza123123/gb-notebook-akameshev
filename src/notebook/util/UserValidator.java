package notebook.util;

import notebook.model.User;

public class UserValidator {
    public String isNameValid(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Вы не ввели данные");
        }
        return name.trim().replace(" ","");
    }
//    public boolean isIdEmpty(Long id){
//        if (id == null) throw new RuntimeException("Id null");
//        return String.valueOf(id).isEmpty();
//    }
}
