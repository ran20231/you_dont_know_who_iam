package com.forsale.adserver.view.screens.detailsScreen;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import b1.t1;
import b1.v1;
import coil.compose.AsyncImagePainter;
import com.forsale.adserver.utils.ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.adserver.utils.ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.adserver.utils.ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.adserver.utils.ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.DetailsModel;
import com.forsale.adserver.view.viewmodel.NewDetailsViewModel;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialPageSource;
import com.forsale.core.netowrk.downloadmanger.MediaType;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.layouts.PosterKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.forsale.ui.components.ads.AdsGeneralDetailsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import j0.d1;
import j0.e1;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: NewDetailsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class NewDetailsBottomSheet extends m {
    public static final a C = new a(null);
    public static final int D = 8;
    private static boolean E;
    private g00.l<? super CommercialPageSource, wz.p> A;
    private final androidx.activity.result.b<String> B;

    /* renamed from: f  reason: collision with root package name */
    public com.forsale.core.netowrk.downloadmanger.a f21204f;

    /* renamed from: g  reason: collision with root package name */
    private g00.l<? super Boolean, wz.p> f21205g;

    /* renamed from: h  reason: collision with root package name */
    private final wz.h f21206h;

    /* renamed from: i  reason: collision with root package name */
    private final wz.h f21207i;

    /* renamed from: j  reason: collision with root package name */
    private final wz.h f21208j;

    /* renamed from: x  reason: collision with root package name */
    private final wz.h f21209x;

    /* renamed from: y  reason: collision with root package name */
    public NewDetailsViewModel.a f21210y;

    /* renamed from: z  reason: collision with root package name */
    private final wz.h f21211z;

    /* compiled from: NewDetailsBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(AdsModel adsModel, String str, boolean z11, DetailsModel detailsModel, FragmentManager fragmentManager, g00.l<? super CommercialPageSource, wz.p> lVar, g00.l<? super Boolean, wz.p> isDialogShown) {
            kotlin.jvm.internal.o.i(detailsModel, "detailsModel");
            kotlin.jvm.internal.o.i(fragmentManager, "fragmentManager");
            kotlin.jvm.internal.o.i(isDialogShown, "isDialogShown");
            NewDetailsBottomSheet newDetailsBottomSheet = new NewDetailsBottomSheet();
            newDetailsBottomSheet.f21205g = isDialogShown;
            Bundle bundle = new Bundle();
            bundle.putParcelable("ad_model", adsModel);
            bundle.putString("ad_id", str);
            bundle.putBoolean("is_offer", z11);
            bundle.putParcelable("detailsModel", detailsModel);
            newDetailsBottomSheet.setArguments(bundle);
            newDetailsBottomSheet.S(lVar);
            newDetailsBottomSheet.show(fragmentManager, "new_details");
        }
    }

    public NewDetailsBottomSheet() {
        wz.h a11;
        wz.h a12;
        wz.h a13;
        wz.h a14;
        wz.h b11;
        a11 = kotlin.d.a(new g00.a<AdsModel>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$adsModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final AdsModel invoke() {
                Bundle arguments = NewDetailsBottomSheet.this.getArguments();
                if (arguments != null) {
                    return (AdsModel) arguments.getParcelable("ad_model");
                }
                return null;
            }
        });
        this.f21206h = a11;
        a12 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$adId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                Bundle arguments = NewDetailsBottomSheet.this.getArguments();
                if (arguments != null) {
                    return arguments.getString("ad_id");
                }
                return null;
            }
        });
        this.f21207i = a12;
        a13 = kotlin.d.a(new g00.a<Boolean>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$isOffer$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                Bundle arguments = NewDetailsBottomSheet.this.getArguments();
                Boolean valueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("is_offer")) : null;
                kotlin.jvm.internal.o.f(valueOf);
                return valueOf;
            }
        });
        this.f21208j = a13;
        a14 = kotlin.d.a(new g00.a<DetailsModel>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$detailsModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final DetailsModel invoke() {
                DetailsModel detailsModel;
                Bundle arguments = NewDetailsBottomSheet.this.getArguments();
                if (arguments != null) {
                    detailsModel = (DetailsModel) arguments.getParcelable("detailsModel");
                } else {
                    detailsModel = null;
                }
                kotlin.jvm.internal.o.f(detailsModel);
                return detailsModel;
            }
        });
        this.f21209x = a14;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtensions.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ NewDetailsBottomSheet f21214f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, NewDetailsBottomSheet newDetailsBottomSheet) {
                    super(fragment, bundle);
                    this.f21214f = newDetailsBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    kotlin.jvm.internal.o.i(key, "key");
                    kotlin.jvm.internal.o.i(modelClass, "modelClass");
                    kotlin.jvm.internal.o.i(handle, "handle");
                    NewDetailsViewModel a11 = this.f21214f.L().a(this.f21214f.I(), this.f21214f.H(), this.f21214f.O(), this.f21214f.J());
                    kotlin.jvm.internal.o.g(a11, "null cannot be cast to non-null type T of com.forsale.adserver.utils.ViewModelHiltExtensionsKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
                    return a11;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.f21211z = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(NewDetailsViewModel.class), new ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        androidx.activity.result.b<String> registerForActivityResult = registerForActivityResult(new e.c(), new androidx.activity.result.a<Boolean>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$requestPermissionLauncher$1
            @Override // androidx.activity.result.a
            /* renamed from: b */
            public final void a(Boolean bool) {
                NewDetailsViewModel M;
                String h11;
                kotlin.jvm.internal.o.f(bool);
                if (bool.booleanValue()) {
                    M = NewDetailsBottomSheet.this.M();
                    AdsModel value = M.L().getValue();
                    if (value != null && (h11 = value.h()) != null) {
                        final NewDetailsBottomSheet newDetailsBottomSheet = NewDetailsBottomSheet.this;
                        newDetailsBottomSheet.K().d(h11, MediaType.IMAGE, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002e: INVOKE  
                              (wrap: com.forsale.core.netowrk.downloadmanger.a : 0x0023: INVOKE  (r1v0 com.forsale.core.netowrk.downloadmanger.a A[REMOVE]) = (r0v0 'newDetailsBottomSheet' com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet) type: VIRTUAL call: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.K():com.forsale.core.netowrk.downloadmanger.a)
                              (r5v7 'h11' java.lang.String)
                              (wrap: com.forsale.core.netowrk.downloadmanger.MediaType : 0x0027: SGET  (r2v0 com.forsale.core.netowrk.downloadmanger.MediaType A[REMOVE]) =  com.forsale.core.netowrk.downloadmanger.MediaType.IMAGE com.forsale.core.netowrk.downloadmanger.MediaType)
                              (wrap: g00.l<kotlin.Result<? extends com.forsale.core.netowrk.downloadmanger.DownloadStatus>, wz.p> : 0x002b: CONSTRUCTOR  (r3v0 g00.l<kotlin.Result<? extends com.forsale.core.netowrk.downloadmanger.DownloadStatus>, wz.p> A[REMOVE]) = (r0v0 'newDetailsBottomSheet' com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet A[DONT_INLINE]) call: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$requestPermissionLauncher$1$onActivityResult$1$1.<init>(com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet):void type: CONSTRUCTOR)
                             type: VIRTUAL call: com.forsale.core.netowrk.downloadmanger.a.d(java.lang.String, com.forsale.core.netowrk.downloadmanger.MediaType, g00.l):void in method: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$requestPermissionLauncher$1.b(java.lang.Boolean):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$requestPermissionLauncher$1$onActivityResult$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 31 more
                            */
                        /*
                            this = this;
                            kotlin.jvm.internal.o.f(r5)
                            boolean r5 = r5.booleanValue()
                            if (r5 == 0) goto L31
                            com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet r5 = com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.this
                            com.forsale.adserver.view.viewmodel.NewDetailsViewModel r5 = com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.C(r5)
                            kotlinx.coroutines.flow.StateFlow r5 = r5.L()
                            java.lang.Object r5 = r5.getValue()
                            com.forsale.adserver.view.models.AdsModel r5 = (com.forsale.adserver.view.models.AdsModel) r5
                            if (r5 == 0) goto L31
                            java.lang.String r5 = r5.h()
                            if (r5 == 0) goto L31
                            com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet r0 = com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.this
                            com.forsale.core.netowrk.downloadmanger.a r1 = r0.K()
                            com.forsale.core.netowrk.downloadmanger.MediaType r2 = com.forsale.core.netowrk.downloadmanger.MediaType.IMAGE
                            com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$requestPermissionLauncher$1$onActivityResult$1$1 r3 = new com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$requestPermissionLauncher$1$onActivityResult$1$1
                            r3.<init>(r0)
                            r1.d(r5, r2, r3)
                        L31:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$requestPermissionLauncher$1.a(java.lang.Boolean):void");
                    }
                });
                kotlin.jvm.internal.o.h(registerForActivityResult, "registerForActivityResult(...)");
                this.B = registerForActivityResult;
            }

            private final void G() {
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.t.a(this), null, null, new NewDetailsBottomSheet$bindObservers$1(this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.t.a(this), null, null, new NewDetailsBottomSheet$bindObservers$2(this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.t.a(this), null, null, new NewDetailsBottomSheet$bindObservers$3(this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.t.a(this), null, null, new NewDetailsBottomSheet$bindObservers$4(this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.t.a(this), null, null, new NewDetailsBottomSheet$bindObservers$5(this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.t.a(this), null, null, new NewDetailsBottomSheet$bindObservers$6(this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.t.a(this), null, null, new NewDetailsBottomSheet$bindObservers$7(this, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final NewDetailsViewModel M() {
                return (NewDetailsViewModel) this.f21211z.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void Q(CommercialPageSource commercialPageSource) {
                dismiss();
                g00.l<? super CommercialPageSource, wz.p> lVar = this.A;
                if (lVar != null) {
                    lVar.invoke(commercialPageSource);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final j9.f s(n1<? extends j9.f> n1Var) {
                return n1Var.getValue();
            }

            private static final boolean w(j0.k0<Boolean> k0Var) {
                return k0Var.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void x(j0.k0<Boolean> k0Var, boolean z11) {
                k0Var.setValue(Boolean.valueOf(z11));
            }

            public final String H() {
                return (String) this.f21207i.getValue();
            }

            public final AdsModel I() {
                return (AdsModel) this.f21206h.getValue();
            }

            public final DetailsModel J() {
                return (DetailsModel) this.f21209x.getValue();
            }

            public final com.forsale.core.netowrk.downloadmanger.a K() {
                com.forsale.core.netowrk.downloadmanger.a aVar = this.f21204f;
                if (aVar != null) {
                    return aVar;
                }
                kotlin.jvm.internal.o.w("downloadMediaInteractor");
                return null;
            }

            public final NewDetailsViewModel.a L() {
                NewDetailsViewModel.a aVar = this.f21210y;
                if (aVar != null) {
                    return aVar;
                }
                kotlin.jvm.internal.o.w("factory");
                return null;
            }

            public final boolean O() {
                return ((Boolean) this.f21208j.getValue()).booleanValue();
            }

            public final void S(g00.l<? super CommercialPageSource, wz.p> lVar) {
                this.A = lVar;
            }

            @Override // androidx.fragment.app.j
            public int getTheme() {
                return l8.i.f62352a;
            }

            @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                G();
            }

            @Override // androidx.fragment.app.Fragment
            public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
                kotlin.jvm.internal.o.i(inflater, "inflater");
                Context requireContext = requireContext();
                kotlin.jvm.internal.o.h(requireContext, "requireContext(...)");
                ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
                composeView.setContent(r0.b.c(-84002893, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$onCreateView$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar, int i11) {
                        if ((i11 & 11) == 2 && aVar.i()) {
                            aVar.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-84002893, i11, -1, "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.onCreateView.<anonymous>.<anonymous> (NewDetailsBottomSheet.kt:157)");
                        }
                        final NewDetailsBottomSheet newDetailsBottomSheet = NewDetailsBottomSheet.this;
                        ThemeKt.a(null, null, r0.b.b(aVar, -391274244, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$onCreateView$1$1.1
                            {
                                super(2);
                            }

                            private static final boolean c(n1<Boolean> n1Var) {
                                return n1Var.getValue().booleanValue();
                            }

                            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                                NewDetailsViewModel M;
                                if ((i12 & 11) == 2 && aVar2.i()) {
                                    aVar2.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(-391274244, i12, -1, "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.onCreateView.<anonymous>.<anonymous>.<anonymous> (NewDetailsBottomSheet.kt:158)");
                                }
                                M = NewDetailsBottomSheet.this.M();
                                n1 a11 = z.a(M.e0(), Boolean.FALSE, null, aVar2, 56, 2);
                                NewDetailsBottomSheet.this.r(aVar2, 8);
                                boolean c11 = c(a11);
                                final NewDetailsBottomSheet newDetailsBottomSheet2 = NewDetailsBottomSheet.this;
                                NewDetailsBottomSheetKt.a(c11, new g00.a<wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.onCreateView.1.1.1.1
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
                                        NewDetailsViewModel M2;
                                        M2 = NewDetailsBottomSheet.this.M();
                                        M2.I();
                                    }
                                }, aVar2, 0);
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                                b(aVar2, num.intValue());
                                return wz.p.f75480a;
                            }
                        }), aVar, 384, 3);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                        b(aVar, num.intValue());
                        return wz.p.f75480a;
                    }
                }));
                return composeView;
            }

            @Override // androidx.fragment.app.Fragment
            public void onDestroy() {
                E = false;
                g00.l<? super Boolean, wz.p> lVar = this.f21205g;
                if (lVar != null) {
                    lVar.invoke(false);
                }
                super.onDestroy();
            }

            @Override // androidx.fragment.app.Fragment
            public void onViewCreated(View view, Bundle bundle) {
                kotlin.jvm.internal.o.i(view, "view");
                super.onViewCreated(view, bundle);
                FirebaseAnalytics a11 = tn.a.a(zo.a.f77775a);
                tn.b bVar = new tn.b();
                bVar.b("screen_name", "commercial details");
                String simpleName = NewDetailsBottomSheet.class.getSimpleName();
                kotlin.jvm.internal.o.h(simpleName, "getSimpleName(...)");
                bVar.b("screen_class", simpleName);
                String H = H();
                if (H == null) {
                    AdsModel I = I();
                    if (I != null) {
                        H = Integer.valueOf(I.g()).toString();
                    } else {
                        H = null;
                    }
                }
                if (H != null) {
                    bVar.b("ad_id", H);
                }
                bVar.b("source", J().f().getValue());
                a11.a("screen_view", bVar.a());
            }

            public final void q(final n1<Boolean> showButton, androidx.compose.runtime.a aVar, final int i11) {
                kotlin.jvm.internal.o.i(showButton, "showButton");
                androidx.compose.runtime.a h11 = aVar.h(1593671444);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1593671444, i11, -1, "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.CheckAllOffersButton (NewDetailsBottomSheet.kt:361)");
                }
                final e2.d dVar = (e2.d) h11.q(CompositionLocalsKt.e());
                boolean booleanValue = showButton.getValue().booleanValue();
                h11.C(1157296644);
                boolean T = h11.T(dVar);
                Object D2 = h11.D();
                if (T || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new g00.l<Integer, Integer>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CheckAllOffersButton$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        public final Integer b(int i12) {
                            return Integer.valueOf(-e2.d.this.s0(e2.h.l(40)));
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                            return b(num.intValue());
                        }
                    };
                    h11.u(D2);
                }
                h11.S();
                AnimatedVisibilityKt.d(booleanValue, null, EnterExitTransitionKt.B(null, (g00.l) D2, 1, null).c(EnterExitTransitionKt.m(null, v0.b.f74009a.l(), false, null, 13, null)).c(EnterExitTransitionKt.o(null, 0.3f, 1, null)), EnterExitTransitionKt.E(null, null, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null)).c(EnterExitTransitionKt.q(null, 0.0f, 3, null)), null, r0.b.b(h11, -2079984660, true, new g00.q<q.c, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CheckAllOffersButton$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(3);
                    }

                    public final void b(q.c AnimatedVisibility, androidx.compose.runtime.a aVar2, int i12) {
                        kotlin.jvm.internal.o.i(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-2079984660, i12, -1, "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.CheckAllOffersButton.<anonymous> (NewDetailsBottomSheet.kt:377)");
                        }
                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                        androidx.compose.ui.c i13 = PaddingKt.i(SizeKt.h(aVar3, 0.0f, 1, null), e2.h.l(16));
                        final NewDetailsBottomSheet newDetailsBottomSheet = NewDetailsBottomSheet.this;
                        aVar2.C(693286680);
                        a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), aVar2, 0);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        j0.k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(i13);
                        if (!(aVar2.k() instanceof j0.d)) {
                            j0.e.c();
                        }
                        aVar2.I();
                        if (aVar2.f()) {
                            aVar2.y(a13);
                        } else {
                            aVar2.t();
                        }
                        androidx.compose.runtime.a a14 = Updater.a(aVar2);
                        Updater.c(a14, a11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b11);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        w.u uVar = w.u.f74924a;
                        ButtonsKt.j(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ea: INVOKE  
                              (wrap: g00.a<wz.p> : 0x00cc: CONSTRUCTOR  (r4v5 g00.a<wz.p> A[REMOVE]) = (r5v3 'newDetailsBottomSheet' com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet A[DONT_INLINE]) call: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CheckAllOffersButton$2$1$1.<init>(com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet):void type: CONSTRUCTOR)
                              (wrap: androidx.compose.ui.c : 0x00cf: INVOKE  (r1v2 androidx.compose.ui.c A[REMOVE]) = (r0v2 'aVar3' androidx.compose.ui.c$a), (0.0f float), (1 int), (null java.lang.Object) type: STATIC call: androidx.compose.foundation.layout.SizeKt.h(androidx.compose.ui.c, float, int, java.lang.Object):androidx.compose.ui.c)
                              (null com.forsale.designSystem.buttons.ButtonData)
                              (null yj.d)
                              false
                              false
                              (null v.k)
                              (wrap: g00.q<w.t, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x00da: INVOKE  (r8v1 g00.q<w.t, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                              (wrap: com.forsale.adserver.view.screens.detailsScreen.ComposableSingletons$NewDetailsBottomSheetKt : 0x00d8: SGET  (r0v3 com.forsale.adserver.view.screens.detailsScreen.ComposableSingletons$NewDetailsBottomSheetKt A[REMOVE]) =  com.forsale.adserver.view.screens.detailsScreen.ComposableSingletons$NewDetailsBottomSheetKt.a com.forsale.adserver.view.screens.detailsScreen.ComposableSingletons$NewDetailsBottomSheetKt)
                             type: VIRTUAL call: com.forsale.adserver.view.screens.detailsScreen.ComposableSingletons$NewDetailsBottomSheetKt.d():g00.q)
                              (r17v0 'aVar2' androidx.compose.runtime.a)
                              (12582960 int)
                              (124 int)
                             type: STATIC call: com.forsale.designSystem.buttons.ButtonsKt.j(g00.a, androidx.compose.ui.c, com.forsale.designSystem.buttons.ButtonData, yj.d, boolean, boolean, v.k, g00.q, androidx.compose.runtime.a, int, int):void in method: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CheckAllOffersButton$2.b(q.c, androidx.compose.runtime.a, int):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CheckAllOffersButton$2$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 15 more
                            */
                        /*
                            this = this;
                            r11 = r17
                            java.lang.String r0 = "$this$AnimatedVisibility"
                            r1 = r16
                            kotlin.jvm.internal.o.i(r1, r0)
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L1a
                            r0 = -1
                            java.lang.String r1 = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.CheckAllOffersButton.<anonymous> (NewDetailsBottomSheet.kt:377)"
                            r2 = -2079984660(0xffffffff8405f3ec, float:-1.5746078E-36)
                            r3 = r18
                            androidx.compose.runtime.c.U(r2, r3, r0, r1)
                        L1a:
                            androidx.compose.ui.c$a r0 = androidx.compose.ui.c.f7566a
                            r1 = 0
                            r2 = 1
                            r3 = 0
                            androidx.compose.ui.c r4 = androidx.compose.foundation.layout.SizeKt.h(r0, r1, r2, r3)
                            r5 = 16
                            float r5 = (float) r5
                            float r5 = e2.h.l(r5)
                            androidx.compose.ui.c r4 = androidx.compose.foundation.layout.PaddingKt.i(r4, r5)
                            r12 = r15
                            com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet r5 = com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.this
                            r6 = 693286680(0x2952b718, float:4.6788176E-14)
                            r11.C(r6)
                            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f3698a
                            androidx.compose.foundation.layout.Arrangement$e r6 = r6.g()
                            v0.b$a r7 = v0.b.f74009a
                            v0.b$c r7 = r7.l()
                            r8 = 0
                            androidx.compose.ui.layout.a0 r6 = androidx.compose.foundation.layout.o.a(r6, r7, r11, r8)
                            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
                            r11.C(r7)
                            int r7 = j0.e.a(r11, r8)
                            j0.k r9 = r17.s()
                            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.f8256m
                            g00.a r13 = r10.a()
                            g00.q r4 = androidx.compose.ui.layout.LayoutKt.c(r4)
                            j0.d r14 = r17.k()
                            boolean r14 = r14 instanceof j0.d
                            if (r14 != 0) goto L6b
                            j0.e.c()
                        L6b:
                            r17.I()
                            boolean r14 = r17.f()
                            if (r14 == 0) goto L78
                            r11.y(r13)
                            goto L7b
                        L78:
                            r17.t()
                        L7b:
                            androidx.compose.runtime.a r13 = androidx.compose.runtime.Updater.a(r17)
                            g00.p r14 = r10.e()
                            androidx.compose.runtime.Updater.c(r13, r6, r14)
                            g00.p r6 = r10.g()
                            androidx.compose.runtime.Updater.c(r13, r9, r6)
                            g00.p r6 = r10.b()
                            boolean r9 = r13.f()
                            if (r9 != 0) goto La5
                            java.lang.Object r9 = r13.D()
                            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
                            boolean r9 = kotlin.jvm.internal.o.d(r9, r10)
                            if (r9 != 0) goto Lb3
                        La5:
                            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                            r13.u(r9)
                            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                            r13.p(r7, r6)
                        Lb3:
                            androidx.compose.runtime.a r6 = j0.e1.b(r17)
                            j0.e1 r6 = j0.e1.a(r6)
                            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                            r4.invoke(r6, r11, r7)
                            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
                            r11.C(r4)
                            w.u r4 = w.u.f74924a
                            com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CheckAllOffersButton$2$1$1 r4 = new com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CheckAllOffersButton$2$1$1
                            r4.<init>(r5)
                            androidx.compose.ui.c r1 = androidx.compose.foundation.layout.SizeKt.h(r0, r1, r2, r3)
                            r2 = 0
                            r3 = 0
                            r5 = 0
                            r6 = 0
                            r7 = 0
                            com.forsale.adserver.view.screens.detailsScreen.ComposableSingletons$NewDetailsBottomSheetKt r0 = com.forsale.adserver.view.screens.detailsScreen.ComposableSingletons$NewDetailsBottomSheetKt.f21136a
                            g00.q r8 = r0.d()
                            r9 = 12582960(0xc00030, float:1.7632483E-38)
                            r10 = 124(0x7c, float:1.74E-43)
                            r0 = r4
                            r4 = r5
                            r5 = r6
                            r6 = r7
                            r7 = r8
                            r8 = r17
                            com.forsale.designSystem.buttons.ButtonsKt.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                            r17.S()
                            r17.w()
                            r17.S()
                            r17.S()
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L102
                            androidx.compose.runtime.c.T()
                        L102:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CheckAllOffersButton$2.b(q.c, androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ wz.p invoke(q.c cVar, androidx.compose.runtime.a aVar2, Integer num) {
                        b(cVar, aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), h11, 199680, 18);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CheckAllOffersButton$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            NewDetailsBottomSheet.this.q(showButton, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                }
            }

            public final void r(androidx.compose.runtime.a aVar, final int i11) {
                androidx.compose.runtime.a h11 = aVar.h(-92839185);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-92839185, i11, -1, "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.CommercialDetails (NewDetailsBottomSheet.kt:193)");
                }
                final AdsModel adsModel = (AdsModel) z.b(M().L(), null, h11, 8, 1).getValue();
                final List list = (List) z.b(M().c0(), null, h11, 8, 1).getValue();
                final boolean booleanValue = ((Boolean) z.a(M().f0(), Boolean.FALSE, null, h11, 56, 2).getValue()).booleanValue();
                final n1 b11 = z.b(M().g0(), null, h11, 8, 1);
                h11.C(773894976);
                h11.C(-492369756);
                Object D2 = h11.D();
                a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
                if (D2 == c0064a.a()) {
                    androidx.compose.runtime.f fVar = new androidx.compose.runtime.f(j0.u.j(EmptyCoroutineContext.f61739a, h11));
                    h11.u(fVar);
                    D2 = fVar;
                }
                h11.S();
                ((androidx.compose.runtime.f) D2).a();
                h11.S();
                final LazyGridState b12 = LazyGridStateKt.b(0, 0, h11, 0, 3);
                h11.C(1157296644);
                boolean T = h11.T(b12);
                Object D3 = h11.D();
                if (T || D3 == c0064a.a()) {
                    D3 = new NewDetailsBottomSheet$CommercialDetails$scrollAction$1$1(b12, null);
                    h11.u(D3);
                }
                h11.S();
                final g00.l lVar = (g00.l) D3;
                h11.C(-492369756);
                Object D4 = h11.D();
                if (D4 == c0064a.a()) {
                    D4 = z.d(new g00.a<Boolean>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialDetails$showButton$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // g00.a
                        public final Boolean invoke() {
                            return Boolean.valueOf(LazyGridState.this.p() > 20);
                        }
                    });
                    h11.u(D4);
                }
                h11.S();
                final n1 n1Var = (n1) D4;
                h11.C(-492369756);
                Object D5 = h11.D();
                if (D5 == c0064a.a()) {
                    D5 = t1.g(v1.d(4279442469L));
                    h11.u(D5);
                }
                h11.S();
                final long y11 = ((t1) D5).y();
                h11.C(-492369756);
                Object D6 = h11.D();
                if (D6 == c0064a.a()) {
                    D6 = t1.g(v1.d(4280231728L));
                    h11.u(D6);
                }
                h11.S();
                final long y12 = ((t1) D6).y();
                ThemeKt.a(null, null, r0.b.b(h11, -603581050, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialDetails$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-603581050, i12, -1, "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.CommercialDetails.<anonymous> (NewDetailsBottomSheet.kt:210)");
                        }
                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                        androidx.compose.ui.c b13 = BackgroundKt.b(SizeKt.f(aVar3, 0.0f, 1, null), y12, null, 2, null);
                        LazyGridState lazyGridState = b12;
                        final NewDetailsBottomSheet newDetailsBottomSheet = this;
                        n1<Boolean> n1Var2 = n1Var;
                        final boolean z11 = booleanValue;
                        final List<AdsModel> list2 = list;
                        final AdsModel adsModel2 = adsModel;
                        final n1<j9.f> n1Var3 = b11;
                        final long j11 = y11;
                        final g00.l<zz.a<? super wz.p>, Object> lVar2 = lVar;
                        aVar2.C(-483455358);
                        Arrangement arrangement = Arrangement.f3698a;
                        a0 a11 = androidx.compose.foundation.layout.e.a(arrangement.h(), v0.b.f74009a.k(), aVar2, 0);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        j0.k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(b13);
                        if (!(aVar2.k() instanceof j0.d)) {
                            j0.e.c();
                        }
                        aVar2.I();
                        if (aVar2.f()) {
                            aVar2.y(a13);
                        } else {
                            aVar2.t();
                        }
                        androidx.compose.runtime.a a14 = Updater.a(aVar2);
                        Updater.c(a14, a11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, wz.p> b14 = companion.b();
                        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b14);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        w.f fVar2 = w.f.f74891a;
                        AdsGeneralDetailsKt.a(p1.g.b(l8.h.f62333b, aVar2, 0), 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0113: INVOKE  
                              (wrap: java.lang.String : 0x00f1: INVOKE  (r1v6 java.lang.String A[REMOVE]) = (wrap: int : 0x00ef: SGET  (r1v5 int A[REMOVE]) =  l8.h.b int), (r26v0 'aVar2' androidx.compose.runtime.a), (0 int) type: STATIC call: p1.g.b(int, androidx.compose.runtime.a, int):java.lang.String)
                              (wrap: g00.a<wz.p> : 0x00f7: CONSTRUCTOR  (r2v11 g00.a<wz.p> A[REMOVE]) = (r13v0 'newDetailsBottomSheet' com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet A[DONT_INLINE]) call: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialDetails$1$1$1.<init>(com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet):void type: CONSTRUCTOR)
                              (wrap: g00.a<wz.p> : 0x00fc: CONSTRUCTOR  (r3v5 g00.a<wz.p> A[REMOVE]) = (r13v0 'newDetailsBottomSheet' com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet A[DONT_INLINE]) call: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialDetails$1$1$2.<init>(com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet):void type: CONSTRUCTOR)
                              (wrap: g00.a<wz.p> : 0x0101: CONSTRUCTOR  (r4v5 g00.a<wz.p> A[REMOVE]) = (r13v0 'newDetailsBottomSheet' com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet A[DONT_INLINE]) call: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialDetails$1$1$3.<init>(com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet):void type: CONSTRUCTOR)
                              (r26v0 'aVar2' androidx.compose.runtime.a)
                              (0 int)
                             type: STATIC call: com.forsale.ui.components.ads.AdsGeneralDetailsKt.a(java.lang.String, g00.a, g00.a, g00.a, androidx.compose.runtime.a, int):void in method: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialDetails$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialDetails$1$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 19 more
                            */
                        /*
                            Method dump skipped, instructions count: 388
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialDetails$1.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), h11, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialDetails$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            NewDetailsBottomSheet.this.r(aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                }
            }

            @Override // androidx.fragment.app.j
            public void show(FragmentManager manager, String str) {
                kotlin.jvm.internal.o.i(manager, "manager");
                if (E) {
                    return;
                }
                super.show(manager, str);
                E = true;
                g00.l<? super Boolean, wz.p> lVar = this.f21205g;
                if (lVar != null) {
                    lVar.invoke(true);
                }
            }

            public final void t(final AdsModel ad2, final g00.l<? super zz.a<? super wz.p>, ? extends Object> scrollTopAction, androidx.compose.runtime.a aVar, final int i11) {
                androidx.compose.runtime.a aVar2;
                kotlin.jvm.internal.o.i(ad2, "ad");
                kotlin.jvm.internal.o.i(scrollTopAction, "scrollTopAction");
                androidx.compose.runtime.a h11 = aVar.h(1519371515);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1519371515, i11, -1, "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.CommercialItem (NewDetailsBottomSheet.kt:329)");
                }
                h11.C(-492369756);
                Object D2 = h11.D();
                a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
                if (D2 == c0064a.a()) {
                    D2 = c0.e(Boolean.FALSE, null, 2, null);
                    h11.u(D2);
                }
                h11.S();
                final j0.k0 k0Var = (j0.k0) D2;
                h11.C(773894976);
                h11.C(-492369756);
                Object D3 = h11.D();
                if (D3 == c0064a.a()) {
                    androidx.compose.runtime.f fVar = new androidx.compose.runtime.f(j0.u.j(EmptyCoroutineContext.f61739a, h11));
                    h11.u(fVar);
                    D3 = fVar;
                }
                h11.S();
                final CoroutineScope a11 = ((androidx.compose.runtime.f) D3).a();
                h11.S();
                Object h12 = ad2.h();
                if (h12 == null) {
                    h12 = Integer.valueOf(sj.d.A);
                }
                h11.C(1157296644);
                boolean T = h11.T(k0Var);
                Object D4 = h11.D();
                if (T || D4 == c0064a.a()) {
                    D4 = new g00.l<AsyncImagePainter.b.c, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialItem$painter$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(AsyncImagePainter.b.c it2) {
                            kotlin.jvm.internal.o.i(it2, "it");
                            NewDetailsBottomSheet.x(k0Var, true);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(AsyncImagePainter.b.c cVar) {
                            b(cVar);
                            return wz.p.f75480a;
                        }
                    };
                    h11.u(D4);
                }
                h11.S();
                g00.l lVar = (g00.l) D4;
                h11.C(1157296644);
                boolean T2 = h11.T(k0Var);
                Object D5 = h11.D();
                if (T2 || D5 == c0064a.a()) {
                    D5 = new g00.l<AsyncImagePainter.b.d, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialItem$painter$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(AsyncImagePainter.b.d it2) {
                            kotlin.jvm.internal.o.i(it2, "it");
                            NewDetailsBottomSheet.x(k0Var, false);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(AsyncImagePainter.b.d dVar) {
                            b(dVar);
                            return wz.p.f75480a;
                        }
                    };
                    h11.u(D5);
                }
                h11.S();
                AsyncImagePainter b11 = h5.d.b(h12, null, null, null, lVar, (g00.l) D5, null, null, 0, h11, 8, 462);
                h11.C(733328855);
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, h11, 0);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                j0.k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar3);
                if (!(h11.k() instanceof j0.d)) {
                    j0.e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a13);
                } else {
                    h11.t();
                }
                androidx.compose.runtime.a a14 = Updater.a(h11);
                Updater.c(a14, g11, companion.e());
                Updater.c(a14, s11, companion.g());
                g00.p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
                if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b12);
                }
                c11.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                h11.C(-2031215396);
                if (w(k0Var)) {
                    aVar2 = h11;
                    SurfaceKt.c(null, c0.g.c(e2.h.l(8)), 0L, 0L, null, 0.0f, ComposableSingletons$NewDetailsBottomSheetKt.f21136a.c(), h11, 1572864, 61);
                } else {
                    aVar2 = h11;
                }
                aVar2.S();
                PosterKt.b(b11, false, null, false, 0.0f, new g00.a<wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialItem$1$1

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: NewDetailsBottomSheet.kt */
                    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialItem$1$1$1", f = "NewDetailsBottomSheet.kt", l = {354}, m = "invokeSuspend")
                    /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialItem$1$1$1  reason: invalid class name */
                    /* loaded from: classes2.dex */
                    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

                        /* renamed from: a  reason: collision with root package name */
                        int f21265a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ g00.l<zz.a<? super wz.p>, Object> f21266b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(g00.l<? super zz.a<? super wz.p>, ? extends Object> lVar, zz.a<? super AnonymousClass1> aVar) {
                            super(2, aVar);
                            this.f21266b = lVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                            return new AnonymousClass1(this.f21266b, aVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object f11;
                            f11 = kotlin.coroutines.intrinsics.b.f();
                            int i11 = this.f21265a;
                            if (i11 != 0) {
                                if (i11 == 1) {
                                    kotlin.f.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                kotlin.f.b(obj);
                                g00.l<zz.a<? super wz.p>, Object> lVar = this.f21266b;
                                this.f21265a = 1;
                                if (lVar.invoke(this) == f11) {
                                    return f11;
                                }
                            }
                            return wz.p.f75480a;
                        }

                        @Override // g00.p
                        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        NewDetailsViewModel M;
                        M = NewDetailsBottomSheet.this.M();
                        M.j0(ad2, CommercialItemDetailsSource.COMMERCIAL_ITEM_DETAILS);
                        BuildersKt__Builders_commonKt.launch$default(a11, null, null, new AnonymousClass1(scrollTopAction, null), 3, null);
                    }
                }, aVar2, 48, 28);
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = aVar2.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialItem$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar4, int i12) {
                            NewDetailsBottomSheet.this.t(ad2, scrollTopAction, aVar4, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                            b(aVar4, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                }
            }

            public final void y(androidx.compose.runtime.a aVar, final int i11) {
                androidx.compose.runtime.a h11 = aVar.h(183977702);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(183977702, i11, -1, "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.SectionTitle (NewDetailsBottomSheet.kt:299)");
                }
                androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), 0.0f, e2.h.l(16), 0.0f, 0.0f, 13, null);
                Arrangement.f e11 = Arrangement.f3698a.e();
                h11.C(693286680);
                a0 a11 = androidx.compose.foundation.layout.o.a(e11, v0.b.f74009a.l(), h11, 6);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                j0.k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(m11);
                if (!(h11.k() instanceof j0.d)) {
                    j0.e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a13);
                } else {
                    h11.t();
                }
                androidx.compose.runtime.a a14 = Updater.a(h11);
                Updater.c(a14, a11, companion.e());
                Updater.c(a14, s11, companion.g());
                g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b11);
                }
                c11.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                w.u uVar = w.u.f74924a;
                SectionTitleKt.a(null, null, ComposableSingletons$NewDetailsBottomSheetKt.f21136a.a(), null, r0.b.b(h11, 194650750, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$SectionTitle$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(194650750, i12, -1, "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet.SectionTitle.<anonymous>.<anonymous> (NewDetailsBottomSheet.kt:314)");
                        }
                        final NewDetailsBottomSheet newDetailsBottomSheet = NewDetailsBottomSheet.this;
                        ButtonsKt.k(new g00.a<wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$SectionTitle$1$1.1
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
                                NewDetailsBottomSheet.this.Q(CommercialPageSource.COMMERCIAL_ITEM_DETAILS_PAGE_CHECK_ALL);
                            }
                        }, null, ButtonData.f40994a.c(), false, false, null, ComposableSingletons$NewDetailsBottomSheetKt.f21136a.b(), aVar2, (ButtonData.f40995b << 6) | 1572864, 58);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), null, h11, 24960, 43);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$SectionTitle$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            NewDetailsBottomSheet.this.y(aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                }
            }
        }
