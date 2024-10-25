package com.forsale.app.features.categories.home.homelandingscreen.commercialads;

import android.content.Context;
import com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsItem;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommercialAdsItem.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1$1$1$1$1", f = "CommercialAdsItem.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1$1$1$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super NativeCustomFormatAd>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24150a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CommercialAdsItem.ViewHolder f24151b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f24152c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CommercialAdsViewModel f24153d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f24154e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1$1$1$1$1(CommercialAdsItem.ViewHolder viewHolder, Context context, CommercialAdsViewModel commercialAdsViewModel, int i11, a<? super CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1$1$1$1$1> aVar) {
        super(2, aVar);
        this.f24151b = viewHolder;
        this.f24152c = context;
        this.f24153d = commercialAdsViewModel;
        this.f24154e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1$1$1$1$1(this.f24151b, this.f24152c, this.f24153d, this.f24154e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f24150a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            CommercialAdsItem.ViewHolder viewHolder = this.f24151b;
            Context context = this.f24152c;
            AdManagerAdRequest a11 = this.f24153d.a(this.f24154e);
            this.f24150a = 1;
            obj = viewHolder.m(context, a11, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super NativeCustomFormatAd> aVar) {
        return ((CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1$1$1$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
