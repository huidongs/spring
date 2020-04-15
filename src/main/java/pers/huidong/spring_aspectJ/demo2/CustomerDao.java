package pers.huidong.spring_aspectJ.demo2;

/**
 * @auther huidong
 * @date 2020/4/15 19:40
 */
public interface CustomerDao {
    public void save();
    public String delete();
    public void update();
    public void findAll();
    public void findOne();
}
