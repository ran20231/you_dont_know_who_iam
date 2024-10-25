package com.forsale.app.utils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.net.URLEncoder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import t9.t0;
/* compiled from: TopLevelUtilityFunctions.kt */
/* loaded from: classes3.dex */
public final class TopLevelUtilityFunctionsKt {

    /* compiled from: TopLevelUtilityFunctions.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Snackbar.a {

        /* renamed from: a */
        final /* synthetic */ Snackbar.SnackbarLayout f39650a;

        a(Snackbar.SnackbarLayout snackbarLayout) {
            this.f39650a = snackbarLayout;
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.q
        @SuppressLint({"ClickableViewAccessibility"})
        /* renamed from: d */
        public void a(Snackbar snackbar, int i11) {
            this.f39650a.setOnTouchListener(null);
        }
    }

    /* compiled from: TopLevelUtilityFunctions.kt */
    /* loaded from: classes3.dex */
    public static final class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ Snackbar f39651a;

        /* renamed from: b */
        final /* synthetic */ g00.a<wz.p> f39652b;

        b(Snackbar snackbar, g00.a<wz.p> aVar) {
            this.f39651a = snackbar;
            this.f39652b = aVar;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f11, float f12) {
            kotlin.jvm.internal.o.i(e22, "e2");
            if (f12 > 0.0f && f12 > Math.abs(f11)) {
                this.f39651a.y();
                return true;
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e11) {
            kotlin.jvm.internal.o.i(e11, "e");
            this.f39652b.invoke();
            this.f39651a.y();
            return true;
        }
    }

    /* compiled from: TopLevelUtilityFunctions.kt */
    /* loaded from: classes3.dex */
    public static final class c extends Snackbar.a {

        /* renamed from: a */
        final /* synthetic */ Snackbar.SnackbarLayout f39653a;

        c(Snackbar.SnackbarLayout snackbarLayout) {
            this.f39653a = snackbarLayout;
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.q
        @SuppressLint({"ClickableViewAccessibility"})
        /* renamed from: d */
        public void a(Snackbar snackbar, int i11) {
            this.f39653a.setOnTouchListener(null);
        }
    }

    /* compiled from: TopLevelUtilityFunctions.kt */
    /* loaded from: classes3.dex */
    public static final class d extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ Snackbar f39654a;

        /* renamed from: b */
        final /* synthetic */ g00.a<wz.p> f39655b;

        d(Snackbar snackbar, g00.a<wz.p> aVar) {
            this.f39654a = snackbar;
            this.f39655b = aVar;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f11, float f12) {
            kotlin.jvm.internal.o.i(e22, "e2");
            if (f12 > 0.0f && f12 > Math.abs(f11)) {
                this.f39654a.y();
                return true;
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e11) {
            kotlin.jvm.internal.o.i(e11, "e");
            this.f39655b.invoke();
            this.f39654a.y();
            return true;
        }
    }

