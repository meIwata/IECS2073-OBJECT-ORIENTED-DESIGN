package java1117;

public class Hello {
    public static void main(String[] args) {
        java1117.fcu.lib.query.Query query1 = new java1117.fcu.lib.query.Query(); // 名字衝突到了就把前面的package寫出來
        query1.display();

        Query query2 = new Query();
        query2.display();
    }
}
