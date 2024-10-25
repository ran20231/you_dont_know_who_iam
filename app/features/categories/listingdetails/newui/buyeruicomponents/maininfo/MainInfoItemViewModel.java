package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBase;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.l;
import com.github.mikephil.charting.utils.Utils;
import com.leanplum.core.BuildConfig;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
import wz.p;
import zz.a;
/* compiled from: MainInfoItemViewModel.kt */
/* loaded from: classes2.dex */
public final class MainInfoItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final ListingItemBase f27549a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveData<String> f27550b;

    /* renamed from: c  reason: collision with root package name */
    private final RegionsRepository f27551c;

    /* renamed from: d  reason: collision with root package name */
    private final ApplicationResourcesRepository f27552d;

    /* renamed from: e  reason: collision with root package name */
    private final CoroutineScope f27553e;

    /* renamed from: f  reason: collision with root package name */
    private final OneShotEventHandler<String> f27554f;

    /* renamed from: g  reason: collision with root package name */
    private final OneShotEventHandler<String> f27555g;

    /* renamed from: h  reason: collision with root package name */
    private final OneShotEventHandler<String> f27556h;

    /* renamed from: i  reason: collision with root package name */
    private final OneShotEventHandler<String> f27557i;

    /* renamed from: j  reason: collision with root package name */
    private final OneShotEventHandler<String> f27558j;

    /* renamed from: k  reason: collision with root package name */
    private final OneShotEventHandler<p> f27559k;

    public MainInfoItemViewModel(ListingItemBase listingItemBase, LiveData<String> titleSource, RegionsRepository regionsRepository, ApplicationResourcesRepository resourcesRepository, CoroutineScope coroutineScope) {
        o.i(titleSource, "titleSource");
        o.i(regionsRepository, "regionsRepository");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(coroutineScope, "coroutineScope");
        this.f27549a = listingItemBase;
        this.f27550b = titleSource;
        this.f27551c = regionsRepository;
        this.f27552d = resourcesRepository;
        this.f27553e = coroutineScope;
        this.f27554f = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27555g = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27556h = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27557i = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27558j = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27559k = new OneShotEventHandler<>(null, 0, 3, null);
        l(listingItemBase);
    }

    private final ListingItemBase k(ListingItemBase listingItemBase) {
        String valueOf;
        if (listingItemBase instanceof ListingItemDetails) {
            if (LocaleManager.f39597a.r()) {
                valueOf = l.a(String.valueOf(((ListingItemDetails) listingItemBase).getEncId()));
            } else {
                valueOf = String.valueOf(((ListingItemDetails) listingItemBase).getEncId());
            }
            this.f27558j.i(valueOf);
            this.f27557i.i(TypeExtensionsKt.j0(((ListingItemDetails) listingItemBase).getViewCount()));
            return listingItemBase;
        }
        this.f27557i.i(BuildConfig.BUILD_NUMBER);
        o.g(listingItemBase, "null cannot be cast to non-null type com.forsale.app.datalayer.network.responses.ListingItemBrief");
        return (ListingItemBrief) listingItemBase;
    }

    private final void l(ListingItemBase listingItemBase) {
        BuildersKt__Builders_commonKt.launch$default(this.f27553e, null, null, new MainInfoItemViewModel$loadItemData$1$1(this, k(listingItemBase), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i11, a<? super RegionEntity> aVar) {
        return this.f27551c.getRegion(kotlin.coroutines.jvm.internal.a.d(i11), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(ListingItemBase listingItemBase, RegionEntity regionEntity) {
        String str;
        String dateSort = listingItemBase.getDateSort();
        if (dateSort != null) {
            str = TypeExtensionsKt.n0(dateSort, regionEntity.getUtcDiff(), false, null, 4, null);
        } else {
            str = null;
        }
        this.f27556h.i(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(ListingItemBase listingItemBase, RegionEntity regionEntity) {
        Double d11;
        String str = null;
        if (listingItemBase != null) {
            d11 = Double.valueOf(listingItemBase.getPrice());
        } else {
            d11 = null;
        }
        if (!o.a(d11, Utils.DOUBLE_EPSILON)) {
            OneShotEventHandler<String> oneShotEventHandler = this.f27554f;
            if (listingItemBase != null) {
                str = o(listingItemBase.getPrice());
            }
            oneShotEventHandler.i(str);
            OneShotEventHandler<String> oneShotEventHandler2 = this.f27555g;
            String lowerCase = regionEntity.getCurrency().toLowerCase(Locale.ROOT);
            o.h(lowerCase, "toLowerCase(...)");
            oneShotEventHandler2.i(lowerCase);
            return;
        }
        this.f27554f.i(this.f27552d.getString(y0.U8, new Object[0]));
        this.f27555g.i("");
    }

    public final OneShotEventHandler<String> d() {
        return this.f27555g;
    }

    public final OneShotEventHandler<String> e() {
        return this.f27556h;
    }

    public final OneShotEventHandler<String> f() {
        return this.f27558j;
    }

    public final OneShotEventHandler<String> g() {
        return this.f27554f;
    }

    public final OneShotEventHandler<p> h() {
        return this.f27559k;
    }

    public final LiveData<String> i() {
        return this.f27550b;
    }

    public final OneShotEventHandler<String> j() {
        return this.f27557i;
    }

    public final boolean n(View view) {
        o.i(view, "view");
        this.f27559k.i(p.f75480a);
        return false;
    }

    public final String o(double d11) {
        return NumberFormat.getNumberInstance(new Locale(LocaleManager.f39597a.k())).format(d11);
    }
}
