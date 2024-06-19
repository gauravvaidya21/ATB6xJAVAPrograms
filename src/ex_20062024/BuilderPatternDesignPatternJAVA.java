package ex_20062024;

public class BuilderPatternDesignPatternJAVA{

    public BuilderPatternDesignPatternJAVA groundFloor(){

        System.out.println("this is ground f");

        return this;
    }

    public BuilderPatternDesignPatternJAVA firstFloor(String name){

        System.out.println("this is first f"+ name);

        return this;
    }

    public  BuilderPatternDesignPatternJAVA secondFloor(String name,String color){

        System.out.println("this is second "+ name + color);

        return this;
    }


    public static void main(String[] args) {
        BuilderPatternDesignPatternJAVA bp= new BuilderPatternDesignPatternJAVA();

        bp.groundFloor().firstFloor("ff").secondFloor("sf","b");
    }
}




