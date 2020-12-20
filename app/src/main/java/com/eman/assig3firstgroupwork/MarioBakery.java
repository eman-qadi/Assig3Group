package com.eman.assig3firstgroupwork;

public class MarioBakery {

    private final String name;
    private final int idImg;
    private String description;

    public static final MarioBakery[] mariobaber={
            new MarioBakery("aaa",R.drawable._31642184_181355083698158_4373405808194166847_n,""),
            new MarioBakery("bbb",R.drawable._31661239_712241826152548_213117674169081948_n,""),
            new MarioBakery("ccc",R.drawable._31821381_459886521673263_8312067090341635870_n,""),
            new MarioBakery("ddd",R.drawable._31757961_208187874287030_7339819535678295031_n,""),
            new MarioBakery("eee",R.drawable._31642184_181355083698158_4373405808194166847_n,""),
            new MarioBakery("fff",R.drawable._31661239_712241826152548_213117674169081948_n,""),
            new MarioBakery("ggg",R.drawable._31662618_1063088100783538_4856407198701741082_n,""),
    };

    public MarioBakery(String name, int idImg,String description) {
        this.name = name;
        this.idImg = idImg;
        this.description=description;
    }
    public String getName() {
        return name;
    }
    public int getIdImg() {
        return idImg;
    }
    public String getDescription() {
        return description;
    }
}