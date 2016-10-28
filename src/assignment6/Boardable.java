/**
 * Created by xuzhi on 10/28/2016.
 */
public interface Boardable {
    public void setBoardStart(int month, int day, int year);
    public void setBoardEnd(int month, int day, int year);
    public boolean boarding(int month, int day, int year);

}
