package com.forsale.adserver.view.screens.beforeDetails.customViews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import com.forsale.adserver.utils.viewsUtils.UtilsKt;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import l8.e;
import l8.j;
import o9.b;
import o9.c;
/* compiled from: ImagesGroup.kt */
/* loaded from: classes2.dex */
public final class ImagesGroup extends LinearLayout {

    /* renamed from: a */
    private final WeakReference<Context> f21110a;

    /* renamed from: b */
    private ArrayList<String> f21111b;

    /* renamed from: c */
    private int f21112c;

    /* renamed from: d */
    private int f21113d;

    /* renamed from: e */
    private int f21114e;

    /* renamed from: f */
    private int f21115f;

    /* renamed from: g */
    private int f21116g;

    /* renamed from: h */
    private boolean f21117h;

    /* renamed from: i */
    private a f21118i;

    /* renamed from: j */
    private int f21119j;

    /* renamed from: x */
    private int f21120x;

    /* renamed from: y */
    private float f21121y;

    /* renamed from: z */
    private int f21122z;

    /* compiled from: ImagesGroup.kt */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b(int i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.i(context, "context");
        this.f21110a = new WeakReference<>(getContext());
        this.f21111b = new ArrayList<>();
        this.f21114e = -1;
        int i11 = e.f62280a;
        this.f21115f = i11;
        this.f21116g = i11;
        this.f21117h = true;
        o.f(attributeSet);
        setAttributes(attributeSet);
    }

    @SuppressLint({"SetTextI18n"})
    private final void d(String str, int i11, int i12) {
        FrameLayout frameLayout;
        Context context = this.f21110a.get();
        if (context != null) {
            frameLayout = new FrameLayout(context);
        } else {
            frameLayout = new FrameLayout(getContext());
        }
        ImageView image = getImage();
        TextView textView = new TextView(this.f21110a.get());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setLayoutParams(layoutParams);
        image.setLayoutParams(layoutParams2);
        image.setColorFilter(this.f21120x);
        textView.setLayoutParams(layoutParams3);
        frameLayout.addView(image);
        frameLayout.addView(textView);
        textView.setTextColor(this.f21114e);
        textView.setTextSize(this.f21113d);
        textView.setText("+ " + i11);
        textView.setGravity(17);
        frameLayout.setOnClickListener(new b(this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" : ");
        sb2.append(i12);
        k(str, image);
        addView(frameLayout);
    }

    public static final void e(ImagesGroup this$0, View view) {
        o.i(this$0, "this$0");
        a aVar = this$0.f21118i;
        if (aVar != null) {
            if (aVar == null) {
                o.w("imageClickListener");
                aVar = null;
            }
            aVar.a();
        }
    }

    private final void f(String str, boolean z11, int i11) {
        LinearLayout.LayoutParams layoutParams;
        ImageView image = getImage();
        if (this.f21111b.size() > getMaxImagesPerScreen()) {
            layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        } else {
            layoutParams = new LinearLayout.LayoutParams(this.f21119j, -1);
        }
        if (!z11) {
            layoutParams.setMarginEnd(this.f21112c);
        }
        image.setLayoutParams(layoutParams);
        image.setOnClickListener(new c(this, i11));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" : ");
        sb2.append(i11);
        if (URLUtil.isValidUrl(str)) {
            k(str, image);
        }
        addView(image);
    }

    public static final void g(ImagesGroup this$0, int i11, View view) {
        o.i(this$0, "this$0");
        a aVar = this$0.f21118i;
        if (aVar != null) {
            if (aVar == null) {
                o.w("imageClickListener");
                aVar = null;
            }
            aVar.b(i11);
        }
    }

