package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.datalayer.bannerdata.DisplayOrder;
import com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes;
import com.forsale.adserver.datalayer.bannerdata.Screens;
import com.forsale.adserver.usecases.BannersUseCase;
import com.forsale.adserver.usecases.a;
import com.forsale.adserver.usecases.d;
import j9.e;
import j9.f;
import kotlin.jvm.internal.o;
/* compiled from: BannerViewModel.kt */
/* loaded from: classes2.dex */
public final class BannerViewModel extends BaseViewModel {

    /* renamed from: b  reason: collision with root package name */
    private final BannersUseCase f21604b;

    /* renamed from: c  reason: collision with root package name */
    private final d f21605c;

    /* renamed from: d  reason: collision with root package name */
    private final a f21606d;

    /* renamed from: e  reason: collision with root package name */
    private final e<f> f21607e;

    public BannerViewModel(BannersUseCase bannersUseCase, d splashUseCase, a impressionsUseCase) {
        o.i(bannersUseCase, "bannersUseCase");
        o.i(splashUseCase, "splashUseCase");
        o.i(impressionsUseCase, "impressionsUseCase");
        this.f21604b = bannersUseCase;
        this.f21605c = splashUseCase;
        this.f21606d = impressionsUseCase;
        this.f21607e = new e<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[Catch: Exception -> 0x0032, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002e, B:23:0x0054, B:25:0x0060, B:26:0x0068), top: B:35:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002e, B:23:0x0054, B:25:0x0060, B:26:0x0068), top: B:35:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object k(g00.l<? super zz.a<? super T>, ? extends java.lang.Object> r5, g00.l<? super T, java.lang.Boolean> r6, zz.a<? super wz.p> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.adserver.view.viewmodel.BannerViewModel$loadDataHandlingStates$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.adserver.view.viewmodel.BannerViewModel$loadDataHandlingStates$1 r0 = (com.forsale.adserver.view.viewmodel.BannerViewModel$loadDataHandlingStates$1) r0
            int r1 = r0.f21612e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21612e = r1
            goto L18
        L13:
            com.forsale.adserver.view.viewmodel.BannerViewModel$loadDataHandlingStates$1 r0 = new com.forsale.adserver.view.viewmodel.BannerViewModel$loadDataHandlingStates$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f21610c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f21612e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f21609b
            r6 = r5
            g00.l r6 = (g00.l) r6
            java.lang.Object r5 = r0.f21608a
            com.forsale.adserver.view.viewmodel.BannerViewModel r5 = (com.forsale.adserver.view.viewmodel.BannerViewModel) r5
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L32
            goto L54
        L32:
            r6 = move-exception
            goto L75
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.f.b(r7)
            j9.e<j9.f> r7 = r4.f21607e
            j9.f$c r2 = j9.f.c.f60482a
            r7.postValue(r2)
            r0.f21608a = r4     // Catch: java.lang.Exception -> L73
            r0.f21609b = r6     // Catch: java.lang.Exception -> L73
            r0.f21612e = r3     // Catch: java.lang.Exception -> L73
            java.lang.Object r7 = r5.invoke(r0)     // Catch: java.lang.Exception -> L73
            if (r7 != r1) goto L53
            return r1
        L53:
            r5 = r4
        L54:
            java.lang.Object r6 = r6.invoke(r7)     // Catch: java.lang.Exception -> L32
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> L32
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Exception -> L32
            if (r6 == 0) goto L68
            j9.e<j9.f> r6 = r5.f21607e     // Catch: java.lang.Exception -> L32
            j9.f$a r7 = j9.f.a.f60480a     // Catch: java.lang.Exception -> L32
            r6.postValue(r7)     // Catch: java.lang.Exception -> L32
            goto L7f
        L68:
            j9.e<j9.f> r6 = r5.f21607e     // Catch: java.lang.Exception -> L32
            j9.f$d r0 = new j9.f$d     // Catch: java.lang.Exception -> L32
            r0.<init>(r7)     // Catch: java.lang.Exception -> L32
            r6.postValue(r0)     // Catch: java.lang.Exception -> L32
            goto L7f
        L73:
            r6 = move-exception
            r5 = r4
        L75:
            j9.e<j9.f> r5 = r5.f21607e
            j9.f$b r7 = new j9.f$b
            r7.<init>(r6)
            r5.postValue(r7)
        L7f:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.BannerViewModel.k(g00.l, g00.l, zz.a):java.lang.Object");
    }

    @Override // com.forsale.adserver.view.viewmodel.BaseViewModel
    public String e() {
        return "Banner_View_Model";
    }

    public final e<f> j() {
        return this.f21607e;
    }

    public final void l(Screens screen, int i11) {
        o.i(screen, "screen");
        f(new BannerViewModel$loadFixedBanners$1(this, new i9.a(screen, Integer.valueOf(i11), ScreenBannerTypes.FIXED_FOOTER, DisplayOrder.ASC), null));
    }

    public final void m(Screens screen) {
        o.i(screen, "screen");
        f(new BannerViewModel$loadHomeTopBanners$1(this, new i9.a(screen, null, ScreenBannerTypes.HOME_TOP, DisplayOrder.ASC), null));
    }

    public final void o(Screens screen, Integer num) {
        o.i(screen, "screen");
        f(new BannerViewModel$loadLandingBanner$1(this, new i9.a(screen, num, ScreenBannerTypes.LANDING_PAGE, DisplayOrder.ASC), null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.adserver.view.viewmodel.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
    }

    public final void p(Screens screen, int i11, boolean z11) {
        ScreenBannerTypes screenBannerTypes;
        o.i(screen, "screen");
        Integer valueOf = Integer.valueOf(i11);
        if (z11) {
            screenBannerTypes = ScreenBannerTypes.SLIDING_BIG;
        } else {
            screenBannerTypes = ScreenBannerTypes.SLIDING_SMALL;
        }
        f(new BannerViewModel$loadSingleSliding$1(this, new i9.a(screen, valueOf, screenBannerTypes, DisplayOrder.ASC), null));
    }

    public final void q(Screens screen, int i11, boolean z11) {
        ScreenBannerTypes screenBannerTypes;
        o.i(screen, "screen");
        Integer valueOf = Integer.valueOf(i11);
        if (z11) {
            screenBannerTypes = ScreenBannerTypes.HOME_SLIDING;
        } else {
            screenBannerTypes = ScreenBannerTypes.CATEGORIES_SLIDING;
        }
        f(new BannerViewModel$loadSliderBanners$1(this, new i9.a(screen, valueOf, screenBannerTypes, DisplayOrder.ASC), null));
    }
}
