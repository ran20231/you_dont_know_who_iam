package com.forsale.app.features.categories.home.homelandingscreen.commercialads;

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
/* compiled from: CommercialAdsViewModel.kt */
/* loaded from: classes2.dex */
public final class CommercialAdsViewModel implements b<p> {

    /* renamed from: a  reason: collision with root package name */
    private final LiveData<CategoryEntity> f24158a;

    /* renamed from: b  reason: collision with root package name */
    private final GAMRepository f24159b;

    /* renamed from: c  reason: collision with root package name */
    private final OneShotEventHandler<p> f24160c;

    /* renamed from: d  reason: collision with root package name */
    private final int f24161d;

    /* renamed from: e  reason: collision with root package name */
    private final g00.p<p, List<? extends Object>, p> f24162e;

    /* renamed from: f  reason: collision with root package name */
    private final OneShotEventHandler<p> f24163f;

    /* renamed from: g  reason: collision with root package name */
    private final b0<z> f24164g;

    /* renamed from: h  reason: collision with root package name */
    private final LiveData<Boolean> f24165h;

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<Boolean> f24166i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<List<CommercialGamViewModel>> f24167j;

    /* JADX WARN: Multi-variable type inference failed */
    public CommercialAdsViewModel(LiveData<CategoryEntity> category, GAMRepository gamRepository, OneShotEventHandler<p> scrollToStart, int i11, g00.p<? super p, ? super List<? extends Object>, p> pVar) {
        o.i(category, "category");
        o.i(gamRepository, "gamRepository");
        o.i(scrollToStart, "scrollToStart");
        this.f24158a = category;
        this.f24159b = gamRepository;
        this.f24160c = scrollToStart;
        this.f24161d = i11;
        this.f24162e = pVar;
        this.f24163f = new OneShotEventHandler<>(null, 0, 3, null);
        b0<z> b0Var = new b0<>();
        this.f24164g = b0Var;
        this.f24165h = Transformations.b(b0Var, new l<z, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsViewModel$showLoading$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(z zVar) {
                return Boolean.valueOf(zVar instanceof z.a);
            }
        });
        this.f24166i = Transformations.b(b0Var, new l<z, Boolean>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsViewModel$showContent$1
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
        this.f24167j = Transformations.b(b0Var, new l<z, List<CommercialGamViewModel>>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsViewModel$commercialBanners$1
            @Override // g00.l
            /* renamed from: b */
            public final List<CommercialGamViewModel> invoke(z zVar) {
                List<CommercialGamViewModel> n11;
                int y11;
                List<CommercialGamViewModel> f11;
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
                    arrayList.add(new CommercialGamViewModel(nativeCustomFormatAd, 0, null, 6, null));
                }
                f11 = q.f(arrayList);
                return f11;
            }
        });
    }

    public final AdManagerAdRequest a(int i11) {
        Integer num;
        GAMRepository gAMRepository = this.f24159b;
        CategoryEntity value = this.f24158a.getValue();
        if (value != null) {
            num = Integer.valueOf(value.getId());
        } else {
            num = null;
        }
        return gAMRepository.buildForCategoryAndPosition(num, Integer.valueOf(i11), null);
    }

    public final LiveData<CategoryEntity> b() {
        return this.f24158a;
    }

    public final LiveData<List<CommercialGamViewModel>> c() {
        return this.f24167j;
    }

    public final OneShotEventHandler<p> d() {
        return this.f24163f;
    }

    public final OneShotEventHandler<p> e() {
        return this.f24160c;
    }

    public final LiveData<Boolean> f() {
        return this.f24166i;
    }

    public final LiveData<Boolean> g() {
        return this.f24165h;
    }

    @Override // x9.b
    public int getViewType() {
        return this.f24161d;
    }

    public final boolean h() {
        return this.f24163f.k(p.f75480a);
    }

    public final void i(z state) {
        o.i(state, "state");
        this.f24164g.postValue(state);
    }

    public /* synthetic */ CommercialAdsViewModel(LiveData liveData, GAMRepository gAMRepository, OneShotEventHandler oneShotEventHandler, int i11, g00.p pVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(liveData, gAMRepository, oneShotEventHandler, (i12 & 8) != 0 ? r0.f70092u2 : i11, (i12 & 16) != 0 ? null : pVar);
    }
}
