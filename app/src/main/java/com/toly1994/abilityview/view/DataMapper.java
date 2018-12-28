package com.toly1994.abilityview.view;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/12/28 0028:12:21<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：数据映射抽象类
 */
public class DataMapper {
    protected String[] mapper;

    public DataMapper(String[] mapper) {
        if (mapper.length != 5) {
          throw new IllegalArgumentException("the length of mapper must be 5");
        }
        this.mapper = mapper;
    }

    public String[] getMapper() {
        return mapper;
    }

    /**
     * 数值与字符串的映射关系
     *
     * @param mark 数值
     * @return 字符串
     */
    public String abilityMark2Str(int mark) {
        if (mark <= 100 && mark > 80) {
            return mapper[0];
        } else if (mark <= 80 && mark > 60) {
            return mapper[1];

        } else if (mark <= 60 && mark > 40) {
            return mapper[2];

        } else if (mark <= 40 && mark > 20) {
            return mapper[3];

        } else if (mark <= 20 && mark > 0) {
            return mapper[4];
        }
        return "∞";
    }
}
