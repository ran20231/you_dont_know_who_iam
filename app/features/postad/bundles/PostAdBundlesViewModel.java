package com.forsale.app.features.postad.bundles;

import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.Bundle;
import com.forsale.app.datalayer.network.responses.BundlesResponse;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.bundles.b;
import com.forsale.app.features.postad.bundles.d;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
import wz.p;
/* compiled from: PostAdBundlesViewModel.kt */
/* loaded from: classes2.dex */
public final class PostAdBundlesViewModel extends q0 {
    private final StateFlow<Boolean> A;
    private final MutableStateFlow<String> B;
    private final StateFlow<String> C;

    /* renamed from: a  reason: collision with root package name */
    private final PostAdViewModel f35004a;

    /* renamed from: b  reason: collision with root package name */
    private final BundlesInteractor f35005b;

    /* renamed from: c  reason: collision with root package name */
    private final RegionsRepository f35006c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<com.forsale.app.features.postad.bundles.b> f35007d;

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<com.forsale.app.features.postad.bundles.b> f35008e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableStateFlow<Bundle> f35009f;

    /* renamed from: g  reason: collision with root package name */
    private StateFlow<Bundle> f35010g;

    /* renamed from: h  reason: collision with root package name */
    private final Channel<com.forsale.app.features.postad.bundles.a> f35011h;

    /* renamed from: i  reason: collision with root package name */
    private final Flow<com.forsale.app.features.postad.bundles.a> f35012i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<com.forsale.app.features.postad.bundles.d> f35013j;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<com.forsale.app.features.postad.bundles.d> f35014x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableStateFlow<Integer> f35015y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<Integer> f35016z;

