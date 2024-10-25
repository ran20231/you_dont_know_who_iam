package com.forsale.app.features.categories.home.homelandingscreen.topbannerslider;

import android.content.Context;
import com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem;
import com.forsale.app.utils.z;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeTopSliderItem.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1", f = "HomeTopSliderItem.kt", l = {194, 207}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f24221a;

    /* renamed from: b  reason: collision with root package name */
    Object f24222b;

    /* renamed from: c  reason: collision with root package name */
    Object f24223c;

    /* renamed from: d  reason: collision with root package name */
    Object f24224d;

    /* renamed from: e  reason: collision with root package name */
    Object f24225e;

    /* renamed from: f  reason: collision with root package name */
    int f24226f;

    /* renamed from: g  reason: collision with root package name */
    private /* synthetic */ Object f24227g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ List<List<Integer>> f24228h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ HomeTopSliderItem.HomeTopSliderViewHolder f24229i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Context f24230j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ TopBannerSliderViewModel f24231x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ ArrayList<NativeCustomFormatAd> f24232y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeTopSliderItem.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1$2", f = "HomeTopSliderItem.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TopBannerSliderViewModel f24239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList<NativeCustomFormatAd> f24240c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TopBannerSliderViewModel topBannerSliderViewModel, ArrayList<NativeCustomFormatAd> arrayList, zz.a<? super AnonymousClass2> aVar) {
            super(2, aVar);
            this.f24239b = topBannerSliderViewModel;
            this.f24240c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass2(this.f24239b, this.f24240c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f24238a == 0) {
                f.b(obj);
                this.f24239b.h(new z.b(this.f24240c));
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1(List<? extends List<Integer>> list, HomeTopSliderItem.HomeTopSliderViewHolder homeTopSliderViewHolder, Context context, TopBannerSliderViewModel topBannerSliderViewModel, ArrayList<NativeCustomFormatAd> arrayList, zz.a<? super HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1> aVar) {
        super(2, aVar);
        this.f24228h = list;
        this.f24229i = homeTopSliderViewHolder;
        this.f24230j = context;
        this.f24231x = topBannerSliderViewModel;
        this.f24232y = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1 homeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1 = new HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1(this.f24228h, this.f24229i, this.f24230j, this.f24231x, this.f24232y, aVar);
        homeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1.f24227g = obj;
        return homeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d3 -> B:21:0x00d5). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
