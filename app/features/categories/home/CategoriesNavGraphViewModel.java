package com.forsale.app.features.categories.home;

import androidx.lifecycle.k0;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.home.homelandingscreen.VerticalRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsOwnerActions;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import wz.p;
/* compiled from: CategoriesNavGraphViewModel.kt */
/* loaded from: classes2.dex */
public final class CategoriesNavGraphViewModel extends BaseViewModel {
    public static final a A0 = new a(null);
    public static final int B0 = 8;

    /* renamed from: k0  reason: collision with root package name */
    private final k0 f23276k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ListingsService f23277l0;

    /* renamed from: m0  reason: collision with root package name */
    private final MutableSharedFlow<CategoryEntity> f23278m0;

    /* renamed from: n0  reason: collision with root package name */
    private final SharedFlow<CategoryEntity> f23279n0;

    /* renamed from: o0  reason: collision with root package name */
    private final MutableSharedFlow<Pair<CategoryEntity, SubCategoriesPosition>> f23280o0;

    /* renamed from: p0  reason: collision with root package name */
    private final SharedFlow<Pair<CategoryEntity, SubCategoriesPosition>> f23281p0;

    /* renamed from: q0  reason: collision with root package name */
    private final MutableSharedFlow<CategoryEntity> f23282q0;

    /* renamed from: r0  reason: collision with root package name */
    private final SharedFlow<CategoryEntity> f23283r0;

    /* renamed from: s0  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f23284s0;

    /* renamed from: t0  reason: collision with root package name */
    private final SharedFlow<Integer> f23285t0;

    /* renamed from: u0  reason: collision with root package name */
    private final MutableSharedFlow<AdsModel> f23286u0;

    /* renamed from: v0  reason: collision with root package name */
    private final SharedFlow<AdsModel> f23287v0;

    /* renamed from: w0  reason: collision with root package name */
    private final MutableSharedFlow<Pair<Integer, ListingDetailsOwnerActions>> f23288w0;

    /* renamed from: x0  reason: collision with root package name */
    private final SharedFlow<Pair<Integer, ListingDetailsOwnerActions>> f23289x0;

    /* renamed from: y0  reason: collision with root package name */
    private final MutableSharedFlow<p> f23290y0;

    /* renamed from: z0  reason: collision with root package name */
    private final SharedFlow<p> f23291z0;