    /* compiled from: PostAdBundlesViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        PostAdBundlesViewModel a(PostAdViewModel postAdViewModel);
    }

    /* compiled from: PostAdBundlesViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35022a;

        static {
            int[] iArr = new int[BundlesResponse.NextStep.values().length];
            try {
                iArr[BundlesResponse.NextStep.CheckoutPage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f35022a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.c(th2);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PostAdBundlesViewModel f35027a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, PostAdBundlesViewModel postAdBundlesViewModel) {
            super(key);
            this.f35027a = postAdBundlesViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this.f35027a), null, null, new PostAdBundlesViewModel$loadBundles$handler$1$1(th2, this.f35027a, null), 3, null);
        }
    }

    public PostAdBundlesViewModel(PostAdViewModel postAdViewModel, BundlesInteractor bundlesInteractor, RegionsRepository regionsRepository) {
        o.i(postAdViewModel, "postAdViewModel");
        o.i(bundlesInteractor, "bundlesInteractor");
        o.i(regionsRepository, "regionsRepository");
        this.f35004a = postAdViewModel;
        this.f35005b = bundlesInteractor;
        this.f35006c = regionsRepository;
        MutableStateFlow<com.forsale.app.features.postad.bundles.b> MutableStateFlow = StateFlowKt.MutableStateFlow(b.C0393b.f35065a);
        this.f35007d = MutableStateFlow;
        this.f35008e = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Bundle> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f35009f = MutableStateFlow2;
        this.f35010g = FlowKt.asStateFlow(MutableStateFlow2);
        Channel<com.forsale.app.features.postad.bundles.a> Channel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f35011h = Channel$default;
        this.f35012i = FlowKt.receiveAsFlow(Channel$default);
        final MutableStateFlow<com.forsale.app.features.postad.bundles.d> MutableStateFlow3 = StateFlowKt.MutableStateFlow(d.c.f35075a);
        this.f35013j = MutableStateFlow3;
        this.f35014x = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.f35015y = MutableStateFlow4;
        this.f35016z = FlowKt.asStateFlow(MutableStateFlow4);
        this.A = FlowKt.stateIn(new Flow<Boolean>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f35018a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$special$$inlined$map$1$2", f = "PostAdBundlesViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f35019a;

                    /* renamed from: b  reason: collision with root package name */
                    int f35020b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f35019a = obj;
                        this.f35020b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f35018a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f35020b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f35020b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f35019a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f35020b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4c
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f35018a
                        com.forsale.app.features.postad.bundles.d r5 = (com.forsale.app.features.postad.bundles.d) r5
                        com.forsale.app.features.postad.bundles.d$c r2 = com.forsale.app.features.postad.bundles.d.c.f35075a
                        boolean r5 = kotlin.jvm.internal.o.d(r5, r2)
                        r5 = r5 ^ r3
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f35020b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4c
                        return r1
                    L4c:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, r0.a(this), SharingStarted.Companion.getEagerly(), Boolean.FALSE);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow(RegionEntity.Companion.createDefaultRegion().getRegionCodeAr());
        this.B = MutableStateFlow5;
        this.C = FlowKt.asStateFlow(MutableStateFlow5);
        D();
        E();
        x();
    }

    private final void D() {
        this.f35004a.E4(false);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdBundlesViewModel$initSelectedBundle$1(this, null), 3, null);
    }

    private final void E() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), new d(CoroutineExceptionHandler.Key, this), null, new PostAdBundlesViewModel$loadBundles$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(ListingDetailsEntity listingDetailsEntity, BundlesResponse.NextStep nextStep) {
        int i11;
        if (b.f35022a[nextStep.ordinal()] == 1) {
            this.f35013j.setValue(d.b.f35074a);
            i11 = y0.I0;
        } else {
            this.f35013j.setValue(d.a.f35073a);
            i11 = y0.H0;
        }
        this.f35004a.h3(listingDetailsEntity);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdBundlesViewModel$setNextPage$1(this, i11, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Bundle bundle) {
        this.f35004a.M4(new PostAdBundlesViewModel$setSelectedBundle$1(bundle, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdBundlesViewModel$clearSelectedBundle$1(this, null), 3, null);
    }

    private final void x() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO().plus(new c(CoroutineExceptionHandler.Key)), null, new PostAdBundlesViewModel$getCurrency$1(this, null), 2, null);
    }

    public final PostAdViewModel A() {
        return this.f35004a;
    }

    public final StateFlow<Bundle> B() {
        return this.f35010g;
    }

    public final StateFlow<Boolean> C() {
        return this.A;
    }

    public final void F(String title, String url) {
        o.i(title, "title");
        o.i(url, "url");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdBundlesViewModel$navigateToDoubleViewScreen$1(this, title, url, null), 3, null);
    }

    public final void G(Bundle bundle) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdBundlesViewModel$onBundleSelection$1(this, bundle, null), 3, null);
    }

    public final void H() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdBundlesViewModel$onNavigateUpClicked$1(this, null), 3, null);
    }

    public final void I(com.forsale.app.features.postad.bundles.d nextAction) {
        CreateEditAdvActionType createEditAdvActionType;
        CreateEditAdvActionType createEditAdvActionType2;
        o.i(nextAction, "nextAction");
        if (o.d(nextAction, d.a.f35073a)) {
            if (this.f35004a.q3()) {
                createEditAdvActionType2 = CreateEditAdvActionType.EDIT_BUNDLE_CHOOSE_ADDON_CLICKED;
            } else {
                createEditAdvActionType2 = CreateEditAdvActionType.ADD_BUNDLE_CHOOSE_ADDON_CLICKED;
            }
            PostAdViewModel.J3(this.f35004a, createEditAdvActionType2, null, null, null, this.f35010g.getValue(), 14, null);
        } else if (o.d(nextAction, d.b.f35074a)) {
            if (this.f35004a.q3()) {
                createEditAdvActionType = CreateEditAdvActionType.EDIT_BUNDLE_CHECKOUT_CLICKED;
            } else {
                createEditAdvActionType = CreateEditAdvActionType.ADD_BUNDLE_CHECKOUT_CLICKED;
            }
            PostAdViewModel.J3(this.f35004a, createEditAdvActionType, null, null, null, this.f35010g.getValue(), 14, null);
        } else {
            o.d(nextAction, d.c.f35075a);
        }
    }

    public final void J() {
        PostAdViewModel.J3(this.f35004a, CreateEditAdvActionType.BUNDLES_TO_OLD_EXPERIENCE_CLICKED, null, null, null, null, 30, null);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdBundlesViewModel$onOldExperienceClicked$1(this, null), 3, null);
    }

    public final void K() {
        E();
    }

    public final void r() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdBundlesViewModel$clearActionNavigation$1(this, null), 3, null);
    }

    public final Flow<com.forsale.app.features.postad.bundles.a> t() {
        return this.f35012i;
    }

    public final StateFlow<com.forsale.app.features.postad.bundles.b> v() {
        return this.f35008e;
    }

    public final StateFlow<String> w() {
        return this.C;
    }

    public final StateFlow<com.forsale.app.features.postad.bundles.d> y() {
        return this.f35014x;
    }

    public final StateFlow<Integer> z() {
        return this.f35016z;
    }
}
