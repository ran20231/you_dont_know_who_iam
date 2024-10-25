package com.forsale.app.features.more.wanteditems;

import androidx.databinding.ObservableBoolean;
import androidx.paging.PagedList;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.services.ItemSubscriptionsService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import jj.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: WantedItemsViewModel.kt */
/* loaded from: classes2.dex */
public final class WantedItemsViewModel extends BaseStatefulViewModel {

    /* renamed from: o0  reason: collision with root package name */
    public static final a f33778o0 = new a(null);

    /* renamed from: p0  reason: collision with root package name */
    public static final int f33779p0 = 8;

    /* renamed from: l0  reason: collision with root package name */
    private final b f33780l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ItemSubscriptionsService f33781m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ObservableBoolean f33782n0;

    /* compiled from: WantedItemsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemsViewModel(b prefs, ItemSubscriptionsService itemSubscriptionsService, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(prefs, "prefs");
        o.i(itemSubscriptionsService, "itemSubscriptionsService");
        o.i(baseRepository, "baseRepository");
        this.f33780l0 = prefs;
        this.f33781m0 = itemSubscriptionsService;
        this.f33782n0 = new ObservableBoolean(true);
    }

    private final PagedList.c C0() {
        return new PagedList.c.a().c(30).d(15).b(false).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D0(zz.a<? super com.forsale.app.features.more.wanteditems.WantedItemsDataSource> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.more.wanteditems.WantedItemsViewModel$wantedItemsDataSource$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.more.wanteditems.WantedItemsViewModel$wantedItemsDataSource$1 r0 = (com.forsale.app.features.more.wanteditems.WantedItemsViewModel$wantedItemsDataSource$1) r0
            int r1 = r0.f33796g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33796g = r1
            goto L18
        L13:
            com.forsale.app.features.more.wanteditems.WantedItemsViewModel$wantedItemsDataSource$1 r0 = new com.forsale.app.features.more.wanteditems.WantedItemsViewModel$wantedItemsDataSource$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f33794e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f33796g
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r1 = r0.f33793d
            androidx.databinding.ObservableBoolean r1 = (androidx.databinding.ObservableBoolean) r1
            java.lang.Object r2 = r0.f33792c
            kotlinx.coroutines.flow.MutableSharedFlow r2 = (kotlinx.coroutines.flow.MutableSharedFlow) r2
            java.lang.Object r3 = r0.f33791b
            androidx.lifecycle.b0 r3 = (androidx.lifecycle.b0) r3
            java.lang.Object r0 = r0.f33790a
            com.forsale.app.features.more.wanteditems.WantedItemsViewModel r0 = (com.forsale.app.features.more.wanteditems.WantedItemsViewModel) r0
            kotlin.f.b(r9)
            r4 = r1
            r7 = r3
            r3 = r2
            r2 = r7
            goto L6d
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L45:
            kotlin.f.b(r9)
            androidx.lifecycle.b0 r9 = r8.v0()
            kotlinx.coroutines.flow.MutableSharedFlow r2 = r8.g0()
            androidx.databinding.ObservableBoolean r4 = r8.f33782n0
            jj.b r5 = r8.f33780l0
            kj.b r5 = r5.c()
            r0.f33790a = r8
            r0.f33791b = r9
            r0.f33792c = r2
            r0.f33793d = r4
            r0.f33796g = r3
            java.lang.Object r0 = r5.a(r0)
            if (r0 != r1) goto L69
            return r1
        L69:
            r3 = r2
            r2 = r9
            r9 = r0
            r0 = r8
        L6d:
            r5 = r9
            java.lang.String r5 = (java.lang.String) r5
            com.forsale.app.datalayer.network.services.ItemSubscriptionsService r6 = r0.f33781m0
            com.forsale.app.features.more.wanteditems.WantedItemsDataSource r9 = new com.forsale.app.features.more.wanteditems.WantedItemsDataSource
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.wanteditems.WantedItemsViewModel.D0(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(zz.a<? super je.d> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.more.wanteditems.WantedItemsViewModel$dataSourceFactory$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.more.wanteditems.WantedItemsViewModel$dataSourceFactory$1 r0 = (com.forsale.app.features.more.wanteditems.WantedItemsViewModel$dataSourceFactory$1) r0
            int r1 = r0.f33785c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33785c = r1
            goto L18
        L13:
            com.forsale.app.features.more.wanteditems.WantedItemsViewModel$dataSourceFactory$1 r0 = new com.forsale.app.features.more.wanteditems.WantedItemsViewModel$dataSourceFactory$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f33783a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f33785c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            r0.f33785c = r3
            java.lang.Object r5 = r4.D0(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.forsale.app.features.more.wanteditems.WantedItemsDataSource r5 = (com.forsale.app.features.more.wanteditems.WantedItemsDataSource) r5
            je.d r0 = new je.d
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.wanteditems.WantedItemsViewModel.y0(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0(zz.a<? super androidx.lifecycle.LiveData<androidx.paging.PagedList<com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.more.wanteditems.WantedItemsViewModel$getWantedItems$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.more.wanteditems.WantedItemsViewModel$getWantedItems$1 r0 = (com.forsale.app.features.more.wanteditems.WantedItemsViewModel$getWantedItems$1) r0
            int r1 = r0.f33789d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33789d = r1
            goto L18
        L13:
            com.forsale.app.features.more.wanteditems.WantedItemsViewModel$getWantedItems$1 r0 = new com.forsale.app.features.more.wanteditems.WantedItemsViewModel$getWantedItems$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f33787b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f33789d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f33786a
            com.forsale.app.features.more.wanteditems.WantedItemsViewModel r0 = (com.forsale.app.features.more.wanteditems.WantedItemsViewModel) r0
            kotlin.f.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            r0.f33786a = r4
            r0.f33789d = r3
            java.lang.Object r5 = r4.y0(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            androidx.paging.DataSource$Factory r5 = (androidx.paging.DataSource.Factory) r5
            androidx.paging.PagedList$c r0 = r0.C0()
            androidx.paging.e r1 = new androidx.paging.e
            r1.<init>(r5, r0)
            androidx.lifecycle.LiveData r5 = r1.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.wanteditems.WantedItemsViewModel.A0(zz.a):java.lang.Object");
    }

    public final void B0() {
        AggregatedAllAnalyticsLoggerKt.w0(r(), AggregatedAllAnalyticsLogger.CustomEvents.SAVED_SEARCH_VISITED, true, true);
    }

    public final ObservableBoolean z0() {
        return this.f33782n0;
    }
}
