package com.forsale.app.features.categories.home.homelandingscreen.topbannerslider;

import android.content.Context;
import com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem;
import com.forsale.app.utils.OneShotEventHandler;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeTopSliderItem.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1$1$1$1$1", f = "HomeTopSliderItem.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1$1$1$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super NativeCustomFormatAd>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24233a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HomeTopSliderItem.HomeTopSliderViewHolder f24234b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f24235c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TopBannerSliderViewModel f24236d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f24237e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1$1$1$1$1(HomeTopSliderItem.HomeTopSliderViewHolder homeTopSliderViewHolder, Context context, TopBannerSliderViewModel topBannerSliderViewModel, int i11, zz.a<? super HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1$1$1$1$1> aVar) {
        super(2, aVar);
        this.f24234b = homeTopSliderViewHolder;
        this.f24235c = context;
        this.f24236d = topBannerSliderViewModel;
        this.f24237e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1$1$1$1$1(this.f24234b, this.f24235c, this.f24236d, this.f24237e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f24233a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            HomeTopSliderItem.HomeTopSliderViewHolder homeTopSliderViewHolder = this.f24234b;
            Context context = this.f24235c;
            AdManagerAdRequest a11 = this.f24236d.a(this.f24237e);
            OneShotEventHandler<Boolean> f12 = this.f24236d.f();
            this.f24233a = 1;
            obj = homeTopSliderViewHolder.q(context, a11, f12, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super NativeCustomFormatAd> aVar) {
        return ((HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1$1$1$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
