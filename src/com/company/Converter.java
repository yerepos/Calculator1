package com.company;

public interface Converter<T,S> {
     S convert(T t);
}
