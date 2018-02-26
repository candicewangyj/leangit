  package com.briup.mvnbook.helloworld;
  import org.junit.Test;
  import static org.junit.Assert.assertEquals;
  public class HelloWorldTest{
          
          @Test
           public void testSayHello(){
                   HelloWorld h=new HelloWorld();
                   String s=h.sayHello();
                   System.out.println("in test say helllo");
                  assertEquals("hello maven",s);
          }
  }
