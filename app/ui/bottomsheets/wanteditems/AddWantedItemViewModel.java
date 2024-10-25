package com.forsale.app.ui.bottomsheets.wanteditems;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.datalayer.network.services.ItemSubscriptionsService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.utils.LiveDataExtensions;
import com.forsale.app.utils.OneShotEventHandler;
import g00.l;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlin.text.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import wz.p;
/* compiled from: AddWantedItemViewModel.kt */
/* loaded from: classes3.dex */
public final class AddWantedItemViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final jj.b f39228k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ItemSubscriptionsService f39229l0;

    /* renamed from: m0  reason: collision with root package name */
    private final CategoryDao f39230m0;

    /* renamed from: n0  reason: collision with root package name */
    private b0<CategoryEntity> f39231n0;

    /* renamed from: o0  reason: collision with root package name */
    private b0<String> f39232o0;

    /* renamed from: p0  reason: collision with root package name */
    private final c0<CategoryEntity> f39233p0;

    /* renamed from: q0  reason: collision with root package name */
    private b0<String> f39234q0;

    /* renamed from: r0  reason: collision with root package name */
    private final LiveData<Boolean> f39235r0;

    /* renamed from: s0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39236s0;

    /* renamed from: t0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39237t0;

    /* renamed from: u0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39238u0;

    /* renamed from: v0  reason: collision with root package name */
    private final LiveData<Boolean> f39239v0;

    /* renamed from: w0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39240w0;

    /* renamed from: x0  reason: collision with root package name */
    private final b0<DistrictEntity> f39241x0;

    /* renamed from: y0  reason: collision with root package name */
    private final LiveData<String> f39242y0;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddWantedItemViewModel f39243a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, AddWantedItemViewModel addWantedItemViewModel) {
            super(key);
            this.f39243a = addWantedItemViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f39243a.J0().i(p.f75480a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddWantedItemViewModel(jj.b prefs, ItemSubscriptionsService itemSubscriptionsService, CategoryDao categoryDao, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(prefs, "prefs");
        o.i(itemSubscriptionsService, "itemSubscriptionsService");
        o.i(categoryDao, "categoryDao");
        o.i(baseRepository, "baseRepository");
        this.f39228k0 = prefs;
        this.f39229l0 = itemSubscriptionsService;
        this.f39230m0 = categoryDao;
        this.f39231n0 = new b0<>();
        this.f39232o0 = new b0<>();
        c0<CategoryEntity> c0Var = new c0<CategoryEntity>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel$observer$1
            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(CategoryEntity categoryEntity) {
                AddWantedItemViewModel addWantedItemViewModel = AddWantedItemViewModel.this;
                BuildersKt__Builders_commonKt.launch$default(addWantedItemViewModel, null, null, new AddWantedItemViewModel$observer$1$onChanged$1(categoryEntity, addWantedItemViewModel, null), 3, null);
            }
        };
        this.f39233p0 = c0Var;
        this.f39231n0.observeForever(c0Var);
        b0<String> b0Var = new b0<>();
        this.f39234q0 = b0Var;
        this.f39235r0 = LiveDataExtensions.a(this.f39231n0, b0Var, new g00.p<CategoryEntity, String, Boolean>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel$enableAdd$1
            @Override // g00.p
            /* renamed from: b */
            public final Boolean invoke(CategoryEntity categoryEntity, String str) {
                boolean z11;
                boolean v11;
                boolean z12 = false;
                if (str != null) {
                    v11 = s.v(str);
                    if (!v11) {
                        z11 = false;
                        if (z11 || categoryEntity != null) {
                            z12 = true;
                        }
                        return Boolean.valueOf(z12);
                    }
                }
                z11 = true;
                if (z11) {
                }
                z12 = true;
                return Boolean.valueOf(z12);
            }
        });
        this.f39236s0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39237t0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39238u0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39239v0 = Transformations.b(this.f39231n0, new l<CategoryEntity, Boolean>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel$isDistrictVisible$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(CategoryEntity categoryEntity) {
                boolean z11;
                if (categoryEntity != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
        this.f39240w0 = new OneShotEventHandler<>(null, 0, 3, null);
        b0<DistrictEntity> b0Var2 = new b0<>();
        this.f39241x0 = b0Var2;
        this.f39242y0 = Transformations.b(b0Var2, new l<DistrictEntity, String>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel$districtSelectedName$1
            @Override // g00.l
            /* renamed from: b */
            public final String invoke(DistrictEntity districtEntity) {
                if (districtEntity != null) {
                    return districtEntity.getName();
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(ItemSubscriptionResponse itemSubscriptionResponse) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AddWantedItemViewModel$logAnalytics$1(this, itemSubscriptionResponse, null), 3, null);
    }

    public final void A0() {
        this.f39231n0.postValue(null);
        this.f39241x0.postValue(null);
        this.f39234q0.postValue(null);
    }

    public final b0<CategoryEntity> B0() {
        return this.f39231n0;
    }

    public final b0<String> C0() {
        return this.f39232o0;
    }

    public final b0<DistrictEntity> D0() {
        return this.f39241x0;
    }

    public final OneShotEventHandler<p> E0() {
        return this.f39236s0;
    }

    public final OneShotEventHandler<p> G0() {
        return this.f39237t0;
    }

    public final LiveData<String> H0() {
        return this.f39242y0;
    }

    public final LiveData<Boolean> I0() {
        return this.f39235r0;
    }

    public final OneShotEventHandler<p> J0() {
        return this.f39238u0;
    }

    public final b0<String> K0() {
        return this.f39234q0;
    }

    public final OneShotEventHandler<p> L0() {
        return this.f39240w0;
    }

    public final LiveData<Boolean> M0() {
        return this.f39239v0;
    }

    public final void O0() {
        OneShotEventHandler.d(this.f39240w0, null, 1, null);
    }

    public final void P0() {
        OneShotEventHandler.d(this.f39236s0, null, 1, null);
    }

    public final void Q0(DistrictEntity it2) {
        o.i(it2, "it");
        this.f39241x0.postValue(it2);
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(new a(CoroutineExceptionHandler.Key, this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        this.f39231n0.removeObserver(this.f39233p0);
    }

    public final void z0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AddWantedItemViewModel$addWantedItem$1(this, null), 3, null);
    }
}
