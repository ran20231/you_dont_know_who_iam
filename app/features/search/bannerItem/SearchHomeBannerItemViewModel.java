package com.forsale.app.features.search.bannerItem;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.util.List;
import kotlin.jvm.internal.o;
import t9.r0;
import wz.p;
import x9.b;
/* compiled from: SearchHomeBannerItemViewModel.kt */
/* loaded from: classes2.dex */
public final class SearchHomeBannerItemViewModel implements b<p> {

    /* renamed from: a  reason: collision with root package name */
    private final GAMRepository f36969a;

    /* renamed from: b  reason: collision with root package name */
    private final g00.p<p, List<? extends Object>, p> f36970b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<Boolean> f36971c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveData<Boolean> f36972d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<Boolean> f36973e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveData<Boolean> f36974f;

    public SearchHomeBannerItemViewModel(GAMRepository gamRepository) {
        o.i(gamRepository, "gamRepository");
        this.f36969a = gamRepository;
        this.f36970b = new g00.p<p, List<? extends Object>, p>() { // from class: com.forsale.app.features.search.bannerItem.SearchHomeBannerItemViewModel$logAnalytics$1
            public final void b(p pVar, List<? extends Object> list) {
                o.i(pVar, "<anonymous parameter 0>");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(p pVar, List<? extends Object> list) {
                b(pVar, list);
                return p.f75480a;
            }
        };
        b0<Boolean> b0Var = new b0<>(Boolean.FALSE);
        this.f36971c = b0Var;
        this.f36972d = b0Var;
        b0<Boolean> b0Var2 = new b0<>(Boolean.TRUE);
        this.f36973e = b0Var2;
        this.f36974f = b0Var2;
    }

    private final void e(boolean z11) {
        this.f36971c.postValue(Boolean.valueOf(z11));
        this.f36973e.postValue(Boolean.valueOf(!z11));
    }

    public final LiveData<Boolean> a() {
        return this.f36972d;
    }

    public final LiveData<Boolean> b() {
        return this.f36974f;
    }

    public final AdManagerAdRequest c() {
        return this.f36969a.buildForSearchHome();
    }

    public final void d() {
        e(true);
    }

    public final void f() {
        e(false);
    }

    @Override // x9.b
    public int getViewType() {
        return r0.J8;
    }
}