    /* compiled from: CategoriesNavGraphViewModel.kt */
    @d(c = "com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$1", f = "CategoriesNavGraphViewModel.kt", l = {59, 62}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23292a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f23293b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CategoriesNavGraphViewModel.kt */
        @d(c = "com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$1$1", f = "CategoriesNavGraphViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02561 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23295a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CategoryEntity f23296b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ CategoriesNavGraphViewModel f23297c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02561(CategoryEntity categoryEntity, CategoriesNavGraphViewModel categoriesNavGraphViewModel, zz.a<? super C02561> aVar) {
                super(2, aVar);
                this.f23296b = categoryEntity;
                this.f23297c = categoriesNavGraphViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                return new C02561(this.f23296b, this.f23297c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.f23295a == 0) {
                    f.b(obj);
                    CategoryEntity categoryEntity = this.f23296b;
                    if (categoryEntity != null) {
                        this.f23297c.O0(categoryEntity);
                    }
                    return p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // g00.p
            public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                return ((C02561) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
            }
        }

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar);
            anonymousClass1.f23293b = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r7.f23292a
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.f.b(r8)
                goto L85
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                java.lang.Object r1 = r7.f23293b
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.f.b(r8)
                goto L6f
            L24:
                kotlin.f.b(r8)
                java.lang.Object r8 = r7.f23293b
                r1 = r8
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                com.forsale.app.features.categories.home.CategoriesNavGraphViewModel r8 = com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.this
                com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.G0(r8)
                com.forsale.app.features.categories.home.CategoriesNavGraphViewModel r8 = com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.this
                com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.E0(r8)
                com.forsale.app.features.categories.home.CategoriesNavGraphViewModel r8 = com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.this
                androidx.lifecycle.k0 r8 = com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.w0(r8)
                java.lang.String r5 = "categoryID"
                java.lang.Object r8 = r8.f(r5)
                r5 = r8
                java.lang.Integer r5 = (java.lang.Integer) r5
                if (r5 != 0) goto L48
                goto L4f
            L48:
                int r5 = r5.intValue()
                r6 = -1
                if (r5 == r6) goto L51
            L4f:
                r5 = r3
                goto L52
            L51:
                r5 = 0
            L52:
                if (r5 == 0) goto L55
                goto L56
            L55:
                r8 = r4
            L56:
                java.lang.Integer r8 = (java.lang.Integer) r8
                if (r8 == 0) goto L72
                com.forsale.app.features.categories.home.CategoriesNavGraphViewModel r5 = com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.this
                int r8 = r8.intValue()
                com.forsale.app.datalayer.repositories.CategoriesRepositories r5 = r5.s()
                r7.f23293b = r1
                r7.f23292a = r3
                java.lang.Object r8 = r5.getCategory(r8, r7)
                if (r8 != r0) goto L6f
                return r0
            L6f:
                com.forsale.app.datalayer.database.CategoryEntity r8 = (com.forsale.app.datalayer.database.CategoryEntity) r8
                goto L73
            L72:
                r8 = r4
            L73:
                com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$1$1 r3 = new com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$1$1
                com.forsale.app.features.categories.home.CategoriesNavGraphViewModel r5 = com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.this
                r3.<init>(r8, r5, r4)
                r7.f23293b = r4
                r7.f23292a = r2
                java.lang.Object r8 = com.forsale.app.utils.CoroutinesExtensionsKt.a(r1, r3, r7)
                if (r8 != r0) goto L85
                return r0
            L85:
                wz.p r8 = wz.p.f75480a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: CategoriesNavGraphViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CategoriesNavGraphViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        CategoriesNavGraphViewModel a(k0 k0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesNavGraphViewModel(k0 savedStateHandle, VerticalRepository verticalRepository, ListingsService listingsService, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(savedStateHandle, "savedStateHandle");
        o.i(verticalRepository, "verticalRepository");
        o.i(listingsService, "listingsService");
        o.i(baseRepository, "baseRepository");
        this.f23276k0 = savedStateHandle;
        this.f23277l0 = listingsService;
        MutableSharedFlow<CategoryEntity> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f23278m0 = MutableSharedFlow$default;
        this.f23279n0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<Pair<CategoryEntity, SubCategoriesPosition>> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f23280o0 = MutableSharedFlow$default2;
        this.f23281p0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<CategoryEntity> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f23282q0 = MutableSharedFlow$default3;
        this.f23283r0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<Integer> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f23284s0 = MutableSharedFlow$default4;
        this.f23285t0 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<AdsModel> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f23286u0 = MutableSharedFlow$default5;
        this.f23287v0 = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        MutableSharedFlow<Pair<Integer, ListingDetailsOwnerActions>> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f23288w0 = MutableSharedFlow$default6;
        this.f23289x0 = FlowKt.asSharedFlow(MutableSharedFlow$default6);
        MutableSharedFlow<p> MutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f23290y0 = MutableSharedFlow$default7;
        this.f23291z0 = FlowKt.asSharedFlow(MutableSharedFlow$default7);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r5 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r4 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P0() {
        /*
            r11 = this;
            androidx.lifecycle.k0 r0 = r11.f23276k0
            java.lang.String r1 = "listingAddons"
            java.lang.Object r0 = r0.f(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L1c
            int r4 = r0.intValue()
            r5 = -1
            if (r4 == r5) goto L18
            r4 = r1
            goto L19
        L18:
            r4 = r2
        L19:
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r0 = r3
        L1d:
            androidx.lifecycle.k0 r4 = r11.f23276k0
            java.lang.String r5 = "listingAction"
            java.lang.Object r4 = r4.f(r5)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L35
            int r5 = r4.length()
            if (r5 <= 0) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r2
        L32:
            if (r5 == 0) goto L35
            goto L36
        L35:
            r4 = r3
        L36:
            if (r0 == 0) goto L56
            r0.intValue()
            if (r4 != 0) goto L3e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            if (r1 != 0) goto L43
            r1 = r0
            goto L44
        L43:
            r1 = r3
        L44:
            if (r1 == 0) goto L56
            r1.intValue()
            r6 = 0
            r7 = 0
            com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$parseListingAddonsDeepLinking$2$1 r8 = new com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$parseListingAddonsDeepLinking$2$1
            r8.<init>(r11, r0, r4, r3)
            r9 = 3
            r10 = 0
            r5 = r11
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.P0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0() {
        /*
            r11 = this;
            androidx.lifecycle.k0 r0 = r11.f23276k0
            java.lang.String r1 = "advType"
            java.lang.Object r0 = r0.f(r1)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L1c
            int r4 = r0.length()
            if (r4 != 0) goto L17
            r4 = r1
            goto L18
        L17:
            r4 = r2
        L18:
            if (r4 != 0) goto L1c
            r6 = r0
            goto L1d
        L1c:
            r6 = r3
        L1d:
            androidx.lifecycle.k0 r0 = r11.f23276k0
            java.lang.String r4 = "advID"
            java.lang.Object r0 = r0.f(r4)
            r4 = r0
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L2b
            goto L32
        L2b:
            int r5 = r4.intValue()
            r7 = -1
            if (r5 == r7) goto L3d
        L32:
            if (r4 != 0) goto L35
            goto L3c
        L35:
            int r4 = r4.intValue()
            if (r4 != 0) goto L3c
            goto L3d
        L3c:
            r1 = r2
        L3d:
            if (r1 != 0) goto L40
            r3 = r0
        L40:
            r8 = r3
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L59
            int r9 = r8.intValue()
            r1 = 0
            r2 = 0
            com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$parseListingDeepLinking$1$1 r3 = new com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$parseListingDeepLinking$1$1
            r10 = 0
            r5 = r3
            r7 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r4 = 3
            r5 = 0
            r0 = r11
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.CategoriesNavGraphViewModel.Q0():void");
    }

    public final SharedFlow<p> H0() {
        return this.f23291z0;
    }

    public final SharedFlow<AdsModel> I0() {
        return this.f23287v0;
    }

    public final SharedFlow<CategoryEntity> J0() {
        return this.f23283r0;
    }

    public final SharedFlow<Integer> K0() {
        return this.f23285t0;
    }

    public final SharedFlow<Pair<Integer, ListingDetailsOwnerActions>> L0() {
        return this.f23289x0;
    }

    public final SharedFlow<Pair<CategoryEntity, SubCategoriesPosition>> M0() {
        return this.f23281p0;
    }

    public final SharedFlow<CategoryEntity> N0() {
        return this.f23279n0;
    }

    public final void O0(CategoryEntity category) {
        boolean z11;
        o.i(category, "category");
        if (category.getParentId() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CategoriesNavGraphViewModel$openCategory$1(z11, true, this, category, null), 3, null);
    }
}
