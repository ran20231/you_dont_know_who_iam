package com.forsale.app.features.categories.home.homelandingscreen;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.items.commercial.CommercialFillerViewModel;
import com.forsale.app.utils.ErrorHandlingExtensionsKt;
import com.forsale.app.utils.analytics.FillerType;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.itemutils.TextHolder;
import com.forsale.app.utils.y;
import g00.l;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.p0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1", f = "VerticalViewModel.kt", l = {393}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$loadHotZoneAsync$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Throwable>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24003a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f24004b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f24005c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f24006d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f24007e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalViewModel.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1$1", f = "VerticalViewModel.kt", l = {394, 395, 396}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements l<zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24008a;

        /* renamed from: b  reason: collision with root package name */
        int f24009b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VerticalViewModel f24010c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f24011d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f24012e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VerticalViewModel.kt */
        @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1$1$1", f = "VerticalViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02621 extends SuspendLambda implements p<ListingsResponse, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f24013a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f24014b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ VerticalViewModel f24015c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f24016d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ CoroutineScope f24017e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02621(VerticalViewModel verticalViewModel, int i11, CoroutineScope coroutineScope, zz.a<? super C02621> aVar) {
                super(2, aVar);
                this.f24015c = verticalViewModel;
                this.f24016d = i11;
                this.f24017e = coroutineScope;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(ListingsResponse listingsResponse, zz.a<? super wz.p> aVar) {
                return ((C02621) create(listingsResponse, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C02621 c02621 = new C02621(this.f24015c, this.f24016d, this.f24017e, aVar);
                c02621.f24014b = obj;
                return c02621;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b0 b0Var;
                boolean z11;
                b0 b0Var2;
                List n11;
                b0 b0Var3;
                List e11;
                b0 b0Var4;
                boolean z12;
                int y11;
                b0 b0Var5;
                Object dVar;
                ?? F0;
                qc.b Q1;
                kotlin.coroutines.intrinsics.b.f();
                if (this.f24013a == 0) {
                    f.b(obj);
                    ListingsResponse listingsResponse = (ListingsResponse) this.f24014b;
                    b0<TextHolder> h12 = this.f24015c.h1();
                    ListingsResponse.UISettings.Label title = listingsResponse.getUiSettings().getPinningSettings().getTitle();
                    h12.postValue(new TextHolder(null, new TextHolder.LocalizedText(title.getAr(), title.getEn()), null, 5, null));
                    b0Var = this.f24015c.f23953n1;
                    ListingsResponse.UISettings.Label subtitle = listingsResponse.getUiSettings().getPinningSettings().getSubtitle();
                    b0Var.postValue(new TextHolder(null, new TextHolder.LocalizedText(subtitle.getAr(), subtitle.getEn()), null, 5, null));
                    ListingsResponse.Listings listings = listingsResponse.getListings();
                    List<ListingItemBrief> a11 = y.f40549a.a(this.f24016d, listings.getPinnedShuffleItems(), listings.getPinnedItems());
                    ListingsResponse.UISettings.PinningSettings.EmptyArtwork emptyArtwork = listingsResponse.getUiSettings().getPinningSettings().getEmptyArtwork();
                    List<ListingItemBrief> list = a11;
                    boolean z13 = false;
                    if (list != null && !list.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        b0Var4 = this.f24015c.f23957p1;
                        if (a11.size() >= 5) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        b0Var4.postValue(kotlin.coroutines.jvm.internal.a.a(z12));
                        if (listingsResponse.getTotalCommercialItems() > 0) {
                            z13 = true;
                        }
                        List<ListingItemBrief> list2 = a11;
                        VerticalViewModel verticalViewModel = this.f24015c;
                        y11 = s.y(list2, 10);
                        ArrayList arrayList = new ArrayList(y11);
                        for (ListingItemBrief listingItemBrief : list2) {
                            Q1 = verticalViewModel.Q1(listingItemBrief, listingsResponse.getUiSettings().getListingsSettings(), z13, ListingsTypes.HOT_ZONES);
                            arrayList.add(Q1);
                        }
                        ListingsResponse.UISettings.FillersSettings fillersSettings = listingsResponse.getUiSettings().getFillersSettings();
                        if (fillersSettings != null && fillersSettings.getPinned() != null) {
                            if (z13) {
                                dVar = new CommercialFillerViewModel(listingsResponse.getUiSettings(), new l<FillerType, wz.p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1$1$1$4$1$1
                                    public final void b(FillerType it2) {
                                        o.i(it2, "it");
                                    }

                                    @Override // g00.l
                                    public /* bridge */ /* synthetic */ wz.p invoke(FillerType fillerType) {
                                        b(fillerType);
                                        return wz.p.f75480a;
                                    }
                                });
                            } else {
                                dVar = new zc.d(listingsResponse.getUiSettings(), new l<FillerType, wz.p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1$1$1$4$1$2
                                    public final void b(FillerType it2) {
                                        o.i(it2, "it");
                                    }

                                    @Override // g00.l
                                    public /* bridge */ /* synthetic */ wz.p invoke(FillerType fillerType) {
                                        b(fillerType);
                                        return wz.p.f75480a;
                                    }
                                }, kotlin.coroutines.jvm.internal.a.d(p0.f69711k), PLFSource.HOT_ZONE_FILLER);
                            }
                            F0 = CollectionsKt___CollectionsKt.F0(arrayList, dVar);
                            if (F0 != 0) {
                                arrayList = F0;
                            }
                        }
                        b0Var5 = this.f24015c.f23949l1;
                        b0Var5.postValue(arrayList);
                    } else {
                        if (!((list == null || list.isEmpty()) ? true : true) || emptyArtwork == null) {
                            b0Var2 = this.f24015c.f23949l1;
                            n11 = r.n();
                            b0Var2.postValue(n11);
                        } else {
                            b0Var3 = this.f24015c.f23949l1;
                            final CoroutineScope coroutineScope = this.f24017e;
                            final VerticalViewModel verticalViewModel2 = this.f24015c;
                            e11 = q.e(new vc.b(emptyArtwork, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.loadHotZoneAsync.1.1.1.6

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* compiled from: VerticalViewModel.kt */
                                @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1$1$1$6$1", f = "VerticalViewModel.kt", l = {423}, m = "invokeSuspend")
                                /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1$1$1$6$1  reason: invalid class name and collision with other inner class name */
                                /* loaded from: classes2.dex */
                                public static final class C02631 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

                                    /* renamed from: a  reason: collision with root package name */
                                    int f24022a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ VerticalViewModel f24023b;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C02631(VerticalViewModel verticalViewModel, zz.a<? super C02631> aVar) {
                                        super(2, aVar);
                                        this.f24023b = verticalViewModel;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                                        return new C02631(this.f24023b, aVar);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object f11;
                                        MutableSharedFlow mutableSharedFlow;
                                        f11 = kotlin.coroutines.intrinsics.b.f();
                                        int i11 = this.f24022a;
                                        if (i11 != 0) {
                                            if (i11 == 1) {
                                                f.b(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            f.b(obj);
                                            mutableSharedFlow = this.f24023b.V0;
                                            PLFSource pLFSource = PLFSource.HOT_ZONE_EMPTY_FILLER;
                                            this.f24022a = 1;
                                            if (mutableSharedFlow.emit(pLFSource, this) == f11) {
                                                return f11;
                                            }
                                        }
                                        return wz.p.f75480a;
                                    }

                                    @Override // g00.p
                                    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                                        return ((C02631) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // g00.a
                                public /* bridge */ /* synthetic */ wz.p invoke() {
                                    invoke2();
                                    return wz.p.f75480a;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C02631(verticalViewModel2, null), 3, null);
                                }
                            }));
                            b0Var3.postValue(e11);
                        }
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalViewModel verticalViewModel, int i11, CoroutineScope coroutineScope, zz.a<? super AnonymousClass1> aVar) {
            super(1, aVar);
            this.f24010c = verticalViewModel;
            this.f24011d = i11;
            this.f24012e = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(zz.a<?> aVar) {
            return new AnonymousClass1(this.f24010c, this.f24011d, this.f24012e, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r7.f24009b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.f.b(r8)
                goto L6c
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                int r1 = r7.f24008a
                kotlin.f.b(r8)
                goto L59
            L23:
                kotlin.f.b(r8)
                goto L3b
            L27:
                kotlin.f.b(r8)
                com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r8 = r7.f24010c
                com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository r8 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.K0(r8)
                int r1 = r7.f24011d
                r7.f24009b = r4
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L3b
                return r0
            L3b:
                java.lang.Integer r8 = (java.lang.Integer) r8
                if (r8 == 0) goto L43
                int r4 = r8.intValue()
            L43:
                com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r8 = r7.f24010c
                com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository r8 = com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel.K0(r8)
                int r1 = r7.f24011d
                com.forsale.app.features.powerpins.ListingsScreenType r5 = com.forsale.app.features.powerpins.ListingsScreenType.HOT_ZONE
                r7.f24008a = r4
                r7.f24009b = r3
                java.lang.Object r8 = r8.b(r1, r5, r7)
                if (r8 != r0) goto L58
                return r0
            L58:
                r1 = r4
            L59:
                com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1$1$1 r3 = new com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1$1$1
                com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel r4 = r7.f24010c
                kotlinx.coroutines.CoroutineScope r5 = r7.f24012e
                r6 = 0
                r3.<init>(r4, r1, r5, r6)
                r7.f24009b = r2
                java.lang.Object r8 = com.forsale.app.utils.CoroutinesExtensionsKt.a(r8, r3, r7)
                if (r8 != r0) goto L6c
                return r0
            L6c:
                wz.p r8 = wz.p.f75480a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHotZoneAsync$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.l
        public final Object invoke(zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$loadHotZoneAsync$1(boolean z11, VerticalViewModel verticalViewModel, int i11, zz.a<? super VerticalViewModel$loadHotZoneAsync$1> aVar) {
        super(2, aVar);
        this.f24005c = z11;
        this.f24006d = verticalViewModel;
        this.f24007e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        VerticalViewModel$loadHotZoneAsync$1 verticalViewModel$loadHotZoneAsync$1 = new VerticalViewModel$loadHotZoneAsync$1(this.f24005c, this.f24006d, this.f24007e, aVar);
        verticalViewModel$loadHotZoneAsync$1.f24004b = obj;
        return verticalViewModel$loadHotZoneAsync$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24003a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            boolean z11 = this.f24005c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24006d, this.f24007e, (CoroutineScope) this.f24004b, null);
            this.f24003a = 1;
            obj = ErrorHandlingExtensionsKt.b(z11, anonymousClass1, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super Throwable> aVar) {
        return ((VerticalViewModel$loadHotZoneAsync$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
