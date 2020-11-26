public class Q2 implements Comparable<Q2>{
    private String title;
    private String publisher;
    private String author;
    private Double price;
    public static int SortMethod = 1;
    private String checkInvalid(String s, String n){
        if(s == null)
            throw new IllegalArgumentException(n+" cannot be null");
        else if(s.length() == 0)
            throw new IllegalArgumentException(n+" cannot be empty");
        return s;
    }
    private double checkInvalid(double d,String n){
        if(d <= 0){
            throw new IllegalArgumentException(n+" cannot be less than 0");
        }
        return d;
    }
    public Q2(String title, String publisher, String author, Double price) {
        this.title = checkInvalid(title,"Title");
        this.publisher = checkInvalid(publisher,"Publisher");
        this.author = checkInvalid(author,"Author");
        this.price = checkInvalid(price,"Price");
    }
    public String getTitle() {
        return title;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getAuthor() {
        return author;
    }
    public Double getPrice() {
        return price;
    }
    public void setTitle(String title) {
        this.title = checkInvalid(title,"Title");
    }
    public void setPublisher(String publisher) {
        this.publisher = checkInvalid(publisher,"Publisher");
    }
    public void setAuthor(String author) {
        this.author = checkInvalid(author,"Author");
    }
    public void setPrice(Double price) {
        this.price = checkInvalid(price,"Price");
    }

    @Override
    public String toString() {
        return  "Title = " + title + " || " +
                "Publisher = " + publisher + " || " +
                "Author = " + author + " || " +
                "Price = " + price;
    }

    @Override
    public int compareTo(Q2 o) {
        return switch (SortMethod) {
            case 1 -> this.title.compareTo(o.getTitle());
            case 2 -> this.publisher.compareTo(o.getPublisher());
            case 3 -> this.author.compareTo(o.getAuthor());
            case 4 -> (int) Math.signum(this.price - o.getPrice());
            default -> 0;
        };
    }
}
