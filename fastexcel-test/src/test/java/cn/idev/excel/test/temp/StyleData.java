package cn.idev.excel.test.temp;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Jiaju Zhuang
 **/
@Getter
@Setter
@EqualsAndHashCode
public class StyleData {
    
    private byte[] byteValue;
    
    private Byte[] byteValue2;
    
    private byte byteValue1;
    
    private Byte byteValue4;
    
    private byte byteValue3;
    
    private String[] ss;
    
    private List<String> s1s;
}
