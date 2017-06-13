package ru.imetrica.response;

import ru.imetrica.model.User;

/**
 * Ответ регистрации
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
public class AuthRegisterResponse extends DefaultResponse 
{
    private class UserItem implements IData 
    {
        public long id;
        private String email;
        
        public void setId(long id) {
            this.id = id;
        }
        public long getId() {
            return id;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    } 
    
    public void setUser(User User) 
    {
        UserItem UserItem = new UserItem();
        UserItem.setId(User.getId());
        UserItem.setEmail(User.getEmail());
        this.data = UserItem;
        this.setResult(true);
    }
    
}
