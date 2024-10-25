package com.forsale.app.features.categories.home.homelandingscreen.commercialads;

import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.leanplum.internal.Constants;
import g00.l;
import java.util.List;
import kg.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.r0;
import wz.p;
import x9.b;
/* compiled from: CommercialGamViewModel.kt */
/* loaded from: classes2.dex */
public final class CommercialGamViewModel implements b<p> {

    /* renamed from: a  reason: collision with root package name */
    private final int f24171a;

    /* renamed from: b  reason: collision with root package name */
    private final g00.p<p, List<? extends Object>, p> f24172b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<NativeCustomFormatAd> f24173c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveData<String> f24174d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveData<Boolean> f24175e;

    /* renamed from: f  reason: collision with root package name */
    private final OneShotEventHandler<List<c>> f24176f;

    /* JADX WARN: Multi-variable type inference failed */
    public CommercialGamViewModel(NativeCustomFormatAd nativeCustomFormatAd, int i11, g00.p<? super p, ? super List<? extends Object>, p> pVar) {
        this.f24171a = i11;
        this.f24172b = pVar;
        b0<NativeCustomFormatAd> b0Var = new b0<>(nativeCustomFormatAd);
        this.f24173c = b0Var;
        this.f24174d = Transformations.b(b0Var, new l<NativeCustomFormatAd, String>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialGamViewModel$imageUrl$1
            @Override // g00.l
            /* renamed from: b */
            public final String invoke(NativeCustomFormatAd nativeCustomFormatAd2) {
                Uri uri;
                NativeAd.Image image;
                if (nativeCustomFormatAd2 != null && (image = nativeCustomFormatAd2.getImage(Constants.Keys.INBOX_IMAGE)) != null) {
                    uri = image.getUri();
                } else {
                    uri = null;
                }
                return String.valueOf(uri);
            }
        });
        this.f24175e = Transformations.b(b0Var, new l<NativeCustomFormatAd, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialGamViewModel$isPlaceHolder$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(NativeCustomFormatAd nativeCustomFormatAd2) {
                boolean z11;
                if (nativeCustomFormatAd2 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
        this.f24176f = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final b0<NativeCustomFormatAd> a() {
        return this.f24173c;
    }

    public final LiveData<String> b() {
        return this.f24174d;
    }

    public final OneShotEventHandler<List<c>> c() {
        return this.f24176f;
    }

    public final LiveData<Boolean> d() {
        return this.f24175e;
    }

    public final void e() {
        NativeCustomFormatAd value = this.f24173c.getValue();
        if (value != null) {
            value.performClick(Constants.Keys.INBOX_IMAGE);
            this.f24176f.k(GamActionUtilsKt.d(value));
        }
    }

    @Override // x9.b
    public int getViewType() {
        return this.f24171a;
    }

    public /* synthetic */ CommercialGamViewModel(NativeCustomFormatAd nativeCustomFormatAd, int i11, g00.p pVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeCustomFormatAd, (i12 & 2) != 0 ? r0.f70105v2 : i11, (i12 & 4) != 0 ? null : pVar);
    }
}
