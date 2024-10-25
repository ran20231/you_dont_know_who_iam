package com.forsale.app.features.categories.home.homelandingscreen.topbannerslider;

import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import com.forsale.app.utils.OneShotEventHandler;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.leanplum.internal.Constants;
import g00.l;
import java.util.List;
import kg.c;
/* compiled from: TopHomeBannerViewModel.kt */
/* loaded from: classes2.dex */
public final class TopHomeBannerViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final b0<NativeCustomFormatAd> f24258a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveData<String> f24259b;

    /* renamed from: c  reason: collision with root package name */
    private final LiveData<Boolean> f24260c;

    /* renamed from: d  reason: collision with root package name */
    private final OneShotEventHandler<List<c>> f24261d;

    public TopHomeBannerViewModel(NativeCustomFormatAd nativeCustomFormatAd) {
        b0<NativeCustomFormatAd> b0Var = new b0<>(nativeCustomFormatAd);
        this.f24258a = b0Var;
        this.f24259b = Transformations.b(b0Var, new l<NativeCustomFormatAd, String>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.TopHomeBannerViewModel$imageUrl$1
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
        this.f24260c = Transformations.b(b0Var, new l<NativeCustomFormatAd, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.TopHomeBannerViewModel$isPlaceHolder$1
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
        this.f24261d = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final b0<NativeCustomFormatAd> a() {
        return this.f24258a;
    }

    public final LiveData<String> b() {
        return this.f24259b;
    }

    public final LiveData<Boolean> c() {
        return this.f24260c;
    }

    public final void d() {
        NativeCustomFormatAd value = this.f24258a.getValue();
        if (value != null) {
            value.performClick(Constants.Keys.INBOX_IMAGE);
        }
    }
}
