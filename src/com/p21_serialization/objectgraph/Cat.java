package com.p21_serialization.objectgraph;

import java.io.Serializable;

public class Cat implements Serializable {

    Rat rat = new Rat();
}
