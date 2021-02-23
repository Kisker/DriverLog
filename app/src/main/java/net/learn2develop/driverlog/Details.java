package net.learn2develop.driverlog;

import android.graphics.drawable.Drawable;

public class Details {

    private String details1, details2, details3, details4, details5;
    private Drawable image1, image2, image3, image4;

    public Details(String details1, String details2, String details3, String details4, String details5, Drawable image1, Drawable image2, Drawable image3, Drawable image4) {
        this.details1 = details1;
        this.details2 = details2;
        this.details3 = details3;
        this.details4 = details4;
        this.details5 = details5;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
    }

    public String getDetails1() {
        return details1;
    }

    public String getDetails2() {
        return details2;
    }

    public String getDetails3() {
        return details3;
    }

    public String getDetails4() {
        return details4;
    }

    public String getDetails5() {
        return details5;
    }

    public Drawable getImage1() {
        return image1;
    }

    public Drawable getImage2() {
        return image2;
    }

    public Drawable getImage3() {
        return image3;
    }

    public Drawable getImage4() {
        return image4;
    }
}