    private final ImageView getImage() {
        ImageView imageView = new ImageView(this.f21110a.get());
        for (int i11 = 0; i11 < 7; i11++) {
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    private final int getMaxImagesPerScreen() {
        boolean z11;
        int height;
        int i11 = this.f21122z;
        if (i11 == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            d c11 = UtilsKt.c(this.f21110a.get());
            o.f(c11);
            c11.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f11 = this.f21121y;
            if (f11 == 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                height = (int) f11;
            } else {
                height = getHeight();
            }
            this.f21119j = height;
            return getWidth() / this.f21119j;
        }
        return i11;
    }

    private final void h() {
        int maxImagesPerScreen = getMaxImagesPerScreen();
        if (getMaxImagesPerScreen() < this.f21111b.size()) {
            this.f21117h = true;
        }
        if (1 <= maxImagesPerScreen) {
            boolean z11 = false;
            int i11 = 1;
            while (true) {
                if (i11 == this.f21111b.size()) {
                    z11 = true;
                }
                if (this.f21111b.size() >= i11) {
                    if (i11 != maxImagesPerScreen) {
                        int i12 = i11 - 1;
                        String str = this.f21111b.get(i12);
                        o.h(str, "get(...)");
                        f(str, z11, i12);
                    }
                    if (i11 == maxImagesPerScreen) {
                        int i13 = maxImagesPerScreen - 1;
                        if (this.f21111b.size() - i13 > 0) {
                            int i14 = i11 - 1;
                            String str2 = this.f21111b.get(i14);
                            o.h(str2, "get(...)");
                            d(str2, this.f21111b.size() - i13, i14);
                        } else {
                            int i15 = i11 - 1;
                            String str3 = this.f21111b.get(i15);
                            o.h(str3, "get(...)");
                            f(str3, z11, i15);
                        }
                    }
                }
                if (i11 != maxImagesPerScreen) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void j(ImagesGroup imagesGroup, ArrayList arrayList, a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        imagesGroup.i(arrayList, aVar);
    }

    private final void k(String str, ImageView imageView) {
        s e11 = Picasso.h().l(str).e();
        e11.l(this.f21115f);
        e11.d(this.f21116g);
        e11.g(imageView);
    }

    private final void l() {
        post(new o9.a(this));
    }

    public static final void m(ImagesGroup this$0) {
        o.i(this$0, "this$0");
        this$0.getWidth();
        this$0.h();
    }

    private final void setAttributes(AttributeSet attributeSet) {
        Context context = this.f21110a.get();
        o.f(context);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j.f62353a, 0, 0);
        o.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f21120x = obtainStyledAttributes.getColor(j.f62354b, getResources().getColor(l8.c.f62274b));
        this.f21114e = obtainStyledAttributes.getColor(j.f62355c, getResources().getColor(l8.c.f62275c));
        this.f21113d = (int) obtainStyledAttributes.getDimension(j.f62356d, getResources().getDimension(l8.d.f62277a));
        this.f21112c = (int) obtainStyledAttributes.getDimension(j.f62357e, getResources().getDimension(l8.d.f62278b));
        this.f21121y = getResources().getDimension(l8.d.f62279c);
    }

    public final boolean getHaveMorePics() {
        return this.f21117h;
    }

    public final int getImageErrorDrawable() {
        return this.f21116g;
    }

    public final int getImagePlaceHolder() {
        return this.f21115f;
    }

    public final ArrayList<String> getImagesList() {
        return this.f21111b;
    }

    public final int getSpaceBetweenImages() {
        return this.f21112c;
    }

    public final int getTextColor() {
        return this.f21114e;
    }

    public final int getTextSize() {
        return this.f21113d;
    }

    public final void i(ArrayList<String> imagesUrls, a aVar) {
        o.i(imagesUrls, "imagesUrls");
        this.f21111b = imagesUrls;
        if (aVar != null) {
            this.f21118i = aVar;
        }
        l();
    }

    public final void setHaveMorePics(boolean z11) {
        this.f21117h = z11;
    }

    public final void setImageErrorDrawable(int i11) {
        this.f21116g = i11;
    }

    public final void setImagePlaceHolder(int i11) {
        this.f21115f = i11;
    }

    public final void setImagesList(ArrayList<String> arrayList) {
        o.i(arrayList, "<set-?>");
        this.f21111b = arrayList;
    }

    public final void setListener(a onImageClicked) {
        o.i(onImageClicked, "onImageClicked");
        this.f21118i = onImageClicked;
    }

    public final void setSpaceBetweenImages(int i11) {
        this.f21112c = i11;
    }

    public final void setTextColor(int i11) {
        this.f21114e = i11;
    }

    public final void setTextSize(int i11) {
        this.f21113d = i11;
    }
}