    public static final MultipartBody.Part c(String partName, File file) {
        MediaType mediaType;
        kotlin.jvm.internal.o.i(partName, "partName");
        kotlin.jvm.internal.o.i(file, "file");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath()));
        if (mimeTypeFromExtension != null) {
            mediaType = MediaType.Companion.parse(mimeTypeFromExtension);
        } else {
            mediaType = null;
        }
        MultipartBody.Part.Companion companion = MultipartBody.Part.Companion;
        String name = file.getName();
        kotlin.jvm.internal.o.h(name, "getName(...)");
        return companion.createFormData(partName, k(name), RequestBody.Companion.create(file, mediaType));
    }

    public static final MultipartBody.Part d(String partName, File imageFile) {
        MediaType mediaType;
        kotlin.jvm.internal.o.i(partName, "partName");
        kotlin.jvm.internal.o.i(imageFile, "imageFile");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(imageFile.getAbsolutePath());
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (fileExtensionFromUrl == null) {
            fileExtensionFromUrl = "image/*";
        } else {
            kotlin.jvm.internal.o.f(fileExtensionFromUrl);
        }
        String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
        if (mimeTypeFromExtension != null) {
            mediaType = MediaType.Companion.parse(mimeTypeFromExtension);
        } else {
            mediaType = null;
        }
        MultipartBody.Part.Companion companion = MultipartBody.Part.Companion;
        String name = imageFile.getName();
        kotlin.jvm.internal.o.h(name, "getName(...)");
        return companion.createFormData(partName, k(name), RequestBody.Companion.create(imageFile, mediaType));
    }

    public static final Object e(com.bumptech.glide.f<Drawable> fVar, zz.a<? super wz.p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new TopLevelUtilityFunctionsKt$preloadAsync$2(fVar, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (withContext == f11) {
            return withContext;
        }
        return wz.p.f75480a;
    }

    public static final String f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new com.google.gson.d().t(obj);
    }

    public static final void g(View view, int i11, Bitmap image, int i12, g00.a<wz.p> onClick) {
        kotlin.jvm.internal.o.i(view, "view");
        kotlin.jvm.internal.o.i(image, "image");
        kotlin.jvm.internal.o.i(onClick, "onClick");
        Snackbar p02 = Snackbar.p0(view, "", i11);
        kotlin.jvm.internal.o.h(p02, "make(...)");
        p02.I().setBackgroundColor(0);
        View inflate = LayoutInflater.from(view.getContext()).inflate(t0.I2, (ViewGroup) null);
        Glide.u(view.getContext()).r(image).B0((ImageView) inflate.findViewById(t9.r0.f70030p5));
        View I = p02.I();
        kotlin.jvm.internal.o.g(I, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) I;
        ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
        kotlin.jvm.internal.o.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i13 = (int) (16 * view.getResources().getDisplayMetrics().density);
        marginLayoutParams.setMargins(i13, 0, i13, i13);
        marginLayoutParams.height = -2;
        marginLayoutParams.width = -1;
        snackbarLayout.setLayoutParams(marginLayoutParams);
        snackbarLayout.setPadding(0, snackbarLayout.getPaddingTop(), 0, i12);
        inflate.setOnTouchListener(new e0(new androidx.core.view.y(view.getContext(), new b(p02, onClick))));
        p02.s(new a(snackbarLayout));
        snackbarLayout.removeAllViews();
        snackbarLayout.addView(inflate);
        p02.Z();
    }

    public static final boolean h(androidx.core.view.y gestureDetector, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.o.i(gestureDetector, "$gestureDetector");
        gestureDetector.a(motionEvent);
        return true;
    }

    public static final void i(View view, int i11, String message, int i12, g00.a<wz.p> onClick) {
        kotlin.jvm.internal.o.i(view, "view");
        kotlin.jvm.internal.o.i(message, "message");
        kotlin.jvm.internal.o.i(onClick, "onClick");
        Snackbar p02 = Snackbar.p0(view, "", i11);
        kotlin.jvm.internal.o.h(p02, "make(...)");
        p02.I().setBackgroundColor(0);
        View inflate = LayoutInflater.from(view.getContext()).inflate(t0.J2, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(t9.r0.f70100ua);
        if (textView != null) {
            textView.setText(message);
        }
        View I = p02.I();
        kotlin.jvm.internal.o.g(I, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) I;
        ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
        kotlin.jvm.internal.o.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i13 = (int) (16 * view.getResources().getDisplayMetrics().density);
        marginLayoutParams.setMargins(i13, 0, i13, i13);
        marginLayoutParams.height = -2;
        marginLayoutParams.width = -1;
        snackbarLayout.setLayoutParams(marginLayoutParams);
        snackbarLayout.setPadding(0, snackbarLayout.getPaddingTop(), 0, i12);
        inflate.setOnTouchListener(new d0(new androidx.core.view.y(view.getContext(), new d(p02, onClick))));
        p02.s(new c(snackbarLayout));
        snackbarLayout.removeAllViews();
        snackbarLayout.addView(inflate);
        p02.Z();
    }

    public static final boolean j(androidx.core.view.y gestureDetector, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.o.i(gestureDetector, "$gestureDetector");
        gestureDetector.a(motionEvent);
        return true;
    }

    public static final String k(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        String encode = URLEncoder.encode(str, "utf-8");
        kotlin.jvm.internal.o.h(encode, "encode(...)");
        return encode;
    }
}
