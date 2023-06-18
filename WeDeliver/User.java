import java.util.ArrayList;
import java.util.List;

public class User {
        private String username;
        private String password;
        private List<String> rewards;
        private List<String> bookclubs;
        private List<String> books;
        private List<String> friends;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
            this.friends = new ArrayList<>();
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public List<String> getRewards() {
            return rewards;
        }

        public List<String> getBookclubs() {
            return bookclubs;
        }

        public List<String> getBooks() {
            return books;
        }

        public List<String> getFriends() {
            return friends;
        }

        public void setRewards(List<String> rewards) {
            this.rewards = rewards;
        }

        public void setBookclubs(List<String> bookclubs) {
            this.bookclubs = bookclubs;
        }
         public void addBookClub(String name) {
    
        bookclubs.add(name);
        }

        public void setBooks(List<String> books) {
            this.books = books;
        }

        public void setFriends(List<String> friends) {
            this.friends = friends;
        }
        public void addFriend(String name) {
    
        friends.add(name);
    }
        
    }