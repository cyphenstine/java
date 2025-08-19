class LibraryManagement{
    public static void main(String[] args){

    }
}

class Book{

    private String title;
    private String author;
    private boolean availability;
    
    // this is called a constructor:

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.availability = true;
    }
    
    // getter methods:

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public boolean idAvailable(){
        return this.availability;
    }

    // setter 
}

class Members{

    private String name;
    private String userID;

    Members(String name, String userID){
        this.name = name;
        this.userID = userID;
    }

    public String getName(){
        return this.name;
    }
    public String getUserID(){
        return this.userID;
    }
}

class Library{

    private String userID;
    private String title;

    Library(String userId, String title){
        this.userID = userId;
        this.title = title;
    }

    Book bk = new Book(title, null);
    Members mb = new Members(null, userID);

    
}
