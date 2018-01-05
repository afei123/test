package DesignPatterns.Builder;

/**
 * Created by AFei on 2017/10/11.
 */
public class Main {
    public static void main(String[] args){
        TestBean TestBean = new TestBean();
        TestBean build = TestBean.builder().i(4).build();
        System.out.println(build.getI());
        //------------------------------------>
        BuilderBean builderBean = new BuilderBean();
        BuilderBean builderBean1 = builderBean.getBuilder().i(7).getBuilderBean();
        System.out.println(builderBean1.getI());
    }
}
