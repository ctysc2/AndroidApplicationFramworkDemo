package example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;
//Dao自动生成工具类
public class MyDaoGenerator {

    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1001, "com.framwork.demo.giftedframwork.dao");
        schema.enableKeepSectionsByDefault();
        addUserInfo(schema);
        new DaoGenerator().generateAll(schema, "./app/src/main/java/");
    }

    private static void addUserInfo(Schema schema){
        Entity subscriptionItem = schema.addEntity("UserInfo");
        subscriptionItem.addStringProperty("id").primaryKey();
        subscriptionItem.addStringProperty("nickname");
        subscriptionItem.addStringProperty("headurl");
    }
}
