package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-08
 * Time: 14:50
 **/
class Student implements Comparable<Student>{
    public String name;
    public String classhome;
    public double score;

    public Student(String name, String classhome, double score) {
        this.name = name;
        this.classhome = classhome;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classhome='" + classhome + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int)(o.score - this.score);
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("小明","智能1701",88.5));
        list.add(new Student("小红","智能1702",68.6));
        list.add(new Student("小绿","智能1703",89.8));
        list.add(new Student("小花","智能1704",98.3));
        System.out.println(list);
        for (Student student : list) {
            System.out.println(student);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
