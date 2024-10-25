package com.forsale.app.features.categories.home.homelandingscreen.topbannerslider;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.z;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
import wz.p;
import x9.b;
/* compiled from: TopBannerSliderViewModel.kt */
/* loaded from: classes2.dex */
public final class TopBannerSliderViewModel implements b<p> {

    /* renamed from: a  reason: collision with root package name */
    private final LiveData<CategoryEntity> f24246a;

    /* renamed from: b  reason: collision with root package name */
    private final GAMRepository f24247b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24248c;

    /* renamed from: d  reason: collision with root package name */
    private final g00.p<p, List<? extends Object>, p> f24249d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<z> f24250e;

    /* renamed from: f  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f24251f;

    /* renamed from: g  reason: collision with root package name */
    private final LiveData<Boolean> f24252g;

    /* renamed from: h  reason: collision with root package name */
    private final LiveData<Boolean> f24253h;

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<List<TopHomeBannerViewModel>> f24254i;

    /* JADX WARN: Multi-variable type inference failed */
    public TopBannerSliderViewModel(LiveData<CategoryEntity> category, GAMRepository gamRepository, int i11, g00.p<? super p, ? super List<? extends Object>, p> pVar) {
        o.i(category, "category");
        o.i(gamRepository, "gamRepository");
        this.f24246a = category;
        this.f24247b = gamRepository;
        this.f24248c = i11;
        this.f24249d = pVar;
        b0<z> b0Var = new b0<>();
        this.f24250e = b0Var;
        this.f24251f = new OneShotEventHandler<>(null, 0, 3, null);
        this.f24252g = Transformations.b(b0Var, new l<z, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.TopBannerSliderViewModel$showLoading$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(z zVar) {
                return Boolean.valueOf(zVar instanceof z.a);
            }
        });
        this.f24253h = Transformations.b(b0Var, new l<z, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.TopBannerSliderViewModel$showContent$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(z zVar) {
                boolean z11;
                if (zVar instanceof z.b) {
                    Object a11 = ((z.b) zVar).a();
                    o.g(a11, "null cannot be cast to non-null type kotlin.collections.List<com.google.android.gms.ads.nativead.NativeCustomFormatAd>");
                    if (!((List) a11).isEmpty()) {
                        z11 = true;
                        return Boolean.valueOf(z11);
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        });
        this.f24254i = Transformations.b(b0Var, new l<z, List<TopHomeBannerViewModel>>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.TopBannerSliderViewModel$topHomeBanners$1
            @Override // g00.l
            /* renamed from: b */
            public final List<TopHomeBannerViewModel> invoke(z zVar) {
                List<TopHomeBannerViewModel> n11;
                int y11;
                List<TopHomeBannerViewModel> f11;
                if (!(zVar instanceof z.b)) {
                    n11 = r.n();
                    return n11;
                }
                Object a11 = ((z.b) zVar).a();
                o.g(a11, "null cannot be cast to non-null type kotlin.collections.List<com.google.android.gms.ads.nativead.NativeCustomFormatAd?>");
                List<NativeCustomFormatAd> list = (List) a11;
                y11 = s.y(list, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (NativeCustomFormatAd nativeCustomFormatAd : list) {
                    arrayList.add(new TopHomeBannerViewModel(nativeCustomFormatAd));
                }
                f11 = q.f(arrayList);
                return f11;
            }
        });
    }

    public final AdManagerAdRequest a(int i11) {
        Integer num;
        GAMRepository gAMRepository = this.f24247b;
        CategoryEntity value = this.f24246a.getValue();
        if (value != null) {
            num = Integer.valueOf(value.getId());
        } else {
            num = null;
        }
        return gAMRepository.buildForCategoryAndPosition(num, Integer.valueOf(i11), null);
    }

    public final LiveData<CategoryEntity> b() {
        return this.f24246a;
    }

    public final b0<z> c() {
        return this.f24250e;
    }

    public final LiveData<Boolean> d() {
        return this.f24253h;
    }

    public final LiveData<Boolean> e() {
        return this.f24252g;
    }

    public final OneShotEventHandler<Boolean> f() {
        return this.f24251f;
    }

    public final LiveData<List<TopHomeBannerViewModel>> g() {
        return this.f24254i;
    }

    @Override // x9.b
    public int getViewType() {
        return this.f24248c;
    }

    public final void h(z topBannersState) {
        o.i(topBannersState, "topBannersState");
        this.f24250e.postValue(topBannersState);
    }

    public /* synthetic */ TopBannerSliderViewModel(LiveData liveData, GAMRepository gAMRepository, int i11, g00.p pVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(liveData, gAMRepository, (i12 & 4) != 0 ? r0.f70058r7 : i11, (i12 & 8) != 0 ? null : pVar);
    }
}
