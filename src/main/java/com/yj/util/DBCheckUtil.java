package com.yj.util;

import com.alibaba.fastjson.JSONObject;
import com.yj.bean.DBCheckBean;
import com.yj.bean.DBCheckResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBCheckUtil {
    public static String validate(String preValidateSql) {
        //json转List<DBCheckBean>
        List<DBCheckBean> dbCheckBeans = JSONObject.parseArray(preValidateSql, DBCheckBean.class);
        List<DBCheckResult> dbCheckResultList = new ArrayList<DBCheckResult>();
        for (DBCheckBean bean : dbCheckBeans) {
            String no = bean.getNo();
            String sql = bean.getSql();
//          SQL执行，查询结果
            Map<String, Object> columnLableAndValuesMaps;
            try {
                columnLableAndValuesMaps = JDBCUtil.query(sql, null);
                DBCheckResult dbCheckResult = new DBCheckResult();
                dbCheckResult.setNo(no);
                dbCheckResult.setColumnLablesAndValues(columnLableAndValuesMaps);
                dbCheckResultList.add(dbCheckResult);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //将List集合结果 转化为json数组
        String result = JSONObject.toJSONString(dbCheckResultList);
        return result;
    }

    public static void main(String[] args){
        List<DBCheckResult> res=new ArrayList<DBCheckResult>();
        DBCheckResult demo=new DBCheckResult();
        demo.setNo("1123");
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("1","123123132132");
        demo.setColumnLablesAndValues(map);
        res.add(demo);

        System.out.println(JSONObject.toJSONString(res));
    }
}
