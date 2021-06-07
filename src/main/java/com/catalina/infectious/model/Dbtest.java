package com.catalina.infectious.model;

import java.io.Serializable;
import lombok.Data;

/**
 * dbtest
 * @author 
 */
@Data
public class Dbtest implements Serializable {
    private Integer id;

    private String testColumn;

    private static final long serialVersionUID = 1L;
}