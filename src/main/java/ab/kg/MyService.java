package ab.kg;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Altynbek on 28.12.2020.
 */
@Repository
@Transactional
public class MyService {
    @Autowired
    SessionFactory sessionFactory;

    public void save(){
        for(int i=0;i<10;i++){
            MyTestEntity myTestEntity = new MyTestEntity();
            String random = "aloha :"+i;
            myTestEntity.setU_name(random);
            sessionFactory.getCurrentSession().save(myTestEntity);
        }
    }
    public List getAllEntities(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(MyTestEntity.class);
        List l = criteria.list();
        return l;
    }

}
