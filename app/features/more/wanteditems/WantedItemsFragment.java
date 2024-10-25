package com.forsale.app.features.more.wanteditems;

import aa.wa;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.w;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.datalayer.network.services.ItemSubscriptionsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.maincontainer.HomeToolbars;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.more.wanteditems.a;
import com.forsale.app.utils.FragmentsExtensionsKt;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import je.b;
import je.e;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.internal.http2.Http2;
import t9.p0;
import t9.q0;
import t9.y0;
import w3.a;
import wz.h;
import wz.p;
import z3.n;
/* compiled from: WantedItemsFragment.kt */
/* loaded from: classes2.dex */
public final class WantedItemsFragment extends je.a<wa, WantedItemsViewModel> {
    public static final a N = new a(null);
    public static final int O = 8;
    private final h E;
    private final int F;
    private final int G;
    public ApplicationResourcesRepository H;
    public CategoryDao I;
    public DistrictsRepository J;
    public ItemSubscriptionsService K;
    public BaseRepository L;
    private final h M;

    /* compiled from: WantedItemsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WantedItemsFragment() {
        final h b11;
        h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.wanteditems.WantedItemsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.wanteditems.WantedItemsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.E = FragmentViewModelLazyKt.b(this, s.b(WantedItemsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.wanteditems.WantedItemsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.wanteditems.WantedItemsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof l) {
                        lVar = (l) c11;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        return lVar.getDefaultViewModelCreationExtras();
                    }
                    return a.C0905a.f75031b;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.wanteditems.WantedItemsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof l) {
                    lVar = (l) c11;
                } else {
                    lVar = null;
                }
                if (lVar == null || (defaultViewModelProviderFactory = lVar.getDefaultViewModelProviderFactory()) == null) {
                    t0.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                    o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
        this.F = t9.t0.f70255m2;
        this.G = t9.t0.T5;
        a11 = d.a(new g00.a<b>() { // from class: com.forsale.app.features.more.wanteditems.WantedItemsFragment$wantedItemsAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final b invoke() {
                WantedItemsFragment wantedItemsFragment = WantedItemsFragment.this;
                CategoryDao Y = wantedItemsFragment.Y();
                DistrictsRepository a02 = WantedItemsFragment.this.a0();
                ApplicationResourcesRepository b02 = WantedItemsFragment.this.b0();
                BaseRepository X = WantedItemsFragment.this.X();
                final WantedItemsFragment wantedItemsFragment2 = WantedItemsFragment.this;
                g00.l<ItemSubscriptionResponse, p> lVar = new g00.l<ItemSubscriptionResponse, p>() { // from class: com.forsale.app.features.more.wanteditems.WantedItemsFragment$wantedItemsAdapter$2.1
                    {
                        super(1);
                    }

                    public final void b(ItemSubscriptionResponse it2) {
                        o.i(it2, "it");
                        WantedItemsFragment.this.j0(it2);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(ItemSubscriptionResponse itemSubscriptionResponse) {
                        b(itemSubscriptionResponse);
                        return p.f75480a;
                    }
                };
                final WantedItemsFragment wantedItemsFragment3 = WantedItemsFragment.this;
                return new b(wantedItemsFragment, Y, a02, b02, X, lVar, new g00.l<ItemSubscriptionResponse, p>() { // from class: com.forsale.app.features.more.wanteditems.WantedItemsFragment$wantedItemsAdapter$2.2
                    {
                        super(1);
                    }

                    public final void b(ItemSubscriptionResponse it2) {
                        o.i(it2, "it");
                        WantedItemsFragment.this.h0(it2);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(ItemSubscriptionResponse itemSubscriptionResponse) {
                        b(itemSubscriptionResponse);
                        return p.f75480a;
                    }
                });
            }
        });
        this.M = a11;
    }

    public final b d0() {
        return (b) this.M.getValue();
    }

    private final void e0() {
        t.a(this).b(new WantedItemsFragment$loadData$1(this, null));
    }

    public final void f0(CategoryEntity categoryEntity) {
        FragmentsExtensionsKt.a(this, a.d.b(com.forsale.app.features.more.wanteditems.a.f33797a, categoryEntity, null, null, 6, null));
    }

    static /* synthetic */ void g0(WantedItemsFragment wantedItemsFragment, CategoryEntity categoryEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            categoryEntity = null;
        }
        wantedItemsFragment.f0(categoryEntity);
    }

    public final void h0(ItemSubscriptionResponse itemSubscriptionResponse) {
        FragmentsExtensionsKt.a(this, com.forsale.app.features.more.wanteditems.a.f33797a.c(itemSubscriptionResponse));
    }

    private final void k0() {
        RecyclerView recyclerView = ((wa) m()).P;
        Context context = recyclerView.getContext();
        if (context != null) {
            o.f(context);
            i iVar = new i(context, 1);
            Drawable drawable = b0().getDrawable(q0.M);
            if (drawable != null) {
                iVar.f(drawable);
            }
            recyclerView.setAdapter(d0());
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.j(iVar);
        }
    }

    private final void l0() {
        k0();
        e0();
        ((wa) m()).O.setOnClickListener(new e(this));
    }

    public static final void m0(WantedItemsFragment this$0, View view) {
        o.i(this$0, "this$0");
        g0(this$0, null, 1, null);
    }

    @Override // com.forsale.app.base.fragments.b
    protected int G() {
        return this.G;
    }

    public final BaseRepository X() {
        BaseRepository baseRepository = this.L;
        if (baseRepository != null) {
            return baseRepository;
        }
        o.w("baseRepository");
        return null;
    }

    public final CategoryDao Y() {
        CategoryDao categoryDao = this.I;
        if (categoryDao != null) {
            return categoryDao;
        }
        o.w("categoryDao");
        return null;
    }

    public final DistrictsRepository a0() {
        DistrictsRepository districtsRepository = this.J;
        if (districtsRepository != null) {
            return districtsRepository;
        }
        o.w("districtRepo");
        return null;
    }

    public final ApplicationResourcesRepository b0() {
        ApplicationResourcesRepository applicationResourcesRepository = this.H;
        if (applicationResourcesRepository != null) {
            return applicationResourcesRepository;
        }
        o.w("resourcesRepository");
        return null;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: c0 */
    public WantedItemsViewModel B() {
        return (WantedItemsViewModel) this.E.getValue();
    }

    public final void i0() {
        e0();
    }

    public final void j0(ItemSubscriptionResponse itemSubscriptionResponse) {
        int i11;
        int[] iArr;
        n d11;
        o.i(itemSubscriptionResponse, "itemSubscriptionResponse");
        a.d dVar = com.forsale.app.features.more.wanteditems.a.f33797a;
        ListingsTypes listingsTypes = ListingsTypes.WANTED_ITEMS;
        String string = getString(y0.f2if);
        Integer categoryId = itemSubscriptionResponse.getCategoryId();
        if (categoryId != null) {
            i11 = categoryId.intValue();
        } else {
            i11 = -1;
        }
        String susbscriptionTxt = itemSubscriptionResponse.getSusbscriptionTxt();
        List<Integer> districtsIds = itemSubscriptionResponse.getDistrictsIds();
        if (districtsIds != null) {
            iArr = CollectionsKt___CollectionsKt.W0(districtsIds);
        } else {
            iArr = null;
        }
        d11 = dVar.d((r36 & 1) != 0 ? ListingsTypes.NORMAL_LISTINGS : listingsTypes, (r36 & 2) != 0 ? null : string, (r36 & 4) != 0 ? -1 : i11, (r36 & 8) != 0 ? null : susbscriptionTxt, (r36 & 16) != 0 ? null : iArr, (r36 & 32) != 0 ? null : null, (r36 & 64) != 0 ? AnalyticsListingsSource.MORE : null, (r36 & 128) != 0 ? null : null, (r36 & 256) != 0 ? -1 : 0, (r36 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? 0 : -1, (r36 & 1024) != 0, (r36 & RecyclerView.l.FLAG_MOVED) != 0 ? p0.f69709i : 0, (r36 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? SearchSource.SEARCH_BAR : null, (r36 & 8192) != 0 ? 0 : 0, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? HomeToolbars.SUB_CATEGORY_TOOLBAR : null, (r36 & 32768) == 0 ? false : false, (r36 & 65536) != 0 ? null : null);
        androidx.navigation.fragment.a.a(this).d0(d11);
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.F;
    }

    @v9.a(viewId = {ActionViewsMode.MESSAGE_ERROR, ActionViewsMode.ERROR_REFRESH})
    public final void onError(View view) {
        o.i(view, "view");
        e0();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        MainContainerActivity mainContainerActivity;
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        l0();
        B().B0();
        w.c(this, "wanted Item changed", new g00.p<String, Bundle, p>() { // from class: com.forsale.app.features.more.wanteditems.WantedItemsFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String requestKey, Bundle bundle2) {
                o.i(requestKey, "requestKey");
                o.i(bundle2, "bundle");
                WantedItemsFragment.this.i0();
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(String str, Bundle bundle2) {
                b(str, bundle2);
                return p.f75480a;
            }
        });
        androidx.appcompat.app.d b11 = FragmentsExtensionsKt.b(this);
        if (b11 instanceof MainContainerActivity) {
            mainContainerActivity = (MainContainerActivity) b11;
        } else {
            mainContainerActivity = null;
        }
        if (mainContainerActivity != null) {
            Toolbar toolbar = ((wa) m()).R;
            o.h(toolbar, "toolbar");
            mainContainerActivity.Z1(toolbar);
        }
        w.c(this, "select_category_request_key", new g00.p<String, Bundle, p>() { // from class: com.forsale.app.features.more.wanteditems.WantedItemsFragment$onViewCreated$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String requestKey, Bundle bundle2) {
                CategoryEntity categoryEntity;
                o.i(requestKey, "requestKey");
                o.i(bundle2, "bundle");
                Parcelable parcelable = bundle2.getParcelable("Category_entity");
                if (parcelable instanceof CategoryEntity) {
                    categoryEntity = (CategoryEntity) parcelable;
                } else {
                    categoryEntity = null;
                }
                WantedItemsFragment.this.f0(categoryEntity);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(String str, Bundle bundle2) {
                b(str, bundle2);
                return p.f75480a;
            }
        });
    }
}
