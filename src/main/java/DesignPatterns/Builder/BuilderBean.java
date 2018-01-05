package DesignPatterns.Builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by AFei on 2017/10/11.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BuilderBean  {
    private int i ;

    public Builder getBuilder(){
        Builder builder = new Builder();
        builder.i = this.i;
        return builder;
    }
//---------------------------> 内部类
    public  class Builder{
        private int i ;

        public Builder i(int i){
            this.i = i;
            return this;
        }

        public BuilderBean getBuilderBean(){
            BuilderBean builderBean = new BuilderBean();
            builderBean.i = this.i;
            return builderBean;
        }
    }
}
